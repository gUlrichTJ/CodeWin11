

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:omeet_rich/Resources/App_Colors.dart';
import 'package:omeet_rich/Utils/GeneralUtils.dart';

class HomePage extends StatefulWidget {


  @override
  State<StatefulWidget> createState() => _HomePageState();



}

class _HomePageState extends State<HomePage>{
  
  
  var profilImage;

  String appLabel = "Omeet App...";



  var listTypes = ["Communauté","Inbox","Groupe"];

  var pageIndex = 0;

  var updateItemsCount = [0,43,7];

  var updateContentsCount = [13, 414, 1000];


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        toolbarHeight: 55,
        leading: Container(
          padding: EdgeInsets.only(left: 6),
          child: InkWell(
            child: CircleAvatar(
              radius: 19,
              backgroundColor: Colors.black,
              child: profilImage==null ? Icon(Icons.account_circle_rounded) : Image.asset(profilImage) ,
            ),
            onTap: () {},
            onLongPress: () {},
          ),

        ),
        title: Padding(padding: EdgeInsets.only(left: 8),
          child: Text(appLabel, style: TextStyle(color: Colors.white,fontSize: 21, fontWeight: FontWeight.bold),
        ),
      ),
        actions: [
          Icon(CupertinoIcons.search),
          Container(
            width: 38,height: 38,
            decoration: BoxDecoration(gradient: LinearGradient(colors: [Color(0x5900CB),Color(0x8B199D), Color(0x6E0195),])),
            padding: EdgeInsets.all(2),
            child: Container(
              width: 34,height: 34,
              alignment: Alignment.center,
              decoration: BoxDecoration(color: Colors.black),
              child: Image.asset("icons8_portal_32px.png",color: AppColors.appRed,width: 30, height: 30,),
            )
          )
        ],
      ),
      body: Stack(
        children: [
          Expanded(
              child: Column(
                children: [
                  Container(
                    width: ScreenSize.width,
                    height: 55,
                    alignment: Alignment.center,
                    decoration: BoxDecoration(color: AppColors.light2, boxShadow: [BoxShadow(color: AppColors.dark1,offset: Offset(0, 2),spreadRadius: 4)]),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Row(
                          children: [
                            SizedBox(width: 8,),
                            Flexible(flex: 1,child: FittedBox(child: Text(listTypes[pageIndex], style: TextStyle(color: AppColors.appRed, fontSize: 19, fontWeight: FontWeight.bold),))),
                            Container(
                              height: 24,
                              constraints: BoxConstraints(minWidth: 24),
                              alignment: Alignment.center,
                              decoration: BoxDecoration(color: Colors.black.withOpacity(updateItemsCount[pageIndex]==0 ? .7 : 1), border: Border.all(color: AppColors.appRed,width: 2, strokeAlign: BorderSide.strokeAlignCenter),borderRadius: BorderRadius.circular(4)),
                              child: Text(updateItemsCount[pageIndex].toString(),style: TextStyle(color: Colors.black.withOpacity(updateItemsCount[pageIndex]==0 ? .7 : 1)),),
                            )

                          ],
                        ),
                        Row(
                          children: [
                            Padding(
                              padding: const EdgeInsets.only(right: 5.0),
                              child: InkWell(
                                onTap: () {},
                                child: Stack(
                                  alignment: Alignment.bottomCenter,
                                  children: [
                                    Column(
                                      children: [
                                        Container(
                                          width: 30,
                                          height: 30,
                                          decoration: BoxDecoration(border: Border.all(color: AppColors.appRed,width: 2, strokeAlign: BorderSide.strokeAlignCenter),borderRadius: BorderRadius.circular(20)),
                                          alignment: Alignment.center,
                                          child: Icon(Icons.stream_rounded),
                                        ),
                                        SizedBox(height: 4,)
                                      ],
                                    ),
                                    Opacity(
                                      opacity: updateContentsCount[pageIndex]==0 ? 0 : 1,
                                      child: Container(
                                        decoration: BoxDecoration(color: AppColors.light2, borderRadius: BorderRadius.all(Radius.circular(8))),
                                        padding: EdgeInsets.symmetric(vertical: 1,horizontal: 4),
                                        alignment: Alignment.center,
                                        child: Text(updateContentsCount[pageIndex].toString(), style: TextStyle(color: Colors.black.withOpacity(.9), fontSize: 13, fontWeight: FontWeight.w500),),
                                      ),
                                    )
                                  ],
                                ),
                              ),
                            ),
                            Padding(
                              padding: const EdgeInsets.only(right: 5.0),
                              child: InkWell(
                                onTap: () {},
                                child: Stack(
                                  alignment: Alignment.bottomCenter,
                                  children: [
                                    Column(
                                      children: [
                                        Container(
                                          width: 30,
                                          height: 30,
                                          decoration: BoxDecoration(border: Border.all(color: AppColors.appRed,width: 2, strokeAlign: BorderSide.strokeAlignCenter),borderRadius: BorderRadius.circular(20)),
                                          alignment: Alignment.center,
                                          child: Icon(Icons.person_rounded),
                                        ),
                                        SizedBox(height: 4,)
                                      ],
                                    ),
                                    Opacity(
                                      opacity: updateContentsCount[pageIndex]==0 ? 0 : 1,
                                      child: Container(
                                        decoration: BoxDecoration(color: AppColors.light2, borderRadius: BorderRadius.all(Radius.circular(8))),
                                        padding: EdgeInsets.symmetric(vertical: 1,horizontal: 4),
                                        alignment: Alignment.center,
                                        child: Text(updateContentsCount[pageIndex].toString(), style: TextStyle(color: Colors.black.withOpacity(.9), fontSize: 13, fontWeight: FontWeight.w500),),
                                      ),
                                    )
                                  ],
                                ),
                              ),
                            ),
                            Padding(
                              padding: const EdgeInsets.only(right: 5.0),
                              child: InkWell(
                                onTap: () {},
                                child: Stack(
                                  alignment: Alignment.bottomCenter,
                                  children: [
                                    Column(
                                      children: [
                                        Container(
                                          width: 30,
                                          height: 30,
                                          decoration: BoxDecoration(border: Border.all(color: AppColors.appRed,width: 2, strokeAlign: BorderSide.strokeAlignCenter),borderRadius: BorderRadius.circular(20)),
                                          alignment: Alignment.center,
                                          child: Icon(Icons.groups_rounded),
                                        ),
                                        SizedBox(height: 4,)
                                      ],
                                    ),
                                    Opacity(
                                      opacity: updateContentsCount[pageIndex]==0 ? 0 : 1,
                                      child: Container(
                                        decoration: BoxDecoration(color: AppColors.light2, borderRadius: BorderRadius.all(Radius.circular(8))),
                                        padding: EdgeInsets.symmetric(vertical: 1,horizontal: 4),
                                        alignment: Alignment.center,
                                        child: Text(updateContentsCount[pageIndex].toString(), style: TextStyle(color: Colors.black.withOpacity(.9), fontSize: 13, fontWeight: FontWeight.w500),),
                                      ),
                                    )
                                  ],
                                ),
                              ),
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                  PageView(
                    children: [

                    ],
                  )
                ],
              )
          )
        ],
      ),
    );

  }
}