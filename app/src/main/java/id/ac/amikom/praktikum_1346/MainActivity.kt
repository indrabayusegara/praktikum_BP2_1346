package id.ac.amikom.praktikum_1346

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText

        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button


        btn_reset.setOnClickListener() {
            et_user_name.setText("")
            et_password.setText("")
        }

        btn_submit.setOnClickListener(){
            val user_name = et_user_name.text
            val password = et_password.text

            //Login Validasi
            Toast.makeText( this@MainActivity, user_name, Toast.LENGTH_SHORT).show()
        }
    }
}