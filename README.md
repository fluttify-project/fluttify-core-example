# Fluttify示例工程

## 什么是Fluttify?
- `Fluttify`是一个可以为原生SDK生成dart接口的工具.
- `Fluttify`的目标是**让不懂原生或者只懂一个原生端的开发者可以无障碍地使用Flutter开发应用**.

## 目前的状态
- 在积极的开发中, 但是由于本人精力有限, 只能在业余时间进行维护, 目前有长期维护的意向.
- 具体的完成度可以查看`output-project`文件夹下的flutter插件工程.

## 路线图
- `Fluttify`的第一步是在`高德地图`sdk上实现大部分功能.
- 第二步是建立一个网站(如果可以的话使用Flutter构建)开始进行内测.
- 第三步再开放给所有人使用.

## 目前已知的问题
- 由于Flutter的`MethodChannel`不支持同步调用, 所以当native端的方法需要同步返回对象的时候, 
使用`MethodChannel`的机制就无法满足需求了. 目前官方repo中有相关的[issue](https://github.com/flutter/flutter/issues/28310).