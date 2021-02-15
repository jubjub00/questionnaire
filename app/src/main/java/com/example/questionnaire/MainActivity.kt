package com.example.questionnaire


import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

var mpwelcome:MediaPlayer? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

        button.setOnClickListener{
            val intent = Intent(this, q2::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, q9::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = Intent(this, q8::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mpwelcome!!.stop()
    }

    override fun onStop() {
        super.onStop()
        mpwelcome!!.stop()
    }

    override fun onPause() {
        super.onPause()
        mpwelcome!!.stop()
    }
    override fun onResume() {
        super.onResume()
        mpwelcome = MediaPlayer.create(this, R.raw.a)
        mpwelcome!!.isLooping = true
        mpwelcome!!.start()
    }


}