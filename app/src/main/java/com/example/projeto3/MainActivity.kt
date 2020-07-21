package com.example.projeto3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_print.setOnClickListener {
            print()
        }
    }
    private fun print() {
        val insertion = findViewById<EditText>(R.id.insertion_field)

        val result = findViewById<TextView>(R.id.result_field)

        result.text = insertion.text
    }
}