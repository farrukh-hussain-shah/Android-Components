package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class Activity3 : AppCompatActivity() {
    private lateinit var seekbar: SeekBar
    private lateinit var textViewProgress: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        //        TODO("SEEKBAR")
        seekbar=findViewById(R.id.seekBar)
        textViewProgress=findViewById(R.id.textViewProgress)

        seekbar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0:SeekBar?,p1:Int,p2:Boolean){
                Toast.makeText(this@Activity3,"You Clicked Yes onProgressChanged", Toast.LENGTH_SHORT).show()
                textViewProgress.text=seekbar.progress.toString()
            }
            override fun onStartTrackingTouch(p0:SeekBar?) {
                Toast.makeText(this@Activity3,"You Clicked Yes onStartTrackingTouch", Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(p0:SeekBar?) {
                Toast.makeText(this@Activity3,"You Clicked Yes onStopTrackingTouch", Toast.LENGTH_SHORT).show()
                textViewProgress.text="Final Rate = "+seekbar.progress.toString()
            }
        })
    }
}