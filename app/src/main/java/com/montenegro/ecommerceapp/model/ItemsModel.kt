package com.montenegro.ecommerceapp.model

import java.io.Serializable

data class ItemsModel(
  var title: String = "",
  var description: String = "",
  var categoryId: String = "",
  var picUrl: ArrayList<String> = ArrayList(),
  var model: ArrayList<String> = ArrayList(),
  var price: Double = 0.0,
  var rating: Double = 0.0,
  var numberInCart: Int = 0,
  var showRecommended: Boolean = false
) : Serializable