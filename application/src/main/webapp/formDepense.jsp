<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Creation d'une depense - Bugget</title>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container mt-5 mb-5">
		<div class="card mr-auto">
			<form action="saveDepense.jsp" method="post">
				<div class="card-header bg-primary">
					<h2 class="card-title text-center text-white">Creation d'une
						depense</h2>
				</div>
				<div class="card-body">
					<div class="form-group">
							<label>Montant (FCFA)</label> 
							<input type="number"
								class="form-control form-control-lg" name="montant" required
								placeholder="Entrer le montant en FCFA" min="0">
						</div>
					
					<div class="form-group">
						<label>Description</label> 
						<input type="text"
							class="form-control form-control-lg" name="description" required
							placeholder="Entrer la description">
					</div>

					<div class="form-group">
						<label>Categorie</label> <select class="form-control"
							name="categorie">
							<option value="nourriture">Nourriture</option>
							<option value="loyer">Loyer</option>
							<option value="frais de scolarité">Frais de scolarité</option>
							<option value="frais médical">Frais médical</option>
							<option value="facture">Facture</option>
							<option value="autre">Autres</option>
						</select>
					</div>

				</div>

				<div class="card-footer d-flex justify-content-around">
					<input type="submit" class=" w-25 mr-2 btn btn-lg btn-primary"
						value="Creer" name="valider"> 
				</div>
			</form>
		</div>
	</div>
</body>
</html>