import 'package:code_book_reading/components/my_button.dart';
import 'package:code_book_reading/components/my_file.dart';
import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  LoginPage({Key? key}) : super(key: key);

  // text editing for controller
  final usernameController = TextEditingController();
  final passwordController = TextEditingController();

  // sign user in method
  void signUserIn() {}

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey.shade400,
      body: SafeArea(
        child: Center(
          child: Column(
            children: [
              const SizedBox(height: 50,),

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

              const SizedBox(height: 10,),

              // forgot password
              Padding(
                padding: const EdgeInsets.symmetric(horizontal: 25.0),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.end,
                  children: [
                    Text(
                        "Forgot password ?",
                      style: TextStyle(color: Colors.grey.shade600),
                    ),
                  ],
                ),
              ),

              const SizedBox(height: 25,),

            // sign in button
            MyButton(onTap: signUserIn,),

            // or continue with
            const SizedBox(height: 15,),

            Row(
              children: [
                Expanded(
                  child: Divider(
                    thickness: 0.5,
                    color: Colors.grey.shade400,
                  ),
                ),
                Expanded(
                  child: Divider(
                    thickness: 0.5,
                    color: Colors.grey.shade400,
                  ),
                ),
              ],
            ),
            // google + apple sign in button

            // not a member ? register now

            ],
          ),
        ),
      ),
    );
  }
}
