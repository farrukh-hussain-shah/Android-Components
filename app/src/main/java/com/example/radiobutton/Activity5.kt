package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class Activity5 : AppCompatActivity() {
    private lateinit var checkBoxJava: CheckBox
    private lateinit var checkBoxKotlin: CheckBox
    private lateinit var checkBoxC: CheckBox
    private lateinit var textViewChoice: TextView
    private lateinit var showButtonCheckBox: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)
        //        TODO CheckBox
        checkBoxC=findViewById(R.id.checkBoxC)
        checkBoxJava=findViewById(R.id.checkBoxJava)
        checkBoxKotlin=findViewById(R.id.checkBoxKotlin)
        textViewChoice=findViewById(R.id.textViewChoice)
        showButtonCheckBox=findViewById(R.id.showButtonCheckBox)

        showButtonCheckBox.setOnClickListener{
            val sb=StringBuilder()
            sb.append(checkBoxKotlin.text.toString()+"Status is "+ checkBoxKotlin.isChecked +"\n")
            sb.append(checkBoxC.text.toString()+"Status is "+ checkBoxC.isChecked +"\n")
            sb.append(checkBoxJava.text.toString()+"Status is "+ checkBoxJava.isChecked +"\n")
            textViewChoice.text=sb.toString()
        }
    }
}