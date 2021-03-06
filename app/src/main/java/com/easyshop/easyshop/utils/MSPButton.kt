package com.easyshop.easyshop.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class MSPButton(context: Context, attrs: AttributeSet): AppCompatButton (context,attrs){

    init {
        //Call the function to apply the font the components
        applyFont()
    }

    //This is used to get the file from the assets and set it to title textView
    private fun applyFont() {
        val typeface: Typeface = Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        setTypeface(typeface)
    }
}