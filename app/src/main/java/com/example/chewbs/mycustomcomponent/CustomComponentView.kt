package com.example.chewbs.mycustomcomponent

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class CustomComponentView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    companion object {
        private const val DEFAULT_TXT_COLOR = Color.BLACK
    }

    private var txtcolor = DEFAULT_TXT_COLOR

    init {
        inflate(context, R.layout.customcomponent, this)

        val imageView: ImageView = findViewById(R.id.image)
        val editText: EditText = findViewById(R.id.edittext)

        setupAttributes(attrs, imageView, editText)
    }

    private fun setupAttributes(attrs: AttributeSet, img: ImageView, txt: EditText) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomComponentView)

        img.setImageDrawable(typedArray.getDrawable(R.styleable.CustomComponentView_source))
        txtcolor = typedArray.getColor(R.styleable.CustomComponentView_color, DEFAULT_TXT_COLOR)
        txt.setTextColor(txtcolor)

        typedArray.recycle()
    }

}
