import 'package:flutter/material.dart';
import 'package:o_talents_debug/dart/pages/presence/app_bar_presence/customeappbar.file.dart';
import 'package:o_talents_debug/dart/pages/presence/body_presence/bodypresence.dart';

class PresencePage extends StatefulWidget {
  const PresencePage({super.key});

  @override
  State<PresencePage> createState() => _PresencePageState();
}

class _PresencePageState extends State<PresencePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      /// On pourra utiliser plusieurs fois cette classe.
      /// Il suffira de changer le nom du cours, et de la classe. Merci.
      appBar: CustomAppBarPresence(
        nomDuCours: 'Mathematiques',
        nomDeLaClasse: "3 eme",
      ),
      // backgroundColor: Colors.pink.shade50,
      body: SafeArea(
        child: Padding(
          padding: EdgeInsets.all(8.0),
          child: Column(
            children: [
              CustomBodyPresence(
                  imageEleve: "imageEleve", nomEleve: "Kodjo",
              ),
            ],
          ),
        ),
      ),
    );
  }
}

class NomDeLaMatiereEtClasse extends StatelessWidget {
  String nomDuCours;
  String niveau;
  NomDeLaMatiereEtClasse({
    super.key,
    required this.nomDuCours,
    required this.niveau,
  });

  @override
  Widget build(BuildContext context) {
    return ListTile(
      title: const Text("Présence"),
      subtitle: Text("$nomDuCours - $niveau"),
    );
  }
}
