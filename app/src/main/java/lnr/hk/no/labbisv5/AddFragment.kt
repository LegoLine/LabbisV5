package lnr.hk.no.labbisv5
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_add.view.*

class AddFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.setTitle("Legg til kjæledyr")
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_add, container, false)

        view.addBtn.setOnClickListener { view ->
            Toast.makeText(activity, "Will save pet eventually", Toast.LENGTH_LONG).show()
            Log.d("addBtn", "Selected")
        }

        return view

    }

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }
}