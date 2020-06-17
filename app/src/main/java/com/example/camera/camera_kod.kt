package com.example.camera

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import kotlinx.android.synthetic.main.qwaer1.*

class register: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qwaer1)
        photobutton.setOnClickListener{
            val imageTakeIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityIfNeeded(imageTakeIntent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if(requestCode == 1 && resultCode == Activity.RESULT_OK){
            val extras = data?.extras
            val bitmap = extras?.get("data") as Bitmap?
            litso.setImageBitmap(bitmap)
        }
    }

    fun blyau(view: View)
    {
        var inten = Intent(this, MainActivity::class.java)
        startActivity(inten)
    }




}