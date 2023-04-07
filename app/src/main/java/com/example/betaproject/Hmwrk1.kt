package com.example.betaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.StringRes
import com.example.betaproject.databinding.ActivityHmwrk1Binding
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


class Hmwrk1 : AppCompatActivity() {


    lateinit var bindingClasshmwr1 : ActivityHmwrk1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClasshmwr1 = ActivityHmwrk1Binding.inflate(layoutInflater)
        setContentView(bindingClasshmwr1.root)

        bindingClasshmwr1.apply{
            bindOpenButtonListener()
            bindSaveButtonListener()
        }


}
    private fun ActivityHmwrk1Binding.bindOpenButtonListener(){
        btloadtext.setOnClickListener{
            try {
                openFile()
            }catch (e: Exception){

            }
        }
    }

    private fun ActivityHmwrk1Binding.bindSaveButtonListener(){
        savebt3.setOnClickListener{
            try {
                saveFile()
            }catch (e: Exception){
            }
        }
    }

     private fun openFile(){
        val file = File(filesDir, FILE_HMWORK)
        val data:String = FileInputStream(file).use {
            String(it.readBytes())
        }
        bindingClasshmwr1.edittexthmwrk.setText(data)
    }

    private fun ActivityHmwrk1Binding.saveFile(){
        val file = File(filesDir, FILE_HMWORK)
        FileOutputStream(file).use {
            val bytes:ByteArray = edittexthmwrk.text.toString().toByteArray()
            it.write(bytes)
        }
    }
    fun onClickgohomewk1(view : View){
        val hmwrk1h = Intent(this, MainActivity::class.java)
        startActivity(hmwrk1h)
        finish()
    }

    private fun showError(@StringRes res: Int){
        Toast.makeText(this,"No no", Toast.LENGTH_SHORT).show()
    }
    private companion object{
        const val FILE_HMWORK = "homewrk.txt"
    }
}