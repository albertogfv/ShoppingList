package com.albertogfv.shoppinglist.ui.shoppinglist

import android.os.Bundle
import com.albertogfv.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)

}