<div class="container">

	<div class="row">

		<!-- Would be to display sidebar -->
		<div class="col-md-3">


			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- To Display the actual products -->
		<div class="col-md-9">
<br/>
<br/>
<br/>

			<!-- Adding BreadCrumb to page -->

			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllRestaurants == true }">
					
						<script>
							window.categoryId = '';
						</script>
						
						<ol class="breadcrumb bg-white">

							<li><a href="${contextRoot}/home">Home/ </a></li>
							<li class="active">All Restaurants</li>
						</ol>
					</c:if>
					
					
					
					<c:if test="${userClickCategoryRestaurants == true }">
					
					<script>
							window.categoryId = '${category.id}';
						</script>
					

						<ol class="breadcrumb bg-white">

							<li><a href="${contextRoot}/home">Home/</a></li>
							<li class="active"> Category/</li>
							<li class="active"> ${category.name}</li>
						</ol>
					</c:if>
					
				</div>

			</div>
			
			<h3 class="my-4">You can scroll through the feed for inspiration or search for a particular restaurant or cuisine. When you find something you like, tap to add it to your cart.</h3>
		
				<div class="row">
		
							<div class="col-xs-12">
									
									<table id="productListTable" class="table table-striped table-borderd table-responsive">
		
									<thead>
										<tr>
										
											<!-- the first column is for the images -->
											<th></th>
											<th>Name</th>
											<th>Restaurant</th>
											<th>Description</th>
											<th>Price</th>
											<!-- This black column is for the view product and add to cart icons -->
											<th></th>
											
										</tr>
									
									
									</thead>
									
									
									<tfoot>
										<tr>
											<!-- the first column is for the images -->
											<th></th>
											<th>Name</th>
											<th>Restaurant</th>
											<th>Description</th>
											<th>Price</th>
											<!-- This black column is for the view product and add to cart icons -->
											<th></th>
											
											
										</tr>
									
									
									</tfoot>
		
		
		
									</table>
		
							</div>
		
		
				</div>

		</div>



	</div>




</div>