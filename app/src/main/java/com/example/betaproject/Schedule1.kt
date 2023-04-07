package com.example.betaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

import android.view.View
import android.widget.EditText
import android.widget.Toast

import com.example.betaproject.databinding.ActivitySchedule1Binding

class Schedule1 : AppCompatActivity() {

    lateinit var bindingClasssch1 : ActivitySchedule1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClasssch1 = ActivitySchedule1Binding.inflate(layoutInflater)
        setContentView(bindingClasssch1.root)
        loadData()
        bindingClasssch1.savebt1.setOnClickListener{
            saveData()
            ///Понедельник
            bindingClasssch1.monpar1.text = bindingClasssch1.monpar1.text
            bindingClasssch1.montxtpar1.text = bindingClasssch1.monpar1.text
            bindingClasssch1.montxtpar2.text = bindingClasssch1.monpar2.text
            bindingClasssch1.montxtpar3.text = bindingClasssch1.monpar3.text
            bindingClasssch1.montxtpar4.text = bindingClasssch1.monpar4.text
            ///Вторник
            bindingClasssch1.tuetxtpar1.text = bindingClasssch1.tuepar1.text
            bindingClasssch1.tuetxtpar2.text = bindingClasssch1.tuepar2.text
            bindingClasssch1.tuetxtpar3.text = bindingClasssch1.tuepar3.text
            bindingClasssch1.tuetxtpar4.text = bindingClasssch1.tuepar4.text
            ///Среда
            bindingClasssch1.wedtxtpar1.text = bindingClasssch1.wedpar1.text
            bindingClasssch1.wedtxtpar2.text = bindingClasssch1.wedpar2.text
            bindingClasssch1.wedtxtpar3.text = bindingClasssch1.wedpar3.text
            bindingClasssch1.wedtxtpar4.text = bindingClasssch1.wedpar4.text

        }


    }

    private fun  saveData(){
        ///Понедельник
        val txtpar1 = bindingClasssch1.monpar1.text.toString()
        val txtpar2 = bindingClasssch1.monpar2.text.toString()
        val txtpar3 = bindingClasssch1.monpar3.text.toString()
        val txtpar4 = bindingClasssch1.monpar4.text.toString()
        val txtpared1 = bindingClasssch1.monpar1.text.toString()

        ///Вторник
        val txtpartue1 = bindingClasssch1.tuepar1.text.toString()
        val txtpartue2 = bindingClasssch1.tuepar2.text.toString()
        val txtpartue3 = bindingClasssch1.tuepar3.text.toString()
        val txtpartue4 = bindingClasssch1.tuepar4.text.toString()

        ///Среда
        val txtparwed1 = bindingClasssch1.wedpar1.text.toString()
        val txtparwed2 = bindingClasssch1.wedpar2.text.toString()
        val txtparwed3 = bindingClasssch1.wedpar3.text.toString()
        val txtparwed4 = bindingClasssch1.wedpar4.text.toString()

        ///Сохранение переменных
        bindingClasssch1.montxtpar1.text = txtpar1
        bindingClasssch1.montxtpar2.text = txtpar2
        bindingClasssch1.montxtpar3.text = txtpar3
        bindingClasssch1.montxtpar4.text = txtpar4

        bindingClasssch1.tuetxtpar1.text = txtpartue1
        bindingClasssch1.tuetxtpar2.text = txtpartue2
        bindingClasssch1.tuetxtpar3.text = txtpartue3
        bindingClasssch1.tuetxtpar4.text = txtpartue4

        bindingClasssch1.wedtxtpar1.text = txtparwed1
        bindingClasssch1.wedtxtpar2.text = txtparwed2
        bindingClasssch1.wedtxtpar3.text = txtparwed3
        bindingClasssch1.wedtxtpar4.text = txtparwed4


        val sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply{
            ///Понедельник
            putString("STRING_KEY", txtpar1)
            putString("STRING_KEY2", txtpar2)
            putString("STRING_KEY3", txtpar3)
            putString("STRING_KEY4", txtpar4)
            putString("STRING_KEYED_1", txtpared1)

            ///Вторник
            putString("STRING_KEY_TUE1", txtpartue1)
            putString("STRING_KEY_TUE2", txtpartue2)
            putString("STRING_KEY_TUE3", txtpartue3)
            putString("STRING_KEY_TUE4", txtpartue4)

            ///Среда
            putString("STRING_KEY_WED1", txtparwed1)
            putString("STRING_KEY_WED2", txtparwed2)
            putString("STRING_KEY_WED3", txtparwed3)
            putString("STRING_KEY_WED4", txtparwed4)
        }.apply()

        Toast.makeText(this,"Data saved",Toast.LENGTH_SHORT).show()
    }

    private fun loadData(){
        val sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE)
        ///Понедельник
        val savedString = sharedPreferences.getString("STRING_KEY",null)
        val savedString2 = sharedPreferences.getString("STRING_KEY2",null)
        val savedString3 = sharedPreferences.getString("STRING_KEY3",null)
        val savedString4 = sharedPreferences.getString("STRING_KEY4",null)
        ///Вторник
        val savedStringTue = sharedPreferences.getString("STRING_KEY_TUE1",null)
        val savedStringTue2 = sharedPreferences.getString("STRING_KEY_TUE2",null)
        val savedStringTue3 = sharedPreferences.getString("STRING_KEY_TUE3",null)
        val savedStringTue4 = sharedPreferences.getString("STRING_KEY_TUE4",null)

        ///Среда
        val savedStringWed = sharedPreferences.getString("STRING_KEY_WED1",null)
        val savedStringWed2 = sharedPreferences.getString("STRING_KEY_WED2",null)
        val savedStringWed3 = sharedPreferences.getString("STRING_KEY_WED3",null)
        val savedStringWed4 = sharedPreferences.getString("STRING_KEY_WED4",null)

        ///Понедельник
        bindingClasssch1.montxtpar1.text = savedString
        bindingClasssch1.montxtpar2.text = savedString2
        bindingClasssch1.montxtpar3.text = savedString3
        bindingClasssch1.montxtpar4.text = savedString4
        ///Вторник
        bindingClasssch1.tuetxtpar1.text = savedStringTue
        bindingClasssch1.tuetxtpar2.text = savedStringTue2
        bindingClasssch1.tuetxtpar3.text = savedStringTue3
        bindingClasssch1.tuetxtpar4.text = savedStringTue4
        ///Среда
        bindingClasssch1.wedtxtpar1.text = savedStringWed
        bindingClasssch1.wedtxtpar2.text = savedStringWed2
        bindingClasssch1.wedtxtpar3.text = savedStringWed3
        bindingClasssch1.wedtxtpar4.text = savedStringWed4

    }

    fun onClickgohome(view : View) {
        val home1 = Intent(this, MainActivity::class.java)
        startActivity(home1)
        finish()
    }

    fun onClickntsch2(view: View){
        val sch2 = Intent(this, activity_schedule2::class.java)
        startActivity(sch2)
        finish()
    }
}