package lnr.hk.no.labbisv5

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

//TODO: Finne en måte å erstatte mCtx sånn at koden funker med fragment

class MyListAdapter (var mCtx: Activity, var resource: Int, var items: List<Model>)
    :ArrayAdapter<Model>(mCtx, resource, items){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        val view: View = layoutInflater.inflate(resource, null)
        val imageView: ImageView = view.findViewById(R.id.list_view_image)
        val titleView: TextView = view.findViewById(R.id.list_view_title_txt)
        val descTView: TextView = view.findViewById(R.id.list_view_desc_txt)

        var mItems: Model = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.img))
        titleView.text = mItems.title
        descTView.text = mItems.desc


        return view
    }
}