package com.shoppi.app.ui.category

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.shoppi.app.R
import com.shoppi.app.ui.common.ViewModelFactory

class CategoryFragment: Fragment() {

    private val viewModel: CategoryViewModel by viewModels {ViewModelFactory(requireContext()) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel.items.observe(viewLifecycleOwner) {
            Log.d("categoryFragment", "items=$it")
        }
    }
}