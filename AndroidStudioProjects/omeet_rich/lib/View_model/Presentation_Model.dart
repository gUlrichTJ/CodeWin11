import 'package:flutter/material.dart';
import 'package:omeet/Resources/App_Colors.dart';
import 'package:omeet/Datas_model/GuideInfo.dart';

class Presentation extends StatefulWidget {

  final List<GuideInfo> guideInfos;


  Presentation({super.key, required this.guideInfos}) {
  }

  // item model to show in pager
  Widget moduleInfos(int index) {
    return Column(
      children: [
        Expanded(child: Image.asset(guideInfos[index].url)),
        Text(guideInfos[index].description,style: TextStyle(color: Colors.white,fontWeight: FontWeight.bold),)
      ],
    );
  }

  @override
  State<StatefulWidget> createState() => _PresentationState();

}

class _PresentationState extends State<Presentation>{
  int pageIndex = 0;

  late PageController pageController;
  @override
  void initState() {
    pageController = PageController(viewportFraction: .95);
    super.initState();
  }

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
          children: [
            Container(
              height: 40,
              alignment: Alignment.center,
              child: Text(widget.guideInfos[pageIndex].title,style: TextStyle(color: Colors.white,fontSize: 18, fontWeight: FontWeight.w400, fontStyle: FontStyle.italic)),

            ),
            Container(
              padding: EdgeInsets.symmetric(vertical: 4),
              child: PageView.builder(
                itemBuilder: (BuildContext context, int index) => widget.moduleInfos(index),
                itemCount: widget.guideInfos.length,
                onPageChanged: (int page) => setState(() {
                  pageIndex = page;
                }),
                controller: pageController,
              ),
            ),

          ],
        ),
      ),
    );

    // TODO: implement build
    throw UnimplementedError();
  }
}
