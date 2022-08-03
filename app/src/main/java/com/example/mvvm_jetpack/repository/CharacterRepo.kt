package com.example.mvvm_jetpack.repository

import com.example.mvvm_jetpack.api.ApiService
import com.example.mvvm_jetpack.models.Character
import javax.inject.Inject

class CharacterRepo @Inject constructor(private  val characterApi: ApiService){

    suspend fun getCharacter():List<Character>{
        return characterApi.getCharacter()
    }
}