![Logo](https://github.com/fluttify-project/fluttify-core-example/blob/develop/other/Logo-Landscape.png?raw=true)

[![Gitter](https://badges.gitter.im/fluttify_project/community.svg)](https://gitter.im/fluttify_project/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

[中文文档](https://github.com/fluttify-project/fluttify-core-example/blob/develop/README_CN.md)

# Fluttify Example Project

## What is `Fluttify` and what problems does it solve?
- `Fluttify` is a tool that generates the dart interface for the native(currently Android/iOS) SDK.
- The development process of ordinary flutter requires developers to understand both Android and iOS natively (and later `Flutter for web` and `Desktop`), which is a big challenge for developers because most developers are proficient with only one platform, `Fluttify`'s goal is to **make it easy to develop flutter plugins for who do not master or only master one platform**.

## Current Status
- In active development, but due to my limited energy, I can only do maintenance in my spare time.

## How to use Fluttify?
- Please contact me by email (382146139@qq.com) and explain the source.

## Known Issue
Since Flutter's `MethodChannel` does not support synchronous calls, when methods on the native side need to return objects synchronously, The mechanism for using `MethodChannel` does not meet the requirements. There is currently a [issue](https://github.com/flutter/flutter/issues/28310) related to this in the official repo.
