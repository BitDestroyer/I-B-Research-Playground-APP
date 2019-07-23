package com.example.ibresearchplayground

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.example.ibresearchplayground.ui.login.LoginActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //this button when activated starts the login activity
        btn_login_activity.setOnClickListener {
            val intent = Intent(this, LoginActivity :: class.java)
            startActivity(intent)
        }

        //this button on activation begins the activity for the main content page
        btn_content_activity.setOnClickListener {
            val intent = Intent(this, ContentPage :: class.java)
            startActivity(intent)
        }


        //notifications button
        fab.setOnClickListener { view ->
            Snackbar.make(view, "No notification yet", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
