package com.example.calljimin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jimin.setOnClickListener {
            Toast.makeText(this, "아기지민입니다.", Toast.LENGTH_SHORT).show()

            val jimin = Intent(this, JiminPicture::class.java)
            startActivity(jimin)
        }

        callJimin.setOnClickListener {
            val intentVal = Intent(Intent.ACTION_DIAL)
            intentVal.data = Uri.parse("tel:01022705301")
            startActivity(intentVal)
        }
    }
}