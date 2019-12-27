package com.londonappbrewery.magiceightball

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val buttonAsking = findViewById<Button>(R.id.buttonAsk)
        Ask(buttonAsking)
    }
    
    fun Ask(button: Button){
        val ballImages = arrayOf(R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5)

        
        button.setOnClickListener{
            var randomNum = (0..4).random()
            val image = findViewById<ImageView>(R.id.ballImage)
            image.setImageResource(ballImages[randomNum])
        }
    }
}