$(document).ready(function(){
	var nameSelect = $(".carname").children("select");
	var typeSelect = $(".cartype").children("select");
	var wheelSelect = $(".wheeltype").children("select");
	var picture = $(".picture");
	nameSelect.change(function(){
		/**
		 * 获取value
		 * 1.1为空，隐藏所有下拉框和图片
		 * 1.2不为空，隐藏第三个下拉框和图片，清空第二个下拉框的值，获取第二个下拉框的值，并填充
		 */
		var nameValue = $(this).val();
		wheelSelect.parent().hide();
		picture.hide();
		if(nameValue==""){
			typeSelect.parent().hide();
		}else{
			var data;
			if(nameValue=="bmw"){
				data = new Array(2);
				data[0] = "6ercupe";
				data[1] = "316ti";
			}else if(nameValue=="vw"){
				data = new Array(1);
				data[0] = "Golf4";
			}else{
				data = new Array(1);
				data[0] = "tt";
			}
			typeSelect.html("");
			
			$("<option value=''>请选择汽车类型</option>").appendTo(typeSelect);
			for(var i=0;i<data.length;i++){
				$("<option value='"+data[i]+"'>"+data[i]+"</option>").appendTo(typeSelect);
			}
			
			/*if(!nameSelect.data(nameValue)){//缓存当中没有数据
				$.post("chainlist",{keyword:nameValue,type:"carname"},function(data){
					//完成post请求之后，返回的data数据应该是一个数组，把data中每个元素-》option，添加到下级的下拉框
					$("<option value=''>请选择汽车类型</option>").appendTo(typeSelect);
					for(var i=0;i<data.length;i++){
						$("<option value='"+data[i]+"'>"+data[i]+"</option>").appendTo(typeSelect);
					}
					nameSelect.data(nameValue,data);//缓冲
				},"json");
			}else{
				var data = nameSelect.data(nameValue);
				$("<option value=''>请选择汽车类型</option>").appendTo(typeSelect);
				for(var i=0;i<data.length;i++){
					$("<option value='"+data[i]+"'>"+data[i]+"</option>").appendTo(typeSelect);
				}
			}*/
			
			typeSelect.parent().show();	
		}
	});
	
	typeSelect.change(function(){
		/**
		 * 获取汽车类型value
		 * 2.1 为空，隐藏第三个下拉框和图片
		 * 2.2 不为空，隐藏图片和清空第三个下拉框的值，重新获取第三个下拉框的值并填充
		 */
		var typeValue = $(this).val();
		picture.hide();
		if(typeValue == ""){
			wheelSelect.parent().hide();
		}else{
			wheelSelect.html("");
			var data;
			if(typeValue=="6ercupe"){
				data = new Array(3);
				data[0] = "rha";
				data[1] = "rhb";
				data[2] = "rhc";
			}else if(typeValue=="ti"){
				data = new Array(2);
				data[0] = "rha";
				data[1] = "rhb";
			}else if(typeValue=="316ti"){
				data = new Array(2);
				data[0] = "rha";
				data[1] = "rhb";
			}else if(typeValue=="tt"){
				data = new Array(3);
				data[0] = "rha";
				data[1] = "rhb";
				data[2] = "rhc";
			}else if(typeValue=="Golf4"){
				data = new Array(2);
				data[0] = "rha";
				data[1] = "rhb";
			}
			$("<option value=''>请选择车轮类型</option>").appendTo(wheelSelect);
			for(var i=0;i<data.length;i++){
				$("<option value='"+data[i]+"'>"+data[i]+"</option>").appendTo(wheelSelect);
			}
			wheelSelect.parent().show();
		}
	});
	
	wheelSelect.change(function(){
		/**
		 * 获取value，拼接图片名称
		 * 1.显示装载中的指示图片并隐藏之前的picture图片
		 * 2.通过Javascript中的Image对象预装载图片，ajax事件
		 */
		var picName = nameSelect.val()+"_"+typeSelect.val()+"_"+wheelSelect.val()+".jpg";
		picture.hide();
		alert(picName);
		$(".picloading").show();
		var carshow = new Image();
		$(carshow).attr("src","images/"+picName).load(function(){
			$(".picloading").hide();
			picture.attr("src","images/"+picName).show();
		});
		$(".carimg").show();
	});
	
	$(".loading").ajaxStart(function(){
		$(this).css("visibility","visible");
		$(this).animate({
			opacity:1
		},0);
	}).ajaxStop(function(){
		$(this).animate({
			opacity:0
		},500);
	});
});














