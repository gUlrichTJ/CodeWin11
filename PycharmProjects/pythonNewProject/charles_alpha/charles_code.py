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

# Nous testons le code.


texte_test = "%^~¢	Nous ne sommes pas des enfants illégitimes, nous sommes des enfants de la maison"
resultat = conversionUTF8versISO(texte_test)

if resultat:
    print("Texte converti en ISO")
    print(resultat)


def conversionISOversUTF8(texte_iso):
    try:
        # Convertissons en UTF-8 et passons la valeur à la variable texte_utf8
        texte_utf8 = texte_iso.encode("iso-8859-1").decode("utf-8")
    except UnicodeError:    # Une exception est levée si le texte n'est pas au format iso
        print("Le texte n'est pas au format ISO-8859-1. Merci")
        return None

    return texte_utf8   # Si tout se passe bien, nous retournons le texte codé en utf-8


# Nous testons le code.
texte_iso_test = "Café et crème brulée. Your iso-8859-1 text is here."  # "\xC4pple"
resultat = conversionISOversUTF8(texte_iso_test)

if resultat is not None:
    print("\nTexte converti en UTF-8 :")
    print(f"{resultat}")

# Nous disons juste merci à Dieu.
