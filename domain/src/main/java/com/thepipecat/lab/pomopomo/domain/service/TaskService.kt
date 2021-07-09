package com.thepipecat.lab.pomopomo.domain.service

import androidx.annotation.Keep
import com.thepipecat.lab.pomopomo.domain.model.Task
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

@Keep
interface TaskService {

    @GET("tasks")
    fun getTasks(): Call<List<Task>>

    @GET("task/{uid}")
    fun getTask(@Path("uid") uid: String): Call<Task>

}