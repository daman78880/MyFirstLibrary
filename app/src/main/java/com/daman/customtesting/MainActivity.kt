package com.daman.customtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daman.customtesting.MyUtils.printToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printToast(this@MainActivity,"FHSVDH")
    }
}