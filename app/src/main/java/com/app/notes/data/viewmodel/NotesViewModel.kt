package com.app.notes.data.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.app.notes.data.NotesDatabase
import com.app.notes.data.models.NotesData
import com.app.notes.data.repository.NotesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NotesViewModel(application: Application) : AndroidViewModel(application) {

    private val notesDao = NotesDatabase.getDatabase(application).notesDao()
    private val repository = NotesRepository(notesDao)

    val getAllData: LiveData<List<NotesData>> = repository.getAllData
    val sortByHighPriority: LiveData<List<NotesData>> = repository.sortByHighPriority
    val sortByLowPriority: LiveData<List<NotesData>> = repository.sortByLowPriority

    fun insertData(notesData: NotesData) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertData(notesData)
        }
    }

    fun updateData(notesData: NotesData) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateData(notesData)
        }
    }

    fun deleteData(notesData: NotesData) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteData(notesData)
        }
    }

    fun deleteAllData() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllData()
        }
    }

    fun searchDatabase(searchQuery: String): LiveData<List<NotesData>> {
        return repository.searchDatabase(searchQuery)
    }

}