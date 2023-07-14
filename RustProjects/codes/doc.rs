#[derive(Debug)]
struct Structure(i32);
//On crée une structure nommée Deep que l'on rend affichable contenant 
//un champ de type structure
#[derive(Debug)]
struct Deep(Structure);

fn main(){
	//L'utilisation de {:?} est similaire à {}
	println!("{:?} mois d'une année ",12);
	println!("{1:?} {0:?} est le nom de {acteur:?}.",
			 "Slater",
			 "Christian",
			 acteur = "l'acteur");
	//Structeur peut être affichée!
	println!("{:?} peut désormais être affichée!", Structure(3));
	
	//Le problème avec derive est que vous n'avez aucun contrôle
	//quant au résultat affiché. Comment faire si je souhaite seulement afficher 7 ?
	println!("{:?} peut désormais être affichée!", Deep(Structure(7)));
}
