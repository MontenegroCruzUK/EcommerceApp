package com.montenegro.ecommerceapp.model

data class CategoryModel(
  val title: String = "",
  val id: Int = 0,
  val picUrl: String = ""
) {
  // Constructor sin argumentos
  constructor() : this("", 0, "")
}
