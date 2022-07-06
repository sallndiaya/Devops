<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Connexion - Bugget</title>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container mt-5 mb-5">
		<div class="card mr-auto">
			<form action="auth.jsp" method="post">
				<div class="card-header bg-primary">
					<h2 class="card-title text-center text-white">Connexion</h2>
				</div>
				<div class="card-body">
					
					<div class="form-group">
							<label for="login">login</label> <input type="text" name="login"
								required id="login" class="form-control form-control-lg">
						</div>
						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								name="mdp" required id="mdp"
								class="form-control form-control-lg">
						</div>
					<div class="card-footer d-flex justify-content-around">
						<div class="row">
							<div class="text-center offset-md-5 col-md-2">
								<button class="btn btn-dark btn-lg" name="bajout" type="submit">connecter</button>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>