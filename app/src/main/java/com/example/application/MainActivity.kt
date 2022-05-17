package com.example.application

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_confirm=findViewById<Button>(R.id.btnlogin)
        val checkbox=findViewById<CheckBox>(R.id.checkBox)

        btn_confirm.setOnClickListener {
            if (checkbox.isChecked){

                var intent:Intent=Intent(this,etelaat::class.java)
                finish()
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "لطفا قوانین را با دقت مطالعه کنید", Toast.LENGTH_SHORT).show()
            }
        }


    }

}