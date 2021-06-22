package br.com.cit.food.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.cit.food.R
import br.com.cit.food.fragments.Feijoada
import br.com.cit.food.fragments.Lasanha
import br.com.cit.food.fragments.Strog

class TabsPagerFragment(fm: FragmentManager, lifecycle: Lifecycle, private var numeroAbas : Int) : FragmentStateAdapter(fm,lifecycle) {


    override fun getItemCount(): Int = numeroAbas

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Strog()
            1 -> Feijoada()
            2 -> Lasanha()
            else -> Strog()
        }
    }

}