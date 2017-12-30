package id.co.imastudio.secondkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlistview.setOnClickListener(this)
        btnrecyclerview.setOnClickListener(this)



    }

    override fun onClick(p0: View?) {
//
//        if(p0 == btnlistview){
//
//        }
//        else{
//
//        }

        when(p0){

            btnlistview -> {
                startActivity(Intent(this,ListviewActivity::class.java))
            //atau
//
//                var intent = Intent(this,ListviewActivity::class.java)
//                startActivity(intent)
            }
            btnrecyclerview -> {
                startActivity(Intent(this,RecyclerviewActivity::class.java))

            }
        }


       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
