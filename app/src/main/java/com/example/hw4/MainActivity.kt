package com.example.hw4

import android.view.LayoutInflater
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.example.hw4.adapter.PagerAdapter
import com.example.hw4.base.BaseActivity
import com.example.hw4.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateVB(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        initViewPager()
        initTabLayout()
    }

    private fun initTabLayout() {
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {

                    tab.setIcon(R.drawable.ic_baseline_confirmation_number_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_countertops_24)

                    tab.icon?.alpha = 70
                }
                else -> {
                    tab.setIcon(R.drawable.ic_baseline_history_24)
                    tab.icon?.alpha = 70
                }
            }
        }.attach()
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab) {
                tab.icon?.alpha = 250
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                tab.icon?.alpha = 70
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun initViewPager() {
        binding.viewPager2.adapter = PagerAdapter(this)
    }
}