<html>
<head>
	<script src="jquery-1.8.3.min.js" type="text/javascript"></script>
	<script>
	$(function(){
		$("p").click(function(){
			alert("adsf");
		});
	});
	</script>
</head>
<body>
    <p>我的姓名是${name.name}</p>
    <p>我的年龄是${name.age}</p>
    <p>我的性别是${name.sex}</p>
</body>
</html>