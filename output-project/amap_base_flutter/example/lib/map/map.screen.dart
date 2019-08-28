import 'package:amap_base_flutter_example/widgets/dimens.dart';
import 'package:amap_base_flutter_example/widgets/function_group.widget.dart';
import 'package:amap_base_flutter_example/widgets/function_item.widget.dart';
import 'package:flutter/material.dart';

import 'create_map/custom_map.screen.dart';
import 'create_map/show_indoor_map.screen.dart';
import 'create_map/show_map.screen.dart';
import 'create_map/switch_map_layer.screen.dart';
import 'draw_on_map/draw_point.screen.dart';
import 'draw_on_map/draw_polygon.screen.dart';
import 'draw_on_map/draw_polyline.screen.dart';
import 'interact_with_map/code_interaction.screen.dart';
import 'interact_with_map/control_interaction.screen.dart';
import 'interact_with_map/gesture_interaction.screen.dart';
import 'interact_with_map/screen_shot.screen.dart';
import 'tools/calcute_distance_screen.dart';
import 'tools/coordinate_transformation_screen.dart';

class MapDemo extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return ListView(
      children: <Widget>[
        FunctionGroup(
          headLabel: '创建地图',
          children: <Widget>[
            FunctionItem(
              label: '显示地图',
              sublabel: 'CreateMapScreen',
              target: ShowMapScreen(),
            ),
            FunctionItem(
              label: '显示室内地图',
              sublabel: 'ShowsIndoorMapScreen',
              target: ShowsIndoorMapScreen(),
            ),
            FunctionItem(
              label: '切换地图图层',
              sublabel: 'SwitchMapLayerScreen',
              target: SwitchMapLayerScreen(),
            ),
            FunctionItem(
              label: '自定义地图',
              sublabel: 'CustomMapScreen',
              target: CustomMapScreen(),
            ),
//            Column(
//              children: <Widget>[
//                ListTile(
//                  title: Text('使用离线地图'),
//                  subtitle: Text('使用离线地图'),
//                  trailing: Icon(Icons.keyboard_arrow_right),
//                  onTap: () => OfflineManager().openOfflineManager(),
//                ),
//                Divider(height: 1, indent: 16),
//              ],
//            ),
          ],
        ),
        SPACE_BIG,
        FunctionGroup(
          headLabel: '与地图交互',
          children: <Widget>[
            FunctionItem(
              label: '控件交互',
              sublabel: 'ControlInteractionScreen',
              target: ControlInteractionScreen(),
            ),
            FunctionItem(
              label: '手势交互',
              sublabel: 'GestureInteractionScreen',
              target: GestureInteractionScreen(),
            ),
            FunctionItem(
              label: '调用方法交互',
              sublabel: 'CodeInteractionScreen',
              target: CodeInteractionScreen(),
            ),
            FunctionItem(
              label: '截图',
              sublabel: 'ScreenShotScreen',
              target: ScreenShotScreen(),
            ),
          ],
        ),
        SPACE_BIG,
        FunctionGroup(
          headLabel: '在地图上绘制',
          children: <Widget>[
            FunctionItem(
              label: '绘制点标记',
              sublabel: 'DrawPointScreen',
              target: DrawPointScreen(),
            ),
            FunctionItem(
              label: '绘制线',
              sublabel: 'DrawPolylineScreen',
              target: DrawPolylineScreen(),
            ),
            FunctionItem(
              label: '绘制多边形',
              sublabel: 'DrawPolygonScreen',
              target: DrawPolygonScreen(),
            ),
          ],
        ),
        SPACE_BIG,
        FunctionGroup(
          headLabel: "工具",
          children: <Widget>[
            FunctionItem(
              label: "坐标转换",
              sublabel: "CoordinateTransformationScreen",
              target: CoordinateTransformationScreen(),
            ),
            FunctionItem(
              label: "两点间距离计算",
              sublabel: "CalcuteDistanceScreen",
              target: CalcuteDistanceScreen(),
            ),
          ],
        ),
      ],
    );
  }
}
