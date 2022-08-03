package com.example.mvvm_jetpack.api

import com.example.mvvm_jetpack.helper.Constants
import com.example.mvvm_jetpack.models.Character
import retrofit2.http.GET

interface ApiService {
    @GET(Constants.END_POINTS)
    suspend fun getCharacter():List<Character>
}