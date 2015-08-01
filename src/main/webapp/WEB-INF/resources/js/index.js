function testAjax() {
	$.ajax({
		url: 'ajaxtest.html',
		success: function(data) {
			$('#result').html(data);
		}
	});
}

(function() {
	setInterval(testAjax, 3000);
})();