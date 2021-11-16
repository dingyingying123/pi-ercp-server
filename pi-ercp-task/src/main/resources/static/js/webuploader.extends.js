(function($) {
    $.WebUploaderExt = function(opts,_fileQueued,_callBack,_commit){
        var defaults = {
            // 不压缩image
            resize: false,
            compress:false,
            // swf文件路径
            swf:  app_path+'/plugins/webuploader/Uploader.swf',
            fileVal :'file'
        };
        $.extend(defaults,opts);

        var loading = new LoadingPop();
        var uploader = WebUploader.create(defaults);
        // 当有文件添加进来的时候
        uploader.on( 'fileQueued', function( file ) {
            if(_fileQueued && typeof  _fileQueued ==='function' ){
                _fileQueued(file);
            }
        });

        uploader.on( 'uploadSuccess', function( file,response  ) {
            loading.remove();
            if(_callBack && typeof  _callBack ==='function' ){
                _callBack(response);
            }
        });
        uploader.on( 'uploadFinished', function(  ) {
          // loading.remove();
            if(_commit && typeof  _commit ==='function' ){
                _commit();
            }
        });

        uploader.on( 'uploadError', function( file ,reason ) {
            loading.remove();
            layer.alert("上传失败，"+reason );
        });

        this.uploader = uploader;

        this.upload=function(){
            loading.show();
            uploader.upload();
        }
        return this;
    }
})(jQuery);