$(document).ready(function(){
	$(".main a").click(function(){
		var detail = $(this).next("ul");
		/*if(detail.css("display")=="none")
			detail.css("display","block");
		else{
			detail.css("display","none");
		}*/
		detail.slideToggle("normal");
		changeIcon($(this));
	});
	
	$(".hmain").hover(function(){
		$(this).children("ul").slideDown();
		changeIcon($(this).children("a"));
	},function(){
		$(this).children("ul").slideUp();
		changeIcon($(this).children("a"));
	});
});

function changeIcon(obj)
{
	if(obj.css("background-image").indexOf("collapsed")!=-1)
		obj.css("background-image","url('images/expanded.gif')");
	else
		obj.css("background-image","url('images/collapsed.gif')");
}





