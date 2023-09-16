package org.demo.androidproject02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    //private lateinit var logo:ImageView
    private lateinit var next:Button
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var phone:EditText
    private lateinit var gender:EditText
    private lateinit var pass: EditText
    private lateinit var conpass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //logo = findViewById(R.id.imageView)
        next = findViewById(R.id.register)
        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        phone = findViewById(R.id.phone)
        gender = findViewById(R.id.gender)
        pass = findViewById(R.id.pass)
        conpass = findViewById(R.id.conpass)


        next.setOnClickListener {
            //var imageView:String = logo.get
            var userName:String = name.getText().toString()
            var userEmail:String = email.getText().toString()
            var userPhone:String = phone.getText().toString()
            var userGender:String = gender.getText().toString()
            var userPass:String = pass.getText().toString()
            var conPass:String = conpass.getText().toString()

            var intent = Intent(this@MainActivity, welcome::class.java)

            //intent.putExtra("logo", imageView)
            intent.putExtra("name", userName)
            intent.putExtra("email", userEmail)
            intent.putExtra("phone", userPhone)
            intent.putExtra("gender", userGender)
            intent.putExtra("pass", userPass)
            intent.putExtra("conpass", conPass)

            startActivity(intent)
            finish()
        }

    }
}