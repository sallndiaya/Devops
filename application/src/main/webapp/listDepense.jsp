<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Depenses - Bugget</title>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container mb-5 mt-5">
		<div id="topPanel"
			class="d-flex bg-primary rounded p-3 mb-3 flex-column">
			<h3 class="text-white">
				<i class="fa fa-graduation-cap" aria-hidden="true"></i> 0 depenses
			</h3>
			<div class="title mb-3"></div>
		</div>

		<div class="table-responsive">
			<table id="tabel-data" class="table display border border-color">
				<thead class="bg-primary text-white">
					<tr>
						<th>#</th>
						<th>Description</th>
						<th>Categorie</th>
						<th>Montant</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
			</div>
			</div>
</body>
</html>