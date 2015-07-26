function ajaxTest() {
  $.ajax({
    type: 'POST',
    url: 'user/testAjax',
    error: function(data) {
      alert('error: ' + data);
    },
    success: function(data) {
      alert('success: ' + data);
    }
  });
}

(function() {
  ajaxTest();
})();