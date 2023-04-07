package com.example.betaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShedule1(view : View) {
        val schedulego1 = Intent(this, Schedule1::class.java)
        startActivity(schedulego1)
        finish()
    }

    fun onClickHome1(view: View){
        val homego1work = Intent(this, Hmwrk1::class.java)
        startActivity(homego1work)
        finish()
    }
}