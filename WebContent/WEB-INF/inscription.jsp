<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <link rel="stylesheet" href="/style.css" />
  <title>Formulaire Candidats</title>
</head>
<header>
  <h1>Formulaire pour candidater</h1>
</header>
<body>
<form id = "form" name = "monForm" action="Servlet1"  method="get">
<fieldset>
  <Legend>Vos informations</Legend>
  <br><br>
  <label for = "name">Nom</label>  <input type = "text" name = "name" id = "name">
  <br><br>
  <label for = "pnom">Prénom</label> <input type = "text" name = "pnom" id = "pnom">
  <br><br>
  <label for = "DateN">Date de Naissance</label> <input type = "date" name = "DateN" id = "DateN">

  <br><br>
  <label for = "email">Adresse Mail</label> <input type = "text" name = "email" id = "email">
  <br><br>
  <label for = "tel">Numéro de téléphone</label> <input type = "text" name = "tel" id = "tel">
  <br><br>
  <label for = "pseudo">Pseudo</label> <input type = "text" name = "pseudo" id = "pseudo">
  <br><br>
  <label for = "motdepasse">Mot de passe</label> <input type = "text" name = "motdepasse" id = "motdepasse">
  

</fieldset>

<input type = "submit" value = "Envoyer">

</form>

</body>
</html>

