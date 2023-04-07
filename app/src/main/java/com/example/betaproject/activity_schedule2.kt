package com.example.betaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.betaproject.databinding.ActivitySchedule1Binding
import com.example.betaproject.databinding.ActivitySchedule2Binding

class activity_schedule2 : AppCompatActivity() {
    lateinit var bindingClasssch2 : ActivitySchedule2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClasssch2 = ActivitySchedule2Binding.inflate(layoutInflater)
        setContentView(bindingClasssch2.root)
        loadData()
        bindingClasssch2.savebt2.setOnClickListener{
            saveData()
            ///Четверг
            bindingClasssch2.thutxtpar1.text = bindingClasssch2.thupar1.text
            bindingClasssch2.thutxtpar2.text = bindingClasssch2.thupar2.text
            bindingClasssch2.thutxtpar3.text = bindingClasssch2.thupar3.text
            bindingClasssch2.thutxtpar4.text = bindingClasssch2.thupar4.text
            ///Пятница
            bindingClasssch2.fritxtpar1.text = bindingClasssch2.fripar1.text
            bindingClasssch2.fritxtpar2.text = bindingClasssch2.fripar2.text
            bindingClasssch2.fritxtpar3.text = bindingClasssch2.fripar3.text
            bindingClasssch2.fritxtpar4.text = bindingClasssch2.fripar4.text
            ///Суббота
            bindingClasssch2.sattxtpar1.text = bindingClasssch2.satpar1.text
            bindingClasssch2.sattxtpar2.text = bindingClasssch2.satpar2.text
            bindingClasssch2.sattxtpar3.text = bindingClasssch2.satpar3.text
            bindingClasssch2.sattxtpar4.text = bindingClasssch2.satpar4.text
        }
    }

    private fun saveData(){
        ///Четверг
        val txtthupar1 = bindingClasssch2.thupar1.text.toString()
        val txtthupar2 = bindingClasssch2.thupar2.text.toString()
        val txtthupar3 = bindingClasssch2.thupar2.text.toString()
        val txtthupar4 = bindingClasssch2.thupar2.text.toString()

        ///Пятница
        val txtfripar1 = bindingClasssch2.fripar1.text.toString()
        val txtfripar2 = bindingClasssch2.fripar2.text.toString()
        val txtfripar3 = bindingClasssch2.fripar3.text.toString()
        val txtfripar4 = bindingClasssch2.fripar4.text.toString()

        ///Суббота
        val txtsatpar1 = bindingClasssch2.satpar1.text.toString()
        val txtsatpar2 = bindingClasssch2.satpar2.text.toString()
        val txtsatpar3 = bindingClasssch2.satpar3.text.toString()
        val txtsatpar4 = bindingClasssch2.satpar4.text.toString()

        ///Сохранения переменных
        bindingClasssch2.thutxtpar1.text = txtthupar1
        bindingClasssch2.thutxtpar2.text = txtthupar2
        bindingClasssch2.thutxtpar3.text = txtthupar3
        bindingClasssch2.thutxtpar4.text = txtthupar4

        bindingClasssch2.fritxtpar1.text = txtfripar1
        bindingClasssch2.fritxtpar2.text = txtfripar2
        bindingClasssch2.fritxtpar3.text = txtfripar3
        bindingClasssch2.fritxtpar4.text = txtfripar4

        bindingClasssch2.sattxtpar1.text = txtsatpar1
        bindingClasssch2.sattxtpar2.text = txtsatpar2
        bindingClasssch2.sattxtpar3.text = txtsatpar3
        bindingClasssch2.sattxtpar4.text = txtsatpar4


        val sharedPreferences2 = getSharedPreferences("sharedPrefs2", MODE_PRIVATE)
        val editor2 = sharedPreferences2.edit()
        editor2.apply {
            ///Четверг
            putString("STRING_KEY_THU",txtthupar1)
            putString("STRING_KEY_THU2",txtthupar2)
            putString("STRING_KEY_THU3",txtthupar3)
            putString("STRING_KEY_THU4",txtthupar4)

            ///Пятница
            putString("STRING_KEY_FRI",txtfripar1)
            putString("STRING_KEY_FRI2",txtfripar2)
            putString("STRING_KEY_FRI3",txtfripar3)
            putString("STRING_KEY_FRI4",txtfripar4)

            ///Суббота
            putString("STRING_KEY_SAT",txtsatpar1)
            putString("STRING_KEY_SAT2",txtsatpar2)
            putString("STRING_KEY_SAT3",txtsatpar3)
            putString("STRING_KEY_SAT4",txtsatpar4)
        }.apply()

        Toast.makeText(this,"Data saved", Toast.LENGTH_SHORT).show()
    }

    private fun loadData(){
        val sharedPreferences2 = getSharedPreferences("sharedPrefs2", MODE_PRIVATE)
        ///Четверг
        val savedStringThu = sharedPreferences2.getString("STRING_KEY_THU", null)
        val savedStringThu2 = sharedPreferences2.getString("STRING_KEY_THU2", null)
        val savedStringThu3 = sharedPreferences2.getString("STRING_KEY_THU3", null)
        val savedStringThu4 = sharedPreferences2.getString("STRING_KEY_THU4", null)
        ///Пятница
        val savedStringFri = sharedPreferences2.getString("STRING_KEY_FRI", null)
        val savedStringFri2 = sharedPreferences2.getString("STRING_KEY_FRI2", null)
        val savedStringFri3 = sharedPreferences2.getString("STRING_KEY_FRI3", null)
        val savedStringFri4 = sharedPreferences2.getString("STRING_KEY_FRI4", null)
        ///Суббота
        val savedStringSat = sharedPreferences2.getString("STRING_KEY_SAT", null)
        val savedStringSat2 = sharedPreferences2.getString("STRING_KEY_SAT2", null)
        val savedStringSat3 = sharedPreferences2.getString("STRING_KEY_SAT3", null)
        val savedStringSat4 = sharedPreferences2.getString("STRING_KEY_SAT4", null)

        ///Четверг
        bindingClasssch2.thutxtpar1.text = savedStringThu
        bindingClasssch2.thutxtpar2.text = savedStringThu2
        bindingClasssch2.thutxtpar3.text = savedStringThu3
        bindingClasssch2.thutxtpar4.text = savedStringThu4
        ///Пятница
        bindingClasssch2.fritxtpar1.text = savedStringFri
        bindingClasssch2.fritxtpar2.text = savedStringFri2
        bindingClasssch2.fritxtpar3.text = savedStringFri3
        bindingClasssch2.fritxtpar4.text = savedStringFri4
        ///Суббота
        bindingClasssch2.sattxtpar1.text = savedStringSat
        bindingClasssch2.sattxtpar2.text = savedStringSat2
        bindingClasssch2.sattxtpar3.text = savedStringSat3
        bindingClasssch2.sattxtpar4.text = savedStringSat4
    }

    fun Onclickgobcsch1(view: View){
        val sch1page = Intent(this, Schedule1::class.java)
        startActivity(sch1page)
        finish()
    }
    fun onClickgohome2(view : View){
        val home2 = Intent(this, MainActivity::class.java)
        startActivity(home2)
        finish()
    }

}