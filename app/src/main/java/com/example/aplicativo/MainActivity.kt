package com.example.aplicativo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val res = arrayOf("Sim", "Não", "Talvez")
    val random = Random.Default
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            if(editText.text.isEmpty()){
                textView4.text = "Faça uma pergunta!"
            }else {
                val index = random.nextInt(3)
                textView4.text = res[index]
            }
        }
    }
}