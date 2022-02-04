package com.eoghandev.kotlinmvvm.data.api

import com.eoghandev.kotlinmvvm.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}