package id.co.imastudio.secondkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recyclerview_item.view.*

/**
 * Created by nandoseptianhusni on 12/30/17.
 */
class CustomAdapter(gambar: Array<Int>, nama: Array<String>) : RecyclerView.Adapter<CustomAdapter.MyHolder>() {


    lateinit var gambar : Array<Int>
    lateinit var nama : Array<String>

    //initialist
    init {
      this.gambar = gambar
        this.nama = nama
    }




    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.bind(position,gambar,nama)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {

       var view = LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item,parent,false)


        return MyHolder(view)

       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {

        return nama.size

        //return untuk
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int, gambar: Array<Int>, nama: Array<String>) {
            //pindahin value array ke view

          itemView.imgbuah.setImageResource(gambar.get(position))




            //textview juga




        }

    }
}