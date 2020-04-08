package com.example.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mCity = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName
    val city: LiveData<String>
        get() = mCity

    fun setName(name: String) {
        mName.value = name
    }
    fun setCity(city: String){
        mCity.value = city
    }
}