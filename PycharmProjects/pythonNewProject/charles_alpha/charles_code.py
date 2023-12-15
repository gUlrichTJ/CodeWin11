# Nous allons essayer de convertir le texte UTF-8 vers ISO
def conversionUTF8versISO(texte):
    # Vérifions que le texte passé en paramètre est en utf-8
    try:
        texte.encode('utf-8').decode('iso-8859-1')
    except UnicodeError:
        print("Le texte n'est pas en format UTF-8. Merci")
        return

    # Nous mettons le texte codé dans une nouvelle variable
    texte_iso = texte
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
        texte_iso.encode('iso-8859-1').decode('utf-8')
    except UnicodeError:
        print("Le texte n'est pas au format ISO-8859-1. Merci")
        return

    # Convertissons en UTF-8
    texte_utf8 = texte_iso.encode("iso-8859-1").decode("utf-8")
    return texte_utf8


# Nous testons le code.
texte_iso_test = b"\xC4pple"
resultat = conversionISOversUTF8(texte_iso_test)

if resultat:
    print("Texte converti en UTF-8 :")
    print(resultat)

print("Hello World !")
