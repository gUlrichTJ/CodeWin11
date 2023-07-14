fn main(){
	println!("Hello World!");
	println!("{} jours",31);
	println!("{0}, voici {1} . {1}, voici {0}", "Alice", "Bob");
	println!("{sujet} {verbe} {objet}",
	objet = "Le chien paresseux", 
	sujet = "Rapide, le renard",
	verbe = "saute par-dessus");
	
	println!("{} personne sur {:b} sait lire le binaire, l'autre moitié non.", 1, 2);
	println!("{number:>width$}", number = 1, width = 6);
	
	println!("{number:>0width$}", number = 1, width = 6);
	
	#[allow(dead_code)]
	struct Structure(i32);
}
