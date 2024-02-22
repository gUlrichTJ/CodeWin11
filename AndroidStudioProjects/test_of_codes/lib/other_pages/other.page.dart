/*import 'dart:io';
import 'package:file_manager/file_manager.dart';
import 'package:flutter/material.dart';
import 'package:path/path.dart' as path;
import 'package:permission_handler/permission_handler.dart';

class Pdflist extends StatefulWidget {
  const Pdflist({Key? key}) : super(key: key);

  @override
  State<Pdflist> createState() => _PdflistState();
}

class _PdflistState extends State<Pdflist> {
  final FileManagerController controller = FileManagerController();

  @override
  void initState() {
    super.initState();
    checkPermissionStatus();
  }

  Future<void> checkPermissionStatus() async {
    final status = await Permission.storage.status;
    setState(() {
      if (status.isGranted) {
        print('PERMISSION Access');
      } else if (status.isDenied) {
        requestPermission();
      }
    });
  }

  Future<void> requestPermission() async {
    final status = await Permission.storage.request();
    setState(() {});
  }

  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        centerTitle: true,
        title: Text('All PDFs'),
      ),
      body: Container(
        child: FileManager(
          controller: controller,
          builder: (context, snapshot) {
            final List<FileSystemEntity> entities = snapshot;
            final List<FileSystemEntity> pdfFiles = entities
                .where((entity) =>
            FileManager.isFile(entity) &&
                path.extension(entity.path).toLowerCase() == '.pdf')
                .toList();
            return ListView.builder(
              itemCount: pdfFiles.length,
              itemBuilder: (context, index) {
                return Card(
                  child: ListTile(
                    leading: Icon(Icons.file_present),
                    title: Text(FileManager.basename(pdfFiles[index])),
                    onTap: () {
                      // Perform file-related tasks.
                    },
                  ),
                );
              },
            );
          },
        ),
      ),
    );
  }
}*/
/* return SafeArea(
      child: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            children: <Widget>[
              Row(
                children: <Widget>[
                  _container(Colors.yellow.shade900, 40.0, 40.0),
                  const Padding(padding: EdgeInsets.all(16.0)),
                  Expanded(
                    child: _container(Colors.yellow.shade700, 40.0, 40.0),
                  ),
                  const Padding(padding: EdgeInsets.all(16.0),),
                  _container(Colors.brown, 40.0, 40.0),
                  const Padding(padding: EdgeInsets.all(16.0)),
                  _container(Colors.deepOrange, 40.0, 40.0),
                ],
              ),
              /// We add a space before adding the next row
              const Padding(padding: EdgeInsets.all(16.0)),
              Row(
                children: <Widget>[
                  Column(
                    children: <Widget>[
                      _container(Colors.lime.shade200, 60.0, 60.0),
                      const Padding(padding: EdgeInsets.all(16.0)),
                      // We add another container
                      _container(Colors.lime.shade900, 40.0, 40.0),
                      const Padding(padding: EdgeInsets.all(16.0)),
                      _container(Colors.amber.shade700, 30.0, 30.0),
                      const Padding(padding: EdgeInsets.all(16.0)),
                    ],
                  ),
                ],
              ),
              const Divider(
                height: 4.0,
                color: Colors.white,
                thickness: 4.0,
              ),
              const Padding(padding: EdgeInsets.all(16.0)),
              Row(
                children: <Widget>[
                  CircleAvatar(
                    backgroundColor: Colors.blue.shade700,
                    radius: 100.01,                    child: Stack(
                      children: <Widget>[
                        _container(Colors.cyan.shade50, 100.0, 100.1),
                        _container(Colors.cyan.shade100, 80.0, 80.0),
                        _container(Colors.cyan.shade300, 70.0, 70.0),
                        _container(Colors.cyan.shade500, 60.0, 60.0),
                        _container(Colors.cyan.shade700, 50.0, 50.0),
                        _container(Colors.cyan.shade800, 40.0, 40.0),
                        _container(Colors.cyan.shade900, 30.0, 30.0),
                      ],
                    ),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    ); */


