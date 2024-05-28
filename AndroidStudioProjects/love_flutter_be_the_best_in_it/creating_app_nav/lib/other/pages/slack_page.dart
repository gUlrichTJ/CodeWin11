import 'package:creating_app_nav/other/detectors/detectors.dart';
import 'package:flutter/material.dart';

class SlackPage extends StatelessWidget {
  const SlackPage({super.key});

  email() {}

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Expanded(
          child: ListView(
            padding: const EdgeInsets.all(5.0),
            children: [
              Expanded(
                child: Row(
                  // mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    buildGestureDetectorSlack(context),

                    buildGestureDetectorWhy(),

                    const SizedBox(width: 10,),

                    buildGestureDetectorSolutions(),

                    const SizedBox(width: 10,),

                    buildGestureDetectorResources(),

                    const SizedBox(width: 10,),

                    buildGestureDetectorPricing(),

                    const Spacer(),

                    buildGestureDetectorSignIn(),

                    const SizedBox(width: 10,),

                    buildGestureDetectorGetStarted(),

                    const SizedBox(width: 10,),
                  ],
                ),
              ),
              Expanded(
                child: Row(
                  children: [
                    Expanded(
                      child: Container(
                        height: 75,
                        decoration: const BoxDecoration(
                          color: Color.fromRGBO(3, 5, 39, 10),
                        ),
                        child: Center(
                          child: Expanded(
                            child: Center(
                              child: Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: [
                                  const CircleAvatar(
                                    backgroundColor: Colors.white,
                                    radius: 15.0,
                                    child: Text(
                                      "F",
                                      style: TextStyle(
                                        color: Colors.black,
                                        fontWeight: FontWeight.bold,
                                      ),
                                    ),
                                  ),
                                  const SizedBox(width: 10.0,),
                                  const Text(
                                      "Join us at Frontiers, a conference by Slackm in SF & NYC",
                                    style: TextStyle(
                                      color: Colors.white,
                                    ),
                                  ),

                                  const SizedBox(width: 20.0,),

                                  // Container
                                  Container(
                                    height: 40,
                                    width: 155,
                                    decoration: BoxDecoration(
                                      color: Colors.purple.shade900,
                                      borderRadius: BorderRadius.circular(3.0),
                                    ),
                                    child: const Center(
                                      child: Text(
                                        "REGISTER NOW",
                                        style: TextStyle(
                                          color: Colors.white,
                                          fontWeight: FontWeight.w600,
                                        ),
                                      ),
                                    ),
                                  ),
                                ],
                              ),
                            ),
                          ),
                        ),
                      ),
                    ),
                  ],
                ),
              ),
              Container(height: 100,),
              Expanded(
                child: Row(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Stack(
                      children: [
                        Image.asset(
                            "assets/images/pink_mac_book.jpeg",
                          width: MediaQuery.of(context).size.width * 0.45,
                        ),
                      ],
                    ),
                    Container(width: 50,),

                    const Column(
                      mainAxisAlignment: MainAxisAlignment.start,
                      children: [
                        Text(
                          "Where Work \nHappens",
                          style: TextStyle(
                            fontSize: 80,
                          ),
                        ),
                        Text.rich(
                          TextSpan(
                            text: "When your team needs \n"
                                "to kick off a project, hire\n "
                                "a new employee,\n deploy same\n "
                                "code, review a sales contract, \n"
                                "finalize next year's budget, measure\n"
                                "an A/B test, plan your next office\n"
                                "opening, and more, Slack has you covered.",
                            style: TextStyle(
                              fontWeight: FontWeight.w600,
                            ),
                          ),
                          textAlign: TextAlign.left,
                        ),

                        SizedBox(height: 150,),

                        Text.rich(
                          TextSpan(
                            text: "Already using Slack ? ",
                            children: [
                              TextSpan(
                                text: " Sing in",
                                style: TextStyle(
                                  color: Colors.blue,
                                )
                              )
                            ],
                            style: TextStyle(
                              color: Colors.black,
                            )
                          ),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
            ],
          ),
      ),
    );
  }
}
  
