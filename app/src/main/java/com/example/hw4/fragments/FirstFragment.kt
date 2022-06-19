package com.example.hw4.fragments

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.hw4.databinding.FragmentFirstBinding
import com.example.hw4.base.BaseFragment
import com.example.hw4.view_model.MainViewModel

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateVB(inflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater)
    }

    override fun initView() {

        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }
    }

    override fun initListener() {
        binding.btnCounterPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }
        binding.btnCounterMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }
}