package com.montenegro.ecommerceapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.montenegro.ecommerceapp.model.SliderModel


class MainRepository {
  private val firebaseDatabase = FirebaseDatabase.getInstance()
  
  fun loadBanner():LiveData<MutableList<SliderModel>> {
    
    val listData = MutableLiveData<MutableList<SliderModel>>()
    val ref = firebaseDatabase.getReference("Banner")
    
    ref.addValueEventListener(object : ValueEventListener {
      
      override fun onDataChange(snapshot: DataSnapshot) {
        val lists = mutableListOf<SliderModel>()
        for (childSnapshot in snapshot.children) {
          val item = childSnapshot.getValue(SliderModel::class.java)
          item?.let { lists.add(it) }
        }
        listData.value = lists
      }
      
      override fun onCancelled(error: DatabaseError) {
        TODO("Not yet implemented")
      }
      
      
    })
    return listData
  }
}