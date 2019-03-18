$(function() {

	switch (menu) {

	case 'About':
		$('#about').addClass('active');
		break;

	case 'contact':
		$('#contact').addClass('active');
		break;

	case 'All the products':
		$('#list1').addClass('active');
		break;

	default:
		if (menu == "Home")
			break;
		$('#list1').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}
	
//code for jquery datatable
//create a dataset
	
	var products=[
		
			['1','ABC'],
			['1','CYX'],
			['1','MNO'],
			['1','CBZ'],
			['1','XYX'],
			['1','RYB'],
			['1','MOC'],
			['1','SUX']
	];
	
	
	var $table = $('#productListTable');

if ($table.length) {
	// console.log('Inside the table!');
	
	$table.DataTable({
	lengthMenu:[[3,5,10,-1],['3 records','5Records','10 records','all records']],
	pageLength:5,
	data:products
	}
	
	);
}
	
	
});