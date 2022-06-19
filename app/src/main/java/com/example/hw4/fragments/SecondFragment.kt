package com.example.hw4.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import com.example.hw4.base.BaseFragment
import com.example.hw4.databinding.FragmentSecondBinding
import com.example.hw4.view_model.MainViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    private val viewModel: MainViewModel by activityViewModels()

    override fun inflateVB(inflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater)
    }

    override fun initView() {
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounterSecond.text = it.toString()
        }
    }

    override fun initListener() {
    }
}