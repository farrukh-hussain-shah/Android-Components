package com.example.radiobutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.LiveFolders.INTENT
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

  private lateinit var textViewResult: TextView


    private lateinit var Go_To: Button
    private lateinit var RecyclerView: Button
    private lateinit var GoToActivity3: Button
    private lateinit var GoToActivity4: Button
    private lateinit var GoToActivity5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        textViewResult=findViewById(R.id.textView_Data)

        val getResult=
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                if (it.resultCode==Constants.RESULT_CODE){
                    val message=it.data!!.getStringExtra(Constants.INTENT_MESSAGE2_KEY)
                    textViewResult.text=message
                }
            }






//        TODO Activity LifeCycle
//        Acitivy lifecycle wo lifecycle hai jis main jb ap start karty hain tu  "onStart" ki 1sec ki animation aai hai phir "onResume" ki phir  agr ap center click kr k menu py jaty hain tu  "onStop" aur after 1sec "onDestroy" and when you reopen the "onStart" and "onResume"

        Go_To=findViewById(R.id.GoTobutton)
        Go_To.setOnClickListener{
            val intent=Intent(this@MainActivity,Activity2::class.java)
            startActivity(intent)
        }
        GoToActivity3=findViewById(R.id.GoToActivity3)
        GoToActivity3.setOnClickListener{
            val intent=Intent(this@MainActivity,Activity3::class.java)
            startActivity(intent)
        }
        GoToActivity4=findViewById(R.id.GoToActivity4)
        GoToActivity4.setOnClickListener{
            val intent=Intent(this@MainActivity,Activity4::class.java)
//            TODO passing data from one activity to other
            intent.putExtra(Constants.INTENT_MESSAGE_KEY,"Hello From 1st Activity")
            intent.putExtra(Constants.INTENT_MESSAGE2_KEY,"How was your day")
            intent.putExtra(Constants.INTENT_DATA_NUMBER,34.5)
//            startActivity(intent)
            getResult.launch(intent)
        }


        GoToActivity5=findViewById(R.id.GoToActivity5)
        GoToActivity5.setOnClickListener{
            val intent=Intent(this@MainActivity,Activity5::class.java)
            startActivity(intent)
        }
        RecyclerView=findViewById(R.id.recyclerview)
        RecyclerView.setOnClickListener{
            val intent=Intent(this@MainActivity,ViewBInding::class.java)
            startActivity(intent)
        }

        }

    }
