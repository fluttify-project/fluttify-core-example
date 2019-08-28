package me.yohom.amap_base_flutter

import android.content.Context
import android.view.View

import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory
import io.flutter.plugin.common.PluginRegistry.Registrar

class TextureMapViewFactory(private val registrar: Registrar) : PlatformViewFactory(StandardMessageCodec.INSTANCE) {

    override fun create(context: Context, id: Int, params: Any?): PlatformView {
        return object : PlatformView {
            private val view = com.amap.api.maps.TextureMapView(registrar.activity())

            // 构造完成后马上加入REF_MAP
            override fun getView(): View = view.apply { REF_MAP[id] = this }

            // dispose后从REF_MAP中删除
            override fun dispose() {
                REF_MAP.remove(id)
            }
        }
    }
}