package lnr.hk.no.labbisv5

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.ListView

class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.setTitle("Hjem")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        /*val listView: ListView = view.findViewById(R.id.homeListView)
        val list = mutableListOf<Model>()


        listView.adapter = MyListAdapter(this.context, R.layout.row, list)
*/
        return view
    }

    //activity.context

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }
}