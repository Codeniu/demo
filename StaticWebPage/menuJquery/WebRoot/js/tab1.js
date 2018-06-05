$(document).ready(function(){
	$("li").each(function(index){
		var id;
		$(this).mouseover(function(){
			var node = $(this);
			id = setTimeout(function(){		
				$(".tabin").removeClass("tabin");
				$(".contentin").removeClass("contentin");
				node.addClass("tabin");
				$("div").eq(index).addClass("contentin");
			},500);
			
		}).mouseout(function(){
			clearTimeout(id);
		});
	});
});