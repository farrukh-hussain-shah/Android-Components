package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.radiobutton.databinding.ActivityViewBindingBinding

class ViewBInding : AppCompatActivity() {

    var binding:ActivityViewBindingBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityViewBindingBinding.inflate(layoutInflater)

        setContentView(binding?.root)

        val adapter=MainAdapter(TaskList.taskList)
        binding?.taskRV?.adapter=adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}