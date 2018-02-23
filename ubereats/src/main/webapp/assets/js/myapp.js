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
	
	//code for jquery dataTable
	//create dataset
	
	var products = [
		
					['1', 'ABC'],	
					['2', 'ZXC'],
					['3', 'HJK'],
					['4', 'YTU'],
					['5', 'LOH'],
					['6', 'TYB'],
					['7', 'POI'],
					['8', 'RUG']
	];
	
	var $table = $('#productListTable');
	
	//EXECUTE THE BELOW CODE ONLY WHERE WE HAVE THIS TABLE
	
	if($table.length){
		
		
		//console.log('Inside the table!');
		
		$table.DataTable({
			
			lengthMenu: [ [3,5,10,-1],['3','5','10','All' ] ],
			pageLength: 5,
			data: products
		});
		
	}
	
})

