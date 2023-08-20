package com.example.multiplicationtable


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.multiplicationtable.R.*

class Multiplication_Table : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val btn=findViewById<Button>(R.id.btnResult)
        val num=findViewById<EditText>(R.id.number)
        val view=findViewById<TextView>(R.id.ending)

        btn.setOnClickListener {
            var i=1
            view.setText("")
            while(i<11){
                var x=num.text.toString().toInt()
                view.append("$x * $i = ${x*i}\n")
                i++
            }
        }
    }
}