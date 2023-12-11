import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:omeet_rich/Datas_model/GuideInfo.dart';
import 'package:omeet_rich/Resources/App_Colors.dart';
import 'package:omeet_rich/Utils/GeneralUtils.dart';
import 'package:omeet_rich/View_model/Presentation_Model.dart';
import 'package:omeet_rich/View_model/Registration_Model.dart';
import 'package:omeet_rich/View_model/Usage_Condition_Model.dart';

class FirstPage extends StatefulWidget {


  @override
  State<StatefulWidget> createState() =>_FirstPageState();

}

class _FirstPageState extends State<FirstPage>{

  int _step = 1;
  late PageController _pageController;
  late GlobalKey<FormState> formKey;

  double _progressWidth = 100;

  var _factor = 1/3;

  var _isThirdStep = false;

  final _actions = ["Accepter", "Enregistrer", "Entrer"];
  late String _action;

  double _pageOffset = 0;

  @override
  void initState() {
    // TODO: implement initState
    _action = _actions[_step];
    _pageController = PageController();
    _pageController.addListener(() {
      _pageOffset = _pageController.offset;
      print(_pageOffset);
    });
    formKey = GlobalKey<FormState>();
    super.initState();
  }

  @override
  void dispose() {
    // TODO: implement dispose
    _pageController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      width: ScreenSize.width,
      height: ScreenSize.height,
      decoration: BoxDecoration(gradient: LinearGradient(colors: [AppColors.appRedDark,AppColors.appBlueDark,AppColors.appGreenDark],begin: Alignment.topLeft,end: Alignment.bottomRight)),
      padding: EdgeInsets.only(left: 4,right: 4,top: 16,bottom: 10),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Text("Bienvenue dans l'Omega verse",style: TextStyle(color: Colors.white,fontSize: 22,fontWeight: FontWeight.bold),),
          SizedBox(height: 6,),
          Text("Premiers Pas",style: TextStyle(color: AppColors.appRed,fontSize: 20,fontWeight: FontWeight.bold),),
          SizedBox(height: 10,),
          Container(
            height: ScreenSize.height*3/5,
            child: PageView(
              children: [
                UsageCondition(
            condition :
                "Null safety "
                "The Dart language enforces sound null safety. "
                "Null safety prevents an error that results from unintentional access of variables set to null. The error is called a null dereference error. A null dereference error occurs when you access a property or call a method on an expression that evaluates to null. An exception to this rule is when null supports the property of method, like toString() or hashCode. With null safety, the Dart compiler detects these potential errors at compile time."
                "For example, say you want to find the absolute value of an int variable i. If i is null, calling i.abs() causes a null dereference error. In other languages, trying this could lead to a runtime error, but Dart’s compiler prohibits these actions. Therefore, Dart apps can’t cause runtime errors."
                ),
                Registration(formKey),
                Presentation(
                  guideInfos:
                  [
                    GuideInfo("Interactive chats", "Resources/icons8_chat_100px.png", "The const keyword isn’t just for declaring constant variables. You can also use it to create constant values, as well as to declare constructors that create constant values. Any variable can have a constant value."),
                    GuideInfo("Interactive chats", "Resources/icons8_chat_100px.png", "The const keyword isn’t just for declaring constant variables. You can also use it to create constant values, as well as to declare constructors that create constant values. Any variable can have a constant value."),
                    GuideInfo("Interactive chats", "Resources/icons8_chat_100px.png", "The const keyword isn’t just for declaring constant variables. You can also use it to create constant values, as well as to declare constructors that create constant values. Any variable can have a constant value."),
                    GuideInfo("Interactive chats", "Resources/icons8_chat_100px.png", "The const keyword isn’t just for declaring constant variables. You can also use it to create constant values, as well as to declare constructors that create constant values. Any variable can have a constant value."),
                    GuideInfo("Interactive chats", "Resources/icons8_chat_100px.png", "The const keyword isn’t just for declaring constant variables. You can also use it to create constant values, as well as to declare constructors that create constant values. Any variable can have a constant value."),
                  ]
                ),
              ],
              allowImplicitScrolling: false,
              controller: _pageController,
            ),
          ),
          SizedBox(height: 8,),
          LinearProgress(),
          SizedBox(height: 18,),
          InkWell(
            child: AnimatedContainer(
              duration: Duration(milliseconds: 400),
              decoration: BoxDecoration(color: _isThirdStep ? AppColors.appRed : Colors.black,borderRadius: BorderRadius.circular(8)),
              padding: EdgeInsets.symmetric(horizontal: 6,vertical: 3),
              child: Text(_action, style: TextStyle(fontWeight: FontWeight.bold,fontSize: 15),),
            ),
            onTap: () => _step==3? Navigator.of(context).pushNamed("HomePage") : changeStep(up: true)
          )
        ],
      ),
    );
  }

  Widget LinearProgress() {
    return ClipRRect(
      borderRadius: BorderRadius.circular(6),
      child: SizedBox(
        width: _progressWidth,
        height: 4,
        child: Stack(
          children: [
            Container(
              width: _progressWidth,
              height: double.infinity,
              decoration: BoxDecoration(color: Colors.white.withOpacity(.5)),
            ),
            ShaderMask(
              shaderCallback: (bound) {
                // bound = Rect.fromCenter(center: Offset(ScreenSize()._width/2, ), width: _progressWidth, height: 12)
                return
                  LinearGradient(colors: [AppColors.appGreenDark,AppColors.appBlueDark,AppColors.appRedDark]).createShader(bound) ;
              },
              child: AnimatedContainer(
                duration: Duration(milliseconds: 500),
                width: _progressWidth*_factor,
                height: 12,
              ),
            ),
          ],
        ),
      ),
    );
  }

  changeStep({required bool up}) {
    if (up) {
      _step++;
      _step == 3 ? _isThirdStep = true : _isThirdStep = false;
      _pageController.animateToPage(
          _step - 1, duration: Duration(milliseconds: 800),
          curve: Curves.linear);
    }
    else {
      if (_step == 3) _isThirdStep = false;
      _step--;
      _pageController.animateToPage(
          _step - 1, duration: Duration(milliseconds: 800),
          curve: Curves.linear);
    }
  }
}