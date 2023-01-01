package com.shoppi.app.ui.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.app.model.CartItem

class CartViewModel: ViewModel() {

    private val _items = MutableLiveData<List<CartItem>>()
    val item: LiveData<List<CartItem>> = _items

    fun loadCartItem() {
        _items.value
    }

}