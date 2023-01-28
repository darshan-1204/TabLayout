package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class HomePagesAdapter(fm: FragmentManager, fragments: Array<Fragment>, titles: Array<String>) : FragmentPagerAdapter(fm) {

    var fragments  = fragments
    var title = titles

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title.get(position)
    }

}