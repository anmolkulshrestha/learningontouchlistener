package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView) as TextView
        findViewById<Button>(R.id.button).setOnTouchListener(
            object:View.OnTouchListener {
                override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                    when(p1?.action){
                        MotionEvent.ACTION_DOWN->text.setText("anmol")
                        MotionEvent.ACTION_UP -> {
                            text.setText("golu")
                        }
                    }
                    return  true
                }


            }
        )
    }
}