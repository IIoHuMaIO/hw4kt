package com.example.hw4.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


open class MainViewModel : ViewModel() {
    private var mHistory = ""
    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val historyList = MutableLiveData<String>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter

        mHistory = "+"
        historyList.postValue(mHistory)
    }

    fun onDecrementClick() {
        mCounter--
        counter.value = mCounter

        mHistory = "-"
        historyList.postValue(mHistory)
    }
}