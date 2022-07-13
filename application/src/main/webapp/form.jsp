<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Inscription - Bugget</title>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container mt-5 mb-5">
		<div class="card mr-auto">
			<form action="saveUser.jsp" method="post">
				<div class="card-header bg-primary">
					<h2 class="card-title text-center text-white">Creation d'un compte</h2>
				</div>
				<div class="card-body">
					<div class="form-group row">
						<div class="col-6">
							<label>Nom</label> <input type="text"
								class="form-control form-control-lg" name="nom" required
								placeholder="Entrer le nom">
						</div>
						<div class="col-6">
							<div class="form-group">
								<label>Prenom</label> <input type="text"
									class="form-control form-control-lg" name="prenom" required
									placeholder="Entrer le prenom">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-6">
							<div class="form-group">
								<label>Email</label> <input type="email"
									class="form-control form-control-lg" name="email"
									required placeholder="Entrer votre adresse mail">
							</div>
						</div>
						<div class="col-6">
							<label>Password</label> <input type="password"
								class="form-control form-control-lg" name="password" required
								placeholder="****">
						</div>
					</div>
					<div class="card-footer d-flex justify-content-around">
						<input type="submit" class=" w-25 mr-2 btn btn-lg btn-primary"
							value="valider" name="valider"> 
							<input type="reset"
							class=" w-25 btn btn-lg btn-primary" value="Annuler"
							name="annuler">
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>