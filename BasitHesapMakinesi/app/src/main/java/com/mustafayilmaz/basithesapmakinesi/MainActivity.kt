package com.mustafayilmaz.basithesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number1:EditText=findViewById(R.id.number1)
        val number2:EditText=findViewById(R.id.number2)
        val sonuc:TextView=findViewById(R.id.sonuc)

        val btnTopla:Button=findViewById(R.id.btnTopla)
        btnTopla.setOnClickListener {
            val sayi1:Int=Integer.parseInt(number1.text.toString())
            val sayi2:Int=Integer.parseInt(number2.text.toString())
            val iSonuc= sayi1 + sayi2
            sonuc.text= iSonuc.toString()
        }
        val btnCikar:Button=findViewById(R.id.btnCikar)
        btnCikar.setOnClickListener {
            val sayi1:Int=Integer.parseInt(number1.text.toString())
            val sayi2:Int=Integer.parseInt(number2.text.toString())
            val iSonuc= sayi1 - sayi2
            sonuc.text= iSonuc.toString()
        }
        val btnCarp:Button=findViewById(R.id.btnCarp)
        btnCarp.setOnClickListener {
            val sayi1:Int=Integer.parseInt(number1.text.toString())
            val sayi2:Int=Integer.parseInt(number2.text.toString())
            val iSonuc= sayi1 * sayi2
            sonuc.text= iSonuc.toString()
        }
        val btnBol:Button=findViewById(R.id.btnBol)
        btnBol.setOnClickListener {
            val sayi1:Int=Integer.parseInt(number1.text.toString())
            val sayi2:Int=Integer.parseInt(number2.text.toString())
            val iSonuc= sayi1 / sayi2
            sonuc.text= iSonuc.toString()
        }
    }
}