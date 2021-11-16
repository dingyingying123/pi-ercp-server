/**
 * Created by hufy on 2016/12/22.
 */
(function($) {

    var Paginate = function(element, options) {
        this.process_options(options);
        this.element = $(element);
        this.jumpElement = null;
        this.paginationElement = null;
        this.infoElement = null;
        this.initElement();
        this.populate();
    };

    Paginate.prototype = {
        constructor : Paginate,

        process_options : function(opts) {
            this.opts = jQuery.extend({
                total_count:0,
                page_count:1,
                page_no:1,
                prev_text:'&laquo;',
                next_text:'&raquo;',
                ellipse_text:"...",
                prev_show_always:true,
                next_show_always:true,
                edge_entry_num:1,
                page_before_num:2,
                page_after_num:3,
                callback:function(){return false;}
            },opts||{});
        },

        initElement: function(){
            var $thisElement = this.element;
            $thisElement.addClass("list_page");
            //增加select跳转
            this.jumpElement =$("<div class='jump' ><span>到第</span> <select ></select><span> 页</span></div>");
            $thisElement.append(this.jumpElement);
            //增加分页导航 pagination
            this.paginationElement = $("<ul class='pagination' role='pagination'></ul>");
            $thisElement.append(this.paginationElement);
            // 增加合计数量
            this.infoElement = $("<div class='info'><span></span></div>");
            $thisElement.append(this.infoElement);
        },
        populate:function(){
            this.populateInfo();
            this.populateJump();
            this.populatePagination()
        },

        populateInfo:function(){
            var $this = this;
            var $_span = this.infoElement.find("span");
            $_span.text("共"+$this.opts.total_count+"条/共"+$this.opts.page_count+"页");
        },

        populateJump:function(){
            var $this = this;
            var $_select = this.jumpElement.find("select");
            $_select.unbind("change");
            $_select.bind("change", function(){
                if($_select.val() != $this.opts.page_no){
                    $this.opts.callback(parseInt($_select.val()));
                }
            });

            $_select.empty();
            for(var i = 1;i<=$this.opts.page_count;i++){
                if(i==$this.opts.page_no){
                    $_select.append("<option selected='selected'>"+i+"</option>");
                }else{
                    $_select.append("<option>"+i+"</option>");
                }
            }
        },


        populatePagination: function(){
            var $this = this;
            var $thisElement =  this.paginationElement;
            $thisElement.empty();

            var getClickHandler= function(page_id) {
                if(page_id == $this.opts.page_no){
                    return false;
                }
                return function(evt){ $this.opts.callback(page_id);}
            }

            /**
             * 分页的页码显示的两个端点
             * 例：1,...,5,6,7,8,9,10,...,23,page_count=23,page_no=7,edge_entry_num=1,page_before_num=2,page_after_num=3,则返回[5,10]
             * @返回 {数组(Array)}
             */
            function getInterval()  {
                var start = Math.max($this.opts.page_no-$this.opts.page_before_num,1);
                var end = Math.min($this.opts.page_no+$this.opts.page_after_num,$this.opts.page_count);
                return [start,end];
            }

            var appendItem = function(page_id, opts, isPreorNext){
                page_id = page_id < 1 ? 1 :(page_id < $this.opts.page_count ? page_id : $this.opts.page_count);
                opts = jQuery.extend({text:page_id, classes:""}, opts||{});
                var itemtemplate = '<li><a href="javascript:">'+opts.text+'</a></li>';
                var newitem = jQuery(itemtemplate)
                    .bind("click", getClickHandler(page_id));
                if(page_id == $this.opts.page_no && !isPreorNext){//当前页
                    newitem.addClass("active");
                }
                $thisElement.append(newitem);
            };
            //产生前一页
            if($this.opts.prev_text && ($this.opts.page_no > 1 || $this.opts.prev_show_always)){
                appendItem($this.opts.page_no-1,{text:$this.opts.prev_text},true);
            }
            var interval = getInterval();
            // 产生起始点
            if (interval[0] > 1 && $this.opts.edge_entry_num > 0)
            {
                var end = Math.min($this.opts.edge_entry_num, interval[0]-1);
                for(var i=1; i<=end; i++) {
                    appendItem(i);
                }
                if($this.opts.edge_entry_num < interval[0] && $this.opts.ellipse_text)
                {
                    $thisElement.append('<li><a href="javascript:">'+$this.opts.ellipse_text+'</a></li>');
                }
            }
            // 产生内部链接
            for(var i=interval[0]; i<=interval[1]; i++) {
                appendItem(i);
            }
            // 产生结束点
            if (interval[1] < $this.opts.page_count && $this.opts.edge_entry_num > 0)
            {
                if($this.opts.page_count-$this.opts.edge_entry_num > interval[1]&& $this.opts.ellipse_text)
                {
                    $thisElement.append('<li><a href="javascript:">'+$this.opts.ellipse_text+'</a></li>');
                }
                var begin = Math.max($this.opts.page_count-$this.opts.edge_entry_num, interval[1]);
                for(var i=begin+1; i<=$this.opts.page_count; i++) {
                    appendItem(i);
                }

            }
            //产生后一页
            if($this.opts.next_text && ($this.opts.page_no < $this.opts.page_count || $this.opts.next_show_always)){
                appendItem($this.opts.page_no+1,{text:$this.opts.next_text},true);
            }
        },

        pageClick: function(pagenum){
            var $this = this;
            $this.opts.callback(pagenum);
        },

        updateOptions: function(options){
            this.process_options(options);
            this.populate();
        }
    };

    $.fn.Paginate = function(option){
        var args = Array.prototype.slice.call( arguments, 1 );
        var methodReturn;
        var $set = this.each(function(){
            var $this = $(this),
                data = $this.data('paginate'),
                options = typeof option === 'object' && option;
            if(!data){
                $this.data('paginate', (data = new Paginate(this, options)));
            }
            if (typeof option === 'string' && typeof data[option] === 'function'){
                methodReturn = data[option].apply(data, args);
            }
        });
        return ( methodReturn === undefined ) ? $set : methodReturn;
    };


})(jQuery);