/** Add a function when the document is ready using jquery short hand function**/

$(function(){

	//solving active menu problem
	switch(menu){
	
	case 'About Us':
		$('#about').addClass('active');
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
	case 'All Resturants':
		$('#listRestaurants').addClass('active');
		break;
		
	case 'Home':
		$('#home').addClass('active');
		break;
	
	
		
		
	default:
		if(menu=="Home") break;	
		$('#listRestaurants').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	
	}
	
	
	
})

