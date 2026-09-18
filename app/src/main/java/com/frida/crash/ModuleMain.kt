package com.frida.crash

import android.util.Log
import io.github.libxposed.api.XposedModule
import io.github.libxposed.api.XposedModuleInterface
import io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam
import io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam

class ModuleMain : XposedModule() {

    companion object {
        const val TAG = "FridaCrash"
    }

    override fun onModuleLoaded(param: ModuleLoadedParam) {
        log(Log.INFO, TAG, "onModuleLoaded: " + param.processName)
//        log(Log.INFO, TAG, "framework: $frameworkName($frameworkVersionCode) API $apiVersion")

        val hasProp: (Long) -> Boolean = { prop -> frameworkProperties.and(prop) != 0L }
//        log(Log.INFO, TAG, "system supported: " + hasProp(PROP_CAP_SYSTEM))
//        log(Log.INFO, TAG, "remote supported: " + hasProp(PROP_CAP_REMOTE))
//        log(Log.INFO, TAG, "api protection: " + hasProp(PROP_RT_API_PROTECTION))
    }

    override fun onPackageLoaded(param: PackageLoadedParam) {
        log(Log.INFO, TAG, "onPackageLoaded: " + param.packageName)
//        log(Log.INFO, TAG, "default classloader is " + param.defaultClassLoader)
    }

    override fun onPackageReady(param: XposedModuleInterface.PackageReadyParam) {
        log(Log.INFO, TAG, "onPackageReady: " + param.packageName)
//        log(Log.INFO, TAG, "app classloader is " + param.classLoader)
//        log(Log.INFO, TAG, "app acf is " + param.appComponentFactory)
//        log(Log.INFO, TAG, "module apk path: " + this.moduleApplicationInfo.sourceDir)

        if (!param.isFirstPackage) return

        hook(
            Class.forName("android.app.Application")
            .getMethod("onCreate")
        ).intercept { chain ->
            chain.proceed()
        }
    }

    override fun onSystemServerStarting(param: XposedModuleInterface.SystemServerStartingParam) {
//        log(Log.INFO, TAG, "onSystemServerStarting, system classloader: " + param.classLoader)
    }
}