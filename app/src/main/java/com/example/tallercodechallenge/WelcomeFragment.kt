package com.example.tallercodechallenge

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.tallercodechallenge.databinding.FragmentWelcomeBinding

class HomeFragment : Fragment(R.layout.fragment_welcome) {

    private var _binding: FragmentWelcomeBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentWelcomeBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}