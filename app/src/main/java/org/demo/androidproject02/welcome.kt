package org.demo.androidproject02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class welcome : AppCompatActivity() {
    private lateinit var name: TextView
    private lateinit var email: TextView
    private lateinit var phone: TextView
    private lateinit var gender: TextView
    private lateinit var pass:TextView
    private lateinit var conpass:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)




        name = findViewById(R.id.name)
        var user = intent.getStringExtra("name")
        name.setText("Name: "+user)

        email = findViewById(R.id.email)
        var userEmail = intent.getStringExtra("email")
        email.setText("Email- "+userEmail)

        phone = findViewById(R.id.phone)
        var userPhone = intent.getStringExtra("phone")
        phone.setText("Phone: "+userPhone)

        gender = findViewById(R.id.gender)
        var userGender = intent.getStringExtra("gender")
        gender.setText("Gender: "+userGender)

        pass = findViewById(R.id.pass)
        var userPass = intent.getStringExtra("pass")
        pass.setText("Password: "+userPass)

        conpass = findViewById(R.id.conpass)
        var conPass = intent.getStringExtra("conpass")
        conpass.setText("Confirm password: "+conPass)




    }
}
