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
	var jsonUrl='';
	
	if(window.categoryId==''){
		
		jsonUrl = window.contextRoot + '/json/data/all/products';
	}
	else{
		
		jsonUrl = window.contextRoot + '/json/data/category/' + window.categoryId + '/products';
	}
		

	
	var $table = $('#productListTable');
	
	//EXECUTE THE BELOW CODE ONLY WHERE WE HAVE THIS TABLE
	
	if($table.length){
		
		
		//console.log('Inside the table!');
		
		$table.DataTable({
			
			lengthMenu: [ [3,5,10,-1],['3','5','10','All' ] ],
			pageLength: 5,
			
			ajax: {
				
				url: jsonUrl,
				dataSrc:''
			},
			
			
			columns:[	
						{
							
							data: 'code',
							mRender: function(data,type,row){
								
								return '<img src="'+window.contextRoot+'/resources/images/'+data+'.png" class="dataTableImg"/>';
								
							}
						},
				
						{
							
							data: 'name'
						},
						
						{
							
							data: 'restaurant'
						},
						
						{
							
							data: 'description'
						},
						
						{
							
							data: 'unitPrice',
							mRender: function(data,type,row){
								
								return 'R'+data
							}
							
						},
						
						{
							
							data: 'id',
							bSortable: false,
							mRender: function(data,type,row){
								
								var str=''; 
								
								str += '<a href=" '+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary"><span class="fa fa-eye"></span></a> &#160; <br/>';
								str += '<a href=" '+window.contextRoot+'/cart/add/'+data+'/product" class="btn btn-success"><span class="fa fa-cart-arrow-down"></span></a>';
								
								return str;
							} 
						}	
						
						
						
						
				
						]
			
		});
		
	}
	
})

