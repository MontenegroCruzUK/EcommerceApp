package com.montenegro.ecommerceapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.montenegro.ecommerceapp.model.SliderModel
import com.montenegro.ecommerceapp.repository.MainRepository

class MainViewModel() : ViewModel() {
  private val repository = MainRepository()
  fun loadBanner(): LiveData<MutableList<SliderModel>> {
    return repository.loadBanner()
  }
}