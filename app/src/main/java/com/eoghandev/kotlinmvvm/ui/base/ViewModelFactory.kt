package com.eoghandev.kotlinmvvm.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eoghandev.kotlinmvvm.data.api.ApiHelper
import com.eoghandev.kotlinmvvm.data.repository.MainRepository
import com.eoghandev.kotlinmvvm.ui.main.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw  IllegalArgumentException("Unknown Class Name")
    }
}