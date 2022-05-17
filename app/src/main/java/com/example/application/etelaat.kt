package com.example.application

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

 class etelaat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_etelaat)

        val btn_edit = findViewById<Button>(R.id.btn_edit)



        var jensiat=findViewById<TextView>(R.id.etelaat_txt_jensiat)
        var alaghe=findViewById<TextView>(R.id.etelaat_txt_alaghe)
        var hesab=findViewById<TextView>(R.id.etelaat_txt_hesab)

        btn_edit.setOnClickListener {
            val builder = AlertDialog.Builder(this).create()
            val view=layoutInflater.inflate(R.layout.dialog,null)
            val btn_confirm=view.findViewById<Button>(R.id.btn_sabt)
            btn_confirm.setOnClickListener {
                var intent: Intent = Intent(this,etelaat::class.java)
                val edt_name=findViewById<EditText>(R.id.edt_name)
                val edt_family=findViewById<EditText>(R.id.edt_family)
                val edt_pedar=findViewById<EditText>(R.id.edt_pedar)
                val edt_number=findViewById<EditText>(R.id.edt_number)
                val checkBox4=findViewById<CheckBox>(R.id.checkBox4)
                intent.putExtra("edt_name",edt_name.text.toString())
                intent.putExtra("edt_family",edt_family.text.toString())
                intent.putExtra("edt_pedar",edt_pedar.text.toString())
                intent.putExtra("edt_number",edt_number.text.toString())
                finish()
                startActivity(intent)

               builder.dismiss()
            }
            builder.setView(view)
            builder.setCancelable(false)
            builder.show()
        }

        var name = findViewById<TextView>(R.id.etelaat_txt_name)
       if (intent.extras!=null){

           var view_name:String=intent.extras!!.getString("edt_name","")
           name.text=""+view_name

       }
        var family = findViewById<TextView>(R.id.etelaat_txt_family)
        if (intent.extras!=null){

            var view_family:String=intent.extras!!.getString("edt_family","")
           family.text=""+view_family

        }
        var mobile = findViewById<TextView>(R.id.etelaat_txt_mobile)
        if (intent.extras!=null){

            var view_mobile:String=intent.extras!!.getString("edt_number","")
            mobile.text=""+view_mobile

        }
        var pedar = findViewById<TextView>(R.id.etelaat_txt_family)
        if (intent.extras!=null){

            var view_pedar:String=intent.extras!!.getString("edt_pedar","")
            pedar.text=""+view_pedar

        }
    }

}