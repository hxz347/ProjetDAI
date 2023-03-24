/**
 * 
 */
function afficherEmployDuTemps(){
	{
	// Objet XMLHttpRequest.
	var xhr = new XMLHttpRequest();
	//var elt = document.getElementById("lnom");
	//var valueOption=elt.value;
	// Requête au serveur avec les paramètres éventuels.
	xhr.open("GET","ServletEnseign1?login="+"bour@123.com");

	// On précise ce que l'on va faire quand on aura reçu la réponse du serveur.
	xhr.onload = function()
		{
		// Si la requête http s'est bien passée.
		if (xhr.status === 200)
			{
			// Elément html que l'on va mettre à jour.
			var elt = document.getElementById("test");
		
			var Seances=xhr.responseXML.getElementsByTagName("seance");
			for(i=0;i<Seances.length;i++){
					var result = Seances[i].documentElement;
					console.log(result.getElementsByTagName('unSeance'));
					//var unSeance=result.getElementsByTagName("unSeance");
					//console.log(unSeance[0].getElementsByTagName("semaine"));
					
					//elt.insertAdjacentHTML("beforeend","lll");
					//elt.insertAdjacentText("beforeend","lll");
					
			}
			}
		};

	// Envoie de la requête.
	xhr.send();
}}





document.addEventListener("DOMContentLoaded", () => {

	document.getElementById("btn_enseign").addEventListener("click",afficherEmployDuTemps);

});