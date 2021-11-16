<style type="text/css"> 
        body { background-color: #fff; color: #666; text-align: center; font-family: arial, sans-serif; }
        div.dialog {
            width: 80%;
            padding: 1em 2em;
            margin: 4em auto 0 auto;
            border: 1px solid #ccc;
            border-right-color: #999;
            border-bottom-color: #999;
            max-height: 350px;
            overflow: auto;
        }
        h1 { font-size: 100%; color: #f00; line-height: 1.5em; }
    </style> 
     <body>
    <div class="dialog"> 
    <h1>应用程序异常</h1> 
    <p>抱歉！您访问的页面出现异常，请稍后重试或联系系统管理员。</p> 
       <p><a href="javascript:showErr();" id="message">详 情</a> 
          <a href="javascript:history.back(-1)">返 回</a> 
    </p> 
    <div style="text-align: left;" id="err" hidden="hidden">${message!}</div>
  </div>
 
 <body>
 <script type="text/javascript" src="/plugins/jquery/jquery-3.1.1.min.js"></script>
  <script type="text/javascript">
  function showErr(){
		$("#err").show() ;
  }
  </script>