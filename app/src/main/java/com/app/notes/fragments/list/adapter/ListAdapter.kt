package com.app.notes.fragments.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.app.notes.data.models.NotesData
import com.app.notes.databinding.RowLayoutBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    var dataList = emptyList<NotesData>()

    class MyViewHolder(private val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(notesData: NotesData) {
            binding.notesData = notesData
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RowLayoutBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val updateItem = dataList[position]
        holder.bind(updateItem)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setData(notesData: List<NotesData>) {
        val notesDiffUtil = NotesDiffUtil(dataList, notesData)
        val notesDiffResult = DiffUtil.calculateDiff(notesDiffUtil)
        this.dataList = notesData
        notesDiffResult.dispatchUpdatesTo(this)
    }

}