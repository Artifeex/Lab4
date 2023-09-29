package com.example.lab4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThirdActivityViewModel: ViewModel() {

    private val _countClicks: MutableLiveData<Int> = MutableLiveData(0)
    val countClicks: LiveData<Int>
        get() = _countClicks

    fun click() {
        _countClicks.value = countClicks.value!! + 1
    }

}