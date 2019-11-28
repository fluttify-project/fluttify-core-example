![Logo](https://github.com/fluttify-project/fluttify-core-example/blob/develop/other/Logo-Landscape.png?raw=true)

[![Gitter](https://badges.gitter.im/fluttify_project/community.svg)](https://gitter.im/fluttify_project/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

# Fluttify示例工程

## 什么是Fluttify以及解决什么问题?
- `Fluttify`是一个可以为原生SDK生成dart接口的工具.
- 普通flutter插件的开发过程需要开发者同时懂Android和iOS原生(以及之后的flutter for web和desktop), 这对开发者是一个非常大的挑战, 因为大多数开发者都
只精通一个端, 而`Fluttify`的目标是**让不懂原生或者只懂一个原生端的开发者可以无障碍地使用Flutter开发插件和应用**.

## 目前的状态
- 在积极的开发中, 但是由于本人精力有限, 只能在业余时间进行维护.
- 具体的完成度可以查看`output-project`文件夹下的flutter插件工程(可能会有延迟)以及[实验性工程](https://github.com/yohom/amap_search_fluttify)(**推荐**).

## 如何使用Fluttify?
- 请邮件联系我(382146139@qq.com), 并说明来源.

## 目前已知的问题
- 由于Flutter的`MethodChannel`不支持同步调用, 所以当native端的方法需要同步返回对象的时候, 
使用`MethodChannel`的机制就无法满足需求了. 目前官方repo中有相关的[issue](https://github.com/flutter/flutter/issues/28310).
