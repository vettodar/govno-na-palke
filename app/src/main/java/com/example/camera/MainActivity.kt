package com.example.camera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.camera.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var score: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonclick(view: View){

        check()
        Toast.makeText(applicationContext, "Количество правильных ответов:" + score, Toast.LENGTH_SHORT). show()
        score = 0
    }
    fun check(){

        if (One.text.toString() == "YES"){
            score++
        }
        if ((TwoOne.isChecked) && (!TwoTwo.isChecked) && (TwoThree.isChecked)){
            score++
        }
        if (radioButton.isChecked){
            score++
        }
    }
}
