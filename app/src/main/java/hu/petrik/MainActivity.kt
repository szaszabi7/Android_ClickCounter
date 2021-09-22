package hu.petrik

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var szam : TextView
    lateinit var buttonUp: Button
    lateinit var buttonDown: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        var ertek = 0
        buttonUp.setOnClickListener(){
            ertek++
            /*when (ertek) {
                in 0 .. Int.MIN_VALUE -> szam.setTextColor(Color.rgb(255,0,0))
                in 0 .. Int.MAX_VALUE -> szam.setTextColor(Color.rgb(0,255,0))
                else -> { szam.setTextColor(Color.rgb(0,0,255))

                }
            }*/
            if (ertek > 0) szam.setTextColor(Color.rgb(0,255,0))
            else if (ertek < 0) szam.setTextColor(Color.rgb(255,0,0))
            else szam.setTextColor(Color.rgb(0,0,255))
            szam.text = ertek.toString()
        }

        buttonDown.setOnClickListener(){
            ertek--
            /*when (ertek) {
                in 0 .. Int.MIN_VALUE -> szam.setTextColor(Color.rgb(255,0,0))
                in 0 .. Int.MAX_VALUE -> szam.setTextColor(Color.rgb(0,255,0))
                else -> { szam.setTextColor(Color.rgb(0,0,255))

                }
            }*/
            if (ertek > 0) szam.setTextColor(Color.rgb(0,255,0))
            else if (ertek < 0) szam.setTextColor(Color.rgb(255,0,0))
            else szam.setTextColor(Color.rgb(0,0,255))
            szam.text = ertek.toString()
        }

        szam.setOnClickListener() {
            ertek = 0
            szam.setTextColor(Color.rgb(0,0,255))
            szam.text = ertek.toString()
        }
    }

    fun init() {
        szam = findViewById(R.id.text_view)
        buttonUp = findViewById(R.id.button_Up)
        buttonDown = findViewById(R.id.button_Down)
    }
}
