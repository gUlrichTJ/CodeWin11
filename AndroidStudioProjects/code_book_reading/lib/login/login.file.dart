import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      backgroundColor: Colors.grey,
      body: SafeArea(
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
            TextField(
              decoration: InputDecoration(
                enabledBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
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
