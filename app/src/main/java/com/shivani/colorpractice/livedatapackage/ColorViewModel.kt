package com.shivani.colorpractice.livedatapackage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ColorViewModel : ViewModel() {
    //mutableLiveData - read and write
    //liveData - read

    var color : MutableLiveData<Int> = MutableLiveData(0)
    var value: MutableLiveData<Int> = MutableLiveData(100)
}