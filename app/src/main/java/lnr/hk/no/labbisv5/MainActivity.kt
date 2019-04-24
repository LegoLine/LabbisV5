package lnr.hk.no.labbisv5

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: ActionBar
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //toolbar.title= "Hjem"
                val homeFragment = HomeFragment.newInstance()
               openFragment(homeFragment)
                println("HJEM KNAPP")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_add -> {
                val addFragment = AddFragment.newInstance()
                openFragment(AddFragment())
                println("ADD KNAPP")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_map -> {
                val detailFragment = AnimalDetailFragment.newInstance()
                openFragment(detailFragment)
                println("MAP KNAPP")
                return@OnNavigationItemSelectedListener true
            }
        }
        false


    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
