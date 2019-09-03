package me.yohom.amap_base_flutter

import android.os.Bundle
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.PluginRegistry.Registrar

val REF_MAP = mutableMapOf<Int, Any>()

@Suppress("FunctionName", "UsePropertyAccessSyntax", "RedundantUnitReturnType", "UNUSED_PARAMETER", "SpellCheckingInspection", "ConvertToStringTemplate", "DEPRECATION", "UNUSED_VARIABLE")
class AmapBaseFlutterPlugin {
    companion object {
        @JvmStatic
        fun registerWith(registrar: Registrar) {
            val channel = MethodChannel(registrar.messenger(), "me.yohom/amap_base_flutter")

            channel.setMethodCallHandler { methodCall, methodResult ->
                val args = methodCall.arguments as? Map<String, Any> ?: mapOf()
                when (methodCall.method) {
                    // 获取Application对象
                    "ObjectFactory::getandroid_app_Application" -> {
                        methodResult.success(registrar.activity().application.apply { REF_MAP[hashCode()] = this }.hashCode())
                    }
                    // 获取FlutterActivity对象
                    "ObjectFactory::getandroid_app_Activity" -> {
                        methodResult.success(registrar.activity().apply { REF_MAP[hashCode()] = this }.hashCode())
                    }
                    // 创建android.os.Bundle对象
                    "ObjectFactory::createandroid_os_Bundle" -> {
                        methodResult.success(Bundle().apply { REF_MAP[hashCode()] = this }.hashCode())
                    }
                    // 释放一个对象
                    "ObjectFactory::release" -> {
                        REF_MAP.remove(args["refId"] as Int)
                        methodResult.success("success")
                    }
                    // 清空REF_MAP中所有对象
                    "ObjectFactory::clearRefMap" -> {
                        REF_MAP.clear()
                        methodResult.success("success")
                    }
                    else -> {
                        handlerMap[methodCall.method]?.invoke(registrar, args, methodResult) ?: methodResult.notImplemented()
                    }
                }
            }

            // 注册View
            
		}

        private val handlerMap = mapOf<String, (Registrar, Map<String, Any>, MethodChannel.Result) -> Unit>(
                
        )
    }
}