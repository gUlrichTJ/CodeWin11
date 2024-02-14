import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({Key? key}) : super(key: key);

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
            TextField(
              cursorColor: Colors.black,
              decoration: InputDecoration( 
                enabledBorder: const OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                focusedBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.grey.shade500),
                ),
              ),
            ),

            // password textfield

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
