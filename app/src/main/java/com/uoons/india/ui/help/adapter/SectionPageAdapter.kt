@file:Suppress("DEPRECATION")

package com.uoons.india.ui.help.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import java.util.ArrayList

class SectionPageAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    private val fragmentList: MutableList<Fragment> = ArrayList()
    private val titleList: MutableList<String> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

    fun addFragmentsAdapter(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        titleList.add(title)
    }
}