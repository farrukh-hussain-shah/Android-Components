package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        //        TODO("RADIOGROUP")
        radioGroup=findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            radioButton=findViewById(i)
            when(radioButton.id){
                R.id.radioButtonYes  -> Toast.makeText(this@Activity2,"You Clicked Yes Button",
                    Toast.LENGTH_SHORT).show()

                R.id.radioButtonNo  -> Toast.makeText(this@Activity2,"You Clicked No Button",
                    Toast.LENGTH_SHORT).show()

                R.id.radioButtonMaybe  -> Toast.makeText(this@Activity2,"You Clicked Maybe Button",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}