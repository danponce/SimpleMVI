package com.example.simplemvi.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.simplemvi.api.AnimalAPI
import com.example.simplemvi.api.AnimalRepo
import java.lang.IllegalArgumentException

class ViewModelFactory(private val api: AnimalAPI): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(AnimalRepo(api)) as T
        }
        throw IllegalArgumentException("Unknown class")
    }
}