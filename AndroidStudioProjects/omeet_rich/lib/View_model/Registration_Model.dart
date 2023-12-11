import 'package:animations/animations.dart';
import 'package:flutter/material.dart';
import 'package:omeet/Resources/App_Colors.dart';
import 'package:omeet/Datas_model/GuideInfo.dart';

class Registration extends StatefulWidget {


  GlobalKey<FormState> formKey;

  Registration(this.formKey);

  @override
  State<StatefulWidget> createState() => _RegistrationState();

}

class _RegistrationState extends State<Registration>{
  int pageIndex = 0;

  final opacities = [0.0,0.3];
  final colors = [Colors.black,AppColors.appBlue];
  final sizes = [24, 28];

  late double phoneOpacity, mailOpacity;
  var phoneColor, mailColor;
  var phoneSize, mailSize;

  bool isPhone = true;
  bool firstStep = true;
  //value to update for forms sitch
  bool _isSignIn = true;
  bool phone = true;
  // what conider in switch
  bool? modeSwich ;//sign in mode

  var formOpacity = 1.0;

  @override
  Widget build(BuildContext context) {

    phoneOpacity = opacities[1];
    phoneColor = colors[1];
    phoneSize = sizes[1];

    mailOpacity = opacities[0];
    mailColor = colors[0];
    mailSize = sizes[0];


    return Center(
      child: Container(

        width: MediaQuery.of(context).size.width-16,
        padding: EdgeInsets.symmetric(horizontal: 6,vertical: 12),
        decoration: BoxDecoration(borderRadius: BorderRadius.all(Radius.circular(12)),
            color: AppColors.appBlueDark.withOpacity(.6)),
        child: Column(
          children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Align(
                  alignment: firstStep ? Alignment.topRight : Alignment.topCenter,
                  child: Padding(
                    padding: const EdgeInsets.symmetric(vertical: 4.0),
                    child: Text('Inscrivez vos informations',style: TextStyle(fontSize: 14,fontWeight: FontWeight.bold,color: Colors.white),),
                  ),
                ),
                Row(
                  children: [
                    InkWell(
                      child: Container(
                        width: 30,
                        height: 30,
                        padding: EdgeInsets.all(2),
                        alignment: Alignment.center,
                        decoration: BoxDecoration(shape: BoxShape.circle,color: Colors.black.withOpacity(phoneOpacity)),
                        child: AnimatedSize(
                          duration: const Duration(milliseconds: 400),
                            child: Icon(Icons.phone_rounded,color: phoneColor,size: phoneSize,)),
                      ),
                      onTap: () {
                        if(!isPhone) setState(() => setValues());
                      },
                    ),
                    SizedBox(width: 8,),
                    InkWell(
                      child: Container(
                        width: 30,
                        height: 30,
                        padding: EdgeInsets.all(2),
                        decoration: BoxDecoration(shape: BoxShape.circle,color: Colors.black.withOpacity(mailOpacity)),
                        child: AnimatedSize(
                            duration: const Duration(milliseconds: 400),
                            child: Icon(Icons.mail_rounded,color: mailColor,size: mailSize,)),
                      ),
                      onTap: (){
                        if(isPhone) setState(() => setValues());
                      },
                    ),
                  ],
                )
              ],
            ),
            SizedBox(
              height: 12,
            ),
            Form(
              key: widget.formKey,
              child: Expanded(
                child: setInfosUI(),
              ),
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.end,
              children: [
                Text('vous avez déjà un compte ? Appuyez sur',style: TextStyle(fontSize: 13,fontWeight: FontWeight.bold,color: Colors.white),),
                InkWell(
                    child: Text('   Connecter ',style: TextStyle(fontSize: 13,fontWeight: FontWeight.bold,color: AppColors.appBlue)),
                  onTap: (){
                      formOpacity = 0.0;
                      modeSwich = false;
                       },
                ),
              ],
            )
          ],
        ),
      )
    );

    throw UnimplementedError();
  }

  void setValues() {
    formOpacity = 0.0;
    modeSwich = true;
    if(isPhone) {
      isPhone = false;

      phoneOpacity = opacities[0];
      phoneColor = colors[0];
      phoneSize = sizes[0];

      mailOpacity = opacities[1];
      mailColor = colors[1];
      mailSize = sizes[1];

    }
    else{
      isPhone = true;

      phoneOpacity = opacities[1];
      phoneColor = colors[1];
      phoneSize = sizes[1];

      mailOpacity = opacities[0];
      mailColor = colors[0];
      mailSize = sizes[0];
    }
  }

  Widget setInfosUI() {
    
    return PageTransitionSwitcher(
      duration:Duration(milliseconds: 400),
      transitionBuilder: (child, animation, secondaryAnimation) =>
      SharedAxisTransition(child: child, animation: animation, secondaryAnimation: secondaryAnimation, transitionType: SharedAxisTransitionType.vertical),
      child: buildContainer(),
    ) ;

    // return AnimatedOpacity(
    //   duration:Duration(milliseconds: 500),
    //   opacity: formOpacity,
    //   onEnd: sitchUI(),
    //   child: Column(
    //     //TODO
    //     children: [
    //       if(register)
    //       Column(
    //         children: [
    //           TextFormField(
    //             decoration: InputDecoration(
    //               border: OutlineInputBorder(
    //                 borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
    //                 borderRadius: BorderRadius.all(Radius.circular(6)),
    //               ),
    //               labelText: "Nom d'utilisateur",
    //               labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
    //               hintText: "@",
    //               hintStyle: TextStyle(color: AppColors.appBlue.withOpacity(.7),fontSize: 14,fontWeight: FontWeight.bold),
    //               contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
    //               errorStyle: TextStyle(color: Colors.white,fontSize: 12,fontWeight: FontWeight.normal),
    //             ),
    //             autocorrect: true,
    //             autofocus: true,
    //             cursorColor: AppColors.appBlue,
    //             style: TextStyle(color: Colors.white,fontSize: 14,fontWeight: FontWeight.bold),
    //             validator: ((val)  => val?.length == 0 ? "Specifiez un nom d'utilisateur": null),
    //
    //           ),
    //           SizedBox(
    //             height: 10,
    //           ),
    //         ],
    //       ),
    //       if(phone)
    //       TextFormField(
    //         decoration: InputDecoration(
    //           border: OutlineInputBorder(
    //             borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
    //             borderRadius: BorderRadius.all(Radius.circular(6)),
    //           ),
    //           labelText: "Numero de telephone",
    //           labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
    //           hintText: "XXX",
    //           hintStyle: TextStyle(color: AppColors.appBlue.withOpacity(.7),fontSize: 14,fontWeight: FontWeight.bold),
    //           contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
    //           errorStyle: TextStyle(color: Colors.white,fontSize: 12,fontWeight: FontWeight.normal),
    //           prefixText: getIndicator(),
    //           prefixStyle: TextStyle(color: Colors.white,fontSize: 14,fontWeight: FontWeight.bold),
    //           suffixIcon: InkWell(
    //             child: Image.asset(getIndicatorAsset(),width: 24,height: 24,),
    //             onTap: countryCode(),
    //           ),
    //         ),
    //         autocorrect: true,
    //         autofocus: true,
    //         cursorColor: AppColors.appBlue,
    //         style: TextStyle(color: AppColors.appBlue,fontSize: 14,fontWeight: FontWeight.bold),
    //         validator: ((val)  => val?.length == 0 ? "Specifiez un nom d'utilisateur": null),
    //
    //       )
    //       else Column(
    //         children: [
    //           TextFormField(
    //             decoration: InputDecoration(
    //             border: OutlineInputBorder(
    //             borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
    //             borderRadius: BorderRadius.all(Radius.circular(6)),
    //             ),
    //             labelText: "Adresse mail",
    //             labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
    //             contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
    //             errorStyle: TextStyle(color: Colors.white,fontSize: 12,fontWeight: FontWeight.normal),
    //             ),
    //             autocorrect: true,
    //             autofocus: true,
    //             cursorColor: AppColors.appBlue,
    //             style: TextStyle(color: AppColors.appBlue,fontSize: 14,fontWeight: FontWeight.bold),
    //             validator: ((val)  => (val!=null && (val.isEmpty && val.endsWith("other")))? "Specifiez une adresse mail valide": null),
    //   ),
    //           SizedBox(
    //             height: 10,
    //           ),
    //           TextFormField(
    //             decoration: InputDecoration(
    //             border: OutlineInputBorder(
    //             borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
    //             borderRadius: BorderRadius.all(Radius.circular(6)),
    //             ),
    //             labelText: "Mot de passe",
    //             labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
    //             contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
    //             errorStyle: TextStyle(color: Colors.white,fontSize: 11,fontWeight: FontWeight.normal),
    //             prefixText: getIndicator(),
    //             prefixStyle: TextStyle(color: Colors.white,fontSize: 14,fontWeight: FontWeight.bold),
    //             suffixIcon: InkWell(
    //             child: Image.asset(getIndicatorAsset(),width: 24,height: 24,),
    //             onTap: countryCode(),
    //             ),
    //             ),
    //             autocorrect: true,
    //             autofocus: true,
    //             obscureText: true,
    //             cursorColor: AppColors.appBlue,
    //             style: TextStyle(color: AppColors.appBlue,fontSize: 14,fontWeight: FontWeight.bold),
    //             validator: ((val)  => (val!=null &&val.length >= 6) ? "Specifiez un mot de passe d'au moins 6 caracteres": null),
    //   ),
    //         ],
    //       ),
    //
    //   ],
    //   ),
    // ) ;
  }

  Widget buildContainer() {
    return Column(
      //TODO
      children: [
        if(_isSignIn)
          Column(
            children: [
              TextFormField(
                decoration: InputDecoration(
                  border: OutlineInputBorder(
                    borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
                    borderRadius: BorderRadius.all(Radius.circular(6)),
                  ),
                  labelText: "Nom d'utilisateur",
                  labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
                  hintText: "@",
                  hintStyle: TextStyle(color: AppColors.appBlue.withOpacity(.7),fontSize: 14,fontWeight: FontWeight.bold),
                  contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
                  errorStyle: TextStyle(color: Colors.white,fontSize: 12,fontWeight: FontWeight.normal),
                ),
                autocorrect: true,
                autofocus: true,
                cursorColor: AppColors.appBlue,
                style: TextStyle(color: Colors.white,fontSize: 14,fontWeight: FontWeight.bold),
                validator: ((val)  => val?.length == 0 ? "Specifiez un nom d'utilisateur": null),

              ),
              SizedBox(
                height: 10,
              ),
            ],
          ),
        if(phone)
          TextFormField(
            decoration: InputDecoration(
              border: OutlineInputBorder(
                borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
                borderRadius: BorderRadius.all(Radius.circular(6)),
              ),
              labelText: "Numero de telephone",
              labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
              hintText: "XXX",
              hintStyle: TextStyle(color: AppColors.appBlue.withOpacity(.7),fontSize: 14,fontWeight: FontWeight.bold),
              contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
              errorStyle: TextStyle(color: Colors.white,fontSize: 12,fontWeight: FontWeight.normal),
              prefixText: getIndicator(),
              prefixStyle: TextStyle(color: Colors.white,fontSize: 14,fontWeight: FontWeight.bold),
              suffixIcon: InkWell(
                child: Image.asset(getIndicatorAsset(),width: 24,height: 24,),
                onTap: countryCode(),
              ),
            ),
            autocorrect: true,
            autofocus: true,
            cursorColor: AppColors.appBlue,
            style: TextStyle(color: AppColors.appBlue,fontSize: 14,fontWeight: FontWeight.bold),
            validator: ((val)  => val?.length == 0 ? "Specifiez un nom d'utilisateur": null),

          )
        else Column(
          children: [
            TextFormField(
              decoration: InputDecoration(
                border: OutlineInputBorder(
                  borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
                  borderRadius: BorderRadius.all(Radius.circular(6)),
                ),
                labelText: "Adresse mail",
                labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
                contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
                errorStyle: TextStyle(color: Colors.white,fontSize: 12,fontWeight: FontWeight.normal),
              ),
              autocorrect: true,
              autofocus: true,
              cursorColor: AppColors.appBlue,
              style: TextStyle(color: AppColors.appBlue,fontSize: 14,fontWeight: FontWeight.bold),
              validator: ((val)  => (val!=null && (val.isEmpty && val.endsWith("other")))? "Specifiez une adresse mail valide": null),
            ),
            SizedBox(
              height: 10,
            ),
            TextFormField(
              decoration: InputDecoration(
                border: OutlineInputBorder(
                  borderSide:BorderSide(color: AppColors.appBlue,width: 1.4),
                  borderRadius: BorderRadius.all(Radius.circular(6)),
                ),
                labelText: "Mot de passe",
                labelStyle: TextStyle(color: AppColors.appBlue,fontSize: 11,fontWeight: FontWeight.bold),
                contentPadding: EdgeInsets.symmetric(vertical: 4,horizontal: 8),
                errorStyle: TextStyle(color: Colors.white,fontSize: 11,fontWeight: FontWeight.normal),
                prefixText: getIndicator(),
                prefixStyle: TextStyle(color: Colors.white,fontSize: 14,fontWeight: FontWeight.bold),
                suffixIcon: InkWell(
                  child: Image.asset(getIndicatorAsset(),width: 24,height: 24,),
                  onTap: countryCode(),
                ),
              ),
              autocorrect: true,
              autofocus: true,
              obscureText: true,
              cursorColor: AppColors.appBlue,
              style: TextStyle(color: AppColors.appBlue,fontSize: 14,fontWeight: FontWeight.bold),
              validator: ((val)  => (val!=null &&val.length >= 6) ? "Specifiez un mot de passe d'au moins 6 caracteres": null),
            ),
          ],
        ),

      ],
    );
  }

  getIndicator() {
    //TODO
  }

  String getIndicatorAsset() {
    //TODO
    return Icons.abc.toString();
  }

  countryCode() {
    //TODO
  }

  sitchUI() {
    if(modeSwich==true) phone = !phone;
    else _isSignIn = !_isSignIn;
    formOpacity = 1.0;
  }
}
