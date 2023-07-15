package com.example.simplemvi.api

class AnimalRepo(private val api: AnimalAPI) {
    suspend fun getAnimals() = api.getAnimals()
}