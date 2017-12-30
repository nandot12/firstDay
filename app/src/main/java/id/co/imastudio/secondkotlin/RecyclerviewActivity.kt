package id.co.imastudio.secondkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerviewActivity : AppCompatActivity() {

    //deklrasi
    var gambar = arrayOf(R.drawable.alpukat1,
            R.drawable.duriani,
            R.drawable.ceri1,
            R.drawable.apel1,
            R.drawable.manggisi,
            R.drawable.jambuairi)

    var nama = arrayOf("Alpukat", "Durian", "Ceri", "Apel", "Manggis", "Jambu")

   // var review = arrayOf<Any>(5, 4, 3, 2, 3, 4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        //get call adapter recycler
        var adapter = CustomAdapter(gambar, nama)




        //pindahin aray ke recyclerview di layout
        buahrecyclerview.adapter = adapter
        //tambhin layout manager linear /grid/etc
        buahrecyclerview.layoutManager = LinearLayoutManager(this)


    }
}
