<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h1 align="center">${titleNameValue}</h1>
	<hr />
	<form action="processOrder">
		<div align="center">
			<label for="item_name">Item Name :</label> <input type="text"
				name="foodType" placeholder="food type ??" id="item_name"> <input
				type="submit" value="order now">
		</div>
	</form>
</body>
</html>