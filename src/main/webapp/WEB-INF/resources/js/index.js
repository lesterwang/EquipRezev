goog.require('goog.net.XhrIo');
/*function testAjax() {
	$.ajax({
		url: 'ajaxtest.html',
		success: function(data) {
			$('#result').html(data);
		}
	});
}*/

function testAjax() {
	goog.net.XhrIo.send('ajaxtest', function(e) {
		var xhr = e.target;
		document.getElementById('result').innerText = xhr.getResponse();
	});
}

(function() {
	setInterval(testAjax, 3000);
})();
