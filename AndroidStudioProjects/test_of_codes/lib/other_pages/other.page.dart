import 'dart:io';
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
}