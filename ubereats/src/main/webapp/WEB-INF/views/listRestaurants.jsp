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

						<ol class="breadcrumb bg-white">

							<li><a href="${contextRoot}/home">Home/ </a></li>
							<li class="active">All Restaurants</li>
						</ol>
					</c:if>
					
					
					
					<c:if test="${userClickCategoryRestaurants == true }">

						<ol class="breadcrumb bg-white">

							<li><a href="${contextRoot}/home">Home/</a></li>
							<li class="active"> Category/</li>
							<li class="active"> ${category.name}</li>
						</ol>
					</c:if>
					
				</div>

			</div>
		
				<div class="row">
		
							<div class="col-xs-12">
									
									<table id="productListTable" class="table table-striped table-borderd">
		
									<thead>
										<tr>
										
											<th>ID</th>
											<th>Name</th>
											
										</tr>
									
									
									</thead>
		
		
									</table>
		
							</div>
		
		
				</div>

		</div>



	</div>




</div>