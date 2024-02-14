import 'package:code_book_reading/components/my_file.dart';
import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  LoginPage({Key? key}) : super(key: key);

  // text editing for controller
  final usernameController = TextEditingController();
  final passwordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey.shade400,
      body: SafeArea(
        child: Center(
          child: Column(
            children: [
              SizedBox(height: 50,),

              // logo
              const Icon(
                  Icons.lock,
                size: 100,
                color: Colors.black,
              ),

              const SizedBox(height: 50,),

              // welcome back you've been missed !
              const Text("You are welcome ! You've been missed !",
                style: TextStyle(
                    color: Colors.black,
                  fontSize: 16,
                ),
              ),

              const SizedBox(height: 50,),

              // username textfield
              MyTextField(
                controller: usernameController,
                hintText: "Username",
                obscureText: false,
              ),

              const SizedBox(height: 10,),

                // password textfield
              MyTextField(
                controller: passwordController,
                hintText: "Password",
                obscureText: true,
              ),

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
