import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:omeet_rich/Datas_model/GuideInfo.dart';
import 'package:omeet_rich/Resources/App_Colors.dart';

class UsageCondition extends StatefulWidget {


  UsageCondition({super.key, required this.condition});

  String condition;



  @override
  State<StatefulWidget> createState() => _UsageConditionState();

}

class _UsageConditionState extends State<UsageCondition>{
  int pageIndex = 0;



  @override
  Widget build(BuildContext context) {

    return Center(
      child: Container(
        width: MediaQuery.of(context).size.width-16,
        padding: EdgeInsets.symmetric(horizontal: 6),
        decoration: BoxDecoration(
            borderRadius: BorderRadius.all(Radius.circular(12)),
            color: AppColors.appRedDark.withOpacity(.6)),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              "Conditions d'utilisation",
              style: TextStyle(fontWeight: FontWeight.bold,fontSize: 15),
            ),
            SizedBox(height: 8,),
            SingleChildScrollView(
              child: Text(
                widget.condition,
                style: TextStyle(fontWeight: FontWeight.w400,fontSize: 14),
              ),
            ),
          ],
        )
      ),
    );

  }
}
