package com.example.appcentertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.push.Push



class MainActivity : AppCompatActivity() {

    private val test: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("AppCenterTest")



        AppCenter.start(application, "a3817f5e-fc9a-4c07-82fa-d6b83982f042",
                Analytics::class.java, Crashes::class.java)
        AppCenter.start(application, "a3817f5e-fc9a-4c07-82fa-d6b83982f042", Push::class.java)
        //val test = ""
        if(test!!){
            println("テスト")
        }

        Analytics.trackEvent("My custom event")
    }
}
