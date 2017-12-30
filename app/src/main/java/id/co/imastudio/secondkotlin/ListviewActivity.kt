package id.co.imastudio.secondkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter

import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {

    //versi java String[] data = {}
    //variable aarray
    var data = arrayOf("Alpukat","Apel","Ceri","Duku","hehe")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        //include array ke adapter
        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,data)

        //adapter include to listview
        listbuah.adapter = adapter

        //event klik listview
       listbuah.setOnItemClickListener { adapterView, view, i, l ->

           Log.d("klik user ",data.get(i))
       }

        //versi javanya
        //listview.setAdapter(adapter);

    }
}
