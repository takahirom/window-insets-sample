package com.github.takahirom.empty

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.updatePadding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val root = findViewById<View>(R.id.root)
//        root.setOnApplyWindowInsetsListener { v, insets ->
//            root.updatePadding(
//                top = insets.systemWindowInsetTop,
//                bottom = insets.systemWindowInsetBottom
//            )
//            return@setOnApplyWindowInsetsListener insets
//        }
        root.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
    }
}
