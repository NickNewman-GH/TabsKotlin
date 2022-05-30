package com.example.tabsdemo.ui.main

import android.content.Context
import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabsdemo.R


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        //val ids = arrayListOf<Int>(R.array.action, R.array.drama, R.array.comedy)
        //var array = context.resources.getStringArray(ids[position])
        // TODO: создать фрагмент со сведениями о погоде
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // TODO: задать заголовок - название города
        return context.resources.getStringArray(R.array.films)[position]
    }

    override fun getCount(): Int {
        // TODO: возвращать число доступных городов
        return context.resources.getStringArray(R.array.films).size
    }
}