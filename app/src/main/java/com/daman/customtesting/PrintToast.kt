package com.daman.customtesting

import android.content.Context
import android.widget.Toast

object PrintToast {
    fun print(context: Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}