package com.eoghandev.kotlinmvvm.data.repository

import com.eoghandev.kotlinmvvm.data.api.ApiHelper
import com.eoghandev.kotlinmvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}