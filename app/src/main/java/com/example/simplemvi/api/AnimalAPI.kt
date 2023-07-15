package com.example.simplemvi.api

import com.example.simplemvi.model.Animal
import retrofit2.http.GET

interface AnimalAPI {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}