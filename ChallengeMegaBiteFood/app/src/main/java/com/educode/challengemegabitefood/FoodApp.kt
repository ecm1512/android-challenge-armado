package com.educode.challengemegabitefood

import android.app.Application
import com.educode.challengemegabitefood.module.initDI

class FoodApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initDI()
    }
}