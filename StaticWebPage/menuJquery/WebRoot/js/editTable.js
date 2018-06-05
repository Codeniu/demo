$(function(){
	$("tbody tr:even").css("background-color","#ECE9D8");

	$("tbody td:even").click(function(){
		var inputObj = $("<input type='text'>");
		var tdObj = $(this);
		if(tdObj.children("input").length>0)
			return false;
		
		var value = tdObj.html();
		tdObj.html("");
		inputObj.val(value).css("font-size","16px").css("border-width","0px").width(tdObj.width());
		inputObj.appendTo(tdObj);
		inputObj.trigger("focus").trigger("select");
		inputObj.click(function(){
			return false;
		});
		inputObj.keyup(function(event){
			var key = event.which;
			if(key == 13){//回车
				var tmp = $(this).val();
				tdObj.html(tmp);
			}else if(key==27){//esc
				tdObj.html(value);
			}
		});
	});
});








