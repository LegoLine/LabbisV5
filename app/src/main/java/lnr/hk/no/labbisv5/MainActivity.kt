package lnr.hk.no.labbisv5

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var toolbar: ActionBar
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerViewAdapter
    var datalist = ArrayList<String>()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //toolbar.title= "Hjem"
                //val homeFragment = HomeFragment.newInstance()
               //openFragment(homeFragment)
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

        recyclerView = findViewById(R.id.recyclerView)
        adapter = RecyclerViewAdapter(this, datalist)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        addAnimals()
        adapter.notifyDataSetChanged()
    }

    private fun addAnimals() {
        datalist!!.add("Dog")
        datalist!!.add("Cat")
        datalist!!.add("Monkey")
        datalist!!.add("lion")
        datalist!!.add("Elephent")
        datalist!!.add("Cheetah")
        datalist!!.add("Snake")
        datalist!!.add("Cow")
        datalist!!.add("Ant")
        datalist!!.add("Tiger")
        datalist!!.add("Lizard")

    }
}
