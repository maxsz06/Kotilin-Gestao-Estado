package com.example.gestodeestado.juros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JurosScreenViewModel: ViewModel(){
    private val _capital = MutableLiveData<String>()
    val capital : LiveData<String> = _capital

    fun onCapitalChanged(novoCapital: String){
        _capital.value =novoCapital
    }
}