<div class="container">

	<!-- would be display sidebar -->
	
		<div class="row">
		
			<%@ include file="./shared/nav.jsp" %>
			
		</div>
		
		
		<!-- to display the actual products -->
		
		<div class="col-md-9">
		
			<!-- Added breadcrumb component -->
			
		<div class="col-lg-12">
		
			<c:if test="${userClickAllProducts ==true}">
			<ol class="breadcrumb">
			<li><a href="${context}/home">HOME</a> </li>
			<li class="active">All Products</li>
			</ol>
			</c:if>
		
			<c:if test="${userClickCategoryProducts ==true}">
			<ol class="breadcrumb">
			<li><a href="${context}/home">HOME</a> </li>
			<li class="active">Category</li>
			<li class="active">${category.name}</li>
			</ol>
			</c:if>


		</div>	
			
		
		
		</div>
		
		
</div>