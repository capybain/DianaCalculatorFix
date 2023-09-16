package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var text_expression: TextView
    lateinit var text_result: TextView
    lateinit var btn_0: TextView
    lateinit var btn_1: TextView
    lateinit var btn_2: TextView
    lateinit var btn_3: TextView
    lateinit var btn_4: TextView
    lateinit var btn_5: TextView
    lateinit var btn_6: TextView
    lateinit var btn_7: TextView
    lateinit var btn_8: TextView
    lateinit var btn_9: TextView
    lateinit var btn_ac: TextView
    lateinit var btn_open_par: TextView
    lateinit var btn_close_par: TextView
    lateinit var btn_division: TextView
    lateinit var btn_multiplication: TextView
    lateinit var btn_subtraction: TextView
    lateinit var btn_addition: TextView
    lateinit var btn_back: TextView
    lateinit var btn_coma: TextView
    lateinit var btn_equal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_expression = findViewById(R.id.text_expression)
        text_result = findViewById(R.id.text_result)
        btn_open_par = findViewById(R.id.btn_open_par)
        btn_close_par = findViewById(R.id.btn_close_par)
        btn_ac = findViewById(R.id.btn_ac)
        btn_division = findViewById(R.id.btn_division)
        btn_multiplication = findViewById(R.id.btn_multiplication)
        btn_subtraction = findViewById(R.id.btn_subtraction)
        btn_addition = findViewById(R.id.btn_addition)
        btn_back = findViewById(R.id.btn_back)
        btn_coma = findViewById(R.id.btn_coma)
        btn_equal = findViewById(R.id.btn_equal)
        btn_0 = findViewById(R.id.btn_0)
        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)
        btn_3 = findViewById(R.id.btn_3)
        btn_4 = findViewById(R.id.btn_4)
        btn_5 = findViewById(R.id.btn_5)
        btn_6 = findViewById(R.id.btn_6)
        btn_7 = findViewById(R.id.btn_7)
        btn_8 = findViewById(R.id.btn_8)
        btn_9 = findViewById(R.id.btn_9)


        btn_0.setOnClickListener {
            text_expression.append("0")
        }
        btn_1.setOnClickListener {
            text_expression.append("1")
        }
        btn_2.setOnClickListener {
            text_expression.append("2")
        }
        btn_3.setOnClickListener {
            text_expression.append("3")
        }
        btn_4.setOnClickListener {
            text_expression.append("4")
        }
        btn_5.setOnClickListener {
            text_expression.append("5")
        }
        btn_6.setOnClickListener {
            text_expression.append("6")
        }
        btn_7.setOnClickListener {
            text_expression.append("7")
        }
        btn_8.setOnClickListener {
            text_expression.append("8")
        }
        btn_9.setOnClickListener {
            text_expression.append("9")
        }

        btn_back.setOnClickListener {
            if (text_expression.text.isNotEmpty()) {
                var str: String = text_expression.text.toString()
                text_expression.text = str.substring(0, str.length - 1)
            } else {
                text_expression.text = ""
            }
        }
        btn_ac.setOnClickListener {
            text_expression.text = ""
        }
    }
}