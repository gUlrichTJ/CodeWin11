import 'package:code_book_reading/components/my_file.dart';
import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({Key? key}) : super(key: key);

  // text editing for controller
  final usernameController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey.shade400,
      body: const SafeArea(
        child: Center(
          child: Column(
            children: [
              SizedBox(height: 50,),

              // logo
              Icon(
                  Icons.lock,
                size: 100,
                color: Colors.black,
              ),

              SizedBox(height: 50,),

              // welcome back you've been missed !
              Text("You are welcome ! You've been missed !",
                style: TextStyle(
                    color: Colors.black,
                  fontSize: 16,
                ),
              ),

              SizedBox(height: 50,),

              // username textfield
              MyTextField(),

              SizedBox(height: 10,),

                // password textfield
              MyTextField(),

            // forgot password

            // sign in button

            // or continue with

            // google + apple sign in button

            // not a member ? register now

            ],
          ),
        ),
      ),
    );
  }
}
