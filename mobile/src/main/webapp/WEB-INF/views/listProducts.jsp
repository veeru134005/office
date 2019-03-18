<div class="container">

	<div class="row">


		<!-- Would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/slider.jsp"%>



			<!-- to display the actual products -->
			<div class="col-md-9">

				<!-- Added breadcrumb component -->
				<div class="row">

					<div class="col-lg-12">

						<c:if test="${userClickAllProducts ==true}">
							<script>
								window.categoryId = '';
							</script>
							<ol class="breadcrumb">
								<li><a href="${context}/home">HOME</a></li>
								<li class="active">All Products</li>
							</ol>
						</c:if>

						<c:if test="${userClickCategoryProducts ==true}">

							<script>
								window.categoryId = '${category1 .id}';
							</script>
							<ol class="breadcrumb">
								<li><a href="${context}/home">HOME</a></li>
								<li class="active">Category</li>
								<li class="active">${category1.name}</li>
							</ol>
						</c:if>
					</div>

				</div>


				<div class="row">

					<div class="col-xs-12">


						<table id="productListTable"
							class="table table-striped table-borderd">


							<thead>

								<tr>
									<th></th>
									<th>Name</th>
									<th>Brand</th>
									<th>Price</th>
									<th>Qty.Available</th>
									<th></th>
									
								</tr>
							</thead>
							
							
							<tfoot>

								<tr>
									<th>Name</th>
									<th>Brand</th>
									<th>Price</th>
									<th>Qty.Available</th>
									<th></th>
								</tr>
							</tfoot>
							
							
						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
</div>