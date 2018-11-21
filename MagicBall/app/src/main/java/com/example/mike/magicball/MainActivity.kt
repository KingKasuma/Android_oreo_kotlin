package com.example.mike.magicball

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 - Click listener
        //2 - Generar un color aleatorio
        //3 - Generar una frase aleatoria

        pressMeButton.setOnClickListener {

            val colors = resources.getIntArray(R.array.phrasesColors)

            val phrases = resources.getStringArray(R.array.phrases)

            val randomColor = colors[getRandomNum(colors.size)]

            phraseTextView.text = phrases[getRandomNum(phrases.size)]
            phraseTextView.setTextColor(randomColor)

            pressMeButton.setBackgroundColor(randomColor)
        }

    }

    private fun getRandomNum(max:Int) = (Math.random() * max).toInt()


}
