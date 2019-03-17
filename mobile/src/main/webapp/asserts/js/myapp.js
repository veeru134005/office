$(function() {

	switch (menu) {

	case 'About':
		$('#about').addClass('active');
		break;

	case 'contact':
		$('#contact').addClass('active');
		break;

	case 'All the products':
		$('#list').addClass('active');
		break;

	default:
		if (menu == 'Home')
			break;
		$('#list').addClass('active');

	}
});