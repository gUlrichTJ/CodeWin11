# Nous allons essayer de convertir le texte UTF-8 vers ISO

def conversionUTF8versISO(texte):   # Ici, nous prenons un string en paramètre

    try:
        texte_iso = texte.encode('utf-8').decode('iso-8859-1')  # Nous le décodons en iso
        # et nous passons la valeur à la variable texte_iso

    except UnicodeError:    # Si le texte n'est pas en utf-8, une erreur est levée
        print("Le texte n'est pas en format UTF-8. Merci")
        return

    # Nous mettons le texte codé dans une nouvelle variable
    return texte_iso

    # Maintenant, convertissons en ISO

# Nous testons le code.


texte_test = "%^~¢	Nous ne sommes pas des enfants illégitimes, nous sommes des enfants de la maison"
resultat = conversionUTF8versISO(texte_test)

if resultat:
    print("Texte converti en ISO")
    print(resultat)


def conversionISOversUTF8(texte_iso):
    # Vérifions que le texte passé en paramètre est en ISO-8859-1
    try:
        # Convertissons en UTF-8
        texte_utf8 = texte_iso.encode("iso-8859-1").decode("utf-8")
    except UnicodeError:
        print("Le texte n'est pas au format ISO-8859-1. Merci")
        return None

    return texte_utf8


# Nous testons le code.
texte_iso_test = "Café et crème brulée. Your iso-8859-1 text is here."  # "\xC4pple"
resultat = conversionISOversUTF8(texte_iso_test)

if resultat is not None:
    print("\nTexte converti en UTF-8 :")
    print(f"{resultat}")

print("Hello World !")
