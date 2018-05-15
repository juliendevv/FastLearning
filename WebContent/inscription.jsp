<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
</head>
<body>
<h1>FastLearning</h1>
	<h2>Inscription</h2>
	<form method="post" action="">
	   <p>
	       <label for="nom">Nom :</label>
	       <input type="text" name="nom" id="nom" />
	       </br>
	       </br>
	       <label for="prenom">Prénom :</label>
	       <input type="text" name="prenom" id="prenom" />
	       </br>
	       </br>
 		   <label for="date_naissance">Date de naissance:</label>
	       <input type="Date" name="date_naissance" id="date_naissance" />
	   	   </br>
	       </br>
	       <label for="email">Email :</label>
	       <input type="email" name="email" id="email" />
	       </br>
	       </br>
 		   <label for="tel">Téléphone :</label>
	       <input type="tel" pattern="^((\+\d{1,3}(-| )?\(?\d\)?(-| )?\d{1,5})|(\(?\d{2,6}\)?))(-| )?(\d{3,4})(-| )?(\d{4})(( x| ext)\d{1,5}){0,1}$" name="tel" id="tel" />
	       </br>
	   </p>
	</form>
</body>
</html>