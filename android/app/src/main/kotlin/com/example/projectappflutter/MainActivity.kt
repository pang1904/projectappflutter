package com.example.projectappflutter

import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugins.connectivity_plus.ConnectivityPlugin
import com.lyokone.location.LocationPlugin

class MainActivity : FlutterActivity() {
    override fun configureFlutterEngine() {
        super.configureFlutterEngine()
        // ลงทะเบียนปลั๊กอินที่ใช้งาน
        ConnectivityPlugin.registerWith(flutterEngine?.plugins)
        LocationPlugin.registerWith(flutterEngine?.plugins)
    }
}
