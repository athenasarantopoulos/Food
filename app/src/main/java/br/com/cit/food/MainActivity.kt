package br.com.cit.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cit.food.adapter.TabsPagerFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numeroOfTabs = 3

        tlFood.tabMode = TabLayout.MODE_FIXED

        tlFood.isInlineLabel = true

        //instancia da nossa tabspagefragment
        val adapter = TabsPagerFragment(
            supportFragmentManager,
            lifecycle,
            numeroOfTabs
        )

        viewPager.adapter = adapter

        viewPager.isUserInputEnabled = true

        //Definimos o TabLayoutMediator, que é responsavel de realizar o Link do TabLayout e ViewPager.
        // Neste momento você consegue ajustar o nome das Abas e incluir ícones se necessário.
        TabLayoutMediator(tlFood, viewPager){ tab,position ->
            when(position){
                0 -> tab.text = "Strogonoff"
                1 -> tab.text = "Feijoada"
                2 -> tab.text = "Lasanha"
            }

        }.attach()
    }
}