$(document).ready(function(){
	$("#content").load("tabtest.html");
	$("li").each(function(index){
		$(this).click(function(){
			$(".tabin").removeClass("tabin");
			$(this).addClass("tabin");
			if(index==0)
				$("#content").load("tabtest.html");
			else if(index==1)
				$("#content").load("tabtest.html input");
			else if(index==2)
				$("#content").load("index2.jsp");
		});
	});
	
	$("img").bind("ajaxStart",function(){
		$("#content").html("");
		$("img").show();
	}).bind("ajaxStop",function(){		
		$(this).slideUp("slow");
	});
});