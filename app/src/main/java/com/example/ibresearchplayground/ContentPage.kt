package com.example.ibresearchplayground

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_content__page.*
import kotlinx.android.synthetic.main.content__page.*

class ContentPage : AppCompatActivity() {
    //this page is designed for adding repositories, google drive links, and such other links
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content__page)
        setSupportActionBar(toolbar)

        //on button activation bring upp a upload window
        btn_Add_Content_Directory.setOnClickListener { view ->
            Snackbar.make(view, "sorry uploading is WIP", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
