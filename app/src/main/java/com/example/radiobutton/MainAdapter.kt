package com.example.radiobutton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.radiobutton.TaskList.taskList
import com.example.radiobutton.databinding.RecyclerviewItemBinding

class MainAdapter(val taskList: List<Task>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bindItem(task: Task) {
            itemBinding.title.text = task.title
            itemBinding.time.text = task.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        return   MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        val task=taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        // Return the number of items in your taskList or data source
        return taskList.size
    }
}
/*this code defines a custom adapter (MainAdapter) for a RecyclerView. It inflates the item layout, binds data to the views in each item, and determines the number of items to be displayed based on the size of the taskList */