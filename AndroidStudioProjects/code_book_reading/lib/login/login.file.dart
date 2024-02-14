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

              Icon(
                  Icons.lock,
                size: 100,
                color: Colors.black,
              ),

              SizedBox(height: 50,),
            ],
            // logo

            // welcome back you've been missed !

            // username textfield

            // password textfield

            // forgot password

            // sign in button

            // or continue with

            // google + apple sign in button

            // not a member ? register now


          ),
        ),
      ),
    );
  }
}
