package com.montenegro.ecommerceapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.montenegro.ecommerceapp.model.CategoryModel
import com.montenegro.ecommerceapp.model.ItemsModel
import com.montenegro.ecommerceapp.model.SliderModel
import com.montenegro.ecommerceapp.repository.MainRepository

class MainViewModel() : ViewModel() {
  private val repository = MainRepository()
  
  //Banner
  fun loadBanner(): LiveData<MutableList<SliderModel>> {
    return repository.loadBanner()
  }
  
  //Category
  fun loadCategory(): LiveData<MutableList<CategoryModel>> {
    return repository.loadCategory()
  }
  
  //Item
  fun loadPopular(): LiveData<MutableList<ItemsModel>> {
    return repository.loadPopular()
  }
  
}