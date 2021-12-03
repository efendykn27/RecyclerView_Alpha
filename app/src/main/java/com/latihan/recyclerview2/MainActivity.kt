package com.latihan.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.latihan.recyclerview2.adapter.AlphaAdapters
import com.latihan.recyclerview2.model.AlpaChar

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var gridLayoutManager : GridLayoutManager? = null
    private var arrayList : ArrayList<AlpaChar>? = null
    private var alphaAdapters : AlphaAdapters? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recylerView)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters
    }

    private fun setDataInList(): ArrayList<AlpaChar>{
        var items:ArrayList<AlpaChar> = ArrayList()

        items.add(AlpaChar(R.drawable.letter_a, "Char A"))
        items.add(AlpaChar(R.drawable.letter_b, "Char B"))
        items.add(AlpaChar(R.drawable.letter_c, "Char C"))
        items.add(AlpaChar(R.drawable.letter_d, "Char D"))
        items.add(AlpaChar(R.drawable.letter_e, "Char E"))
        items.add(AlpaChar(R.drawable.letter_f, "Char F"))
        items.add(AlpaChar(R.drawable.letter_g, "Char G"))
        items.add(AlpaChar(R.drawable.letter_h, "Char H"))
        items.add(AlpaChar(R.drawable.letter_i, "Char I"))
        items.add(AlpaChar(R.drawable.letter_j, "Char J"))
        items.add(AlpaChar(R.drawable.letter_k, "Char K"))
        items.add(AlpaChar(R.drawable.letter_l, "Char L"))
        items.add(AlpaChar(R.drawable.letter_m, "Char M"))
        items.add(AlpaChar(R.drawable.letter_n, "Char N"))
        items.add(AlpaChar(R.drawable.letter_o, "Char O"))
        items.add(AlpaChar(R.drawable.letter_p, "Char P"))
        items.add(AlpaChar(R.drawable.letter_q, "Char Q"))
        items.add(AlpaChar(R.drawable.letter_r, "Char R"))
        items.add(AlpaChar(R.drawable.letter_s, "Char S"))
        items.add(AlpaChar(R.drawable.letter_t, "Char T"))
        items.add(AlpaChar(R.drawable.letter_u, "Char U"))
        items.add(AlpaChar(R.drawable.letter_v, "Char V"))
        items.add(AlpaChar(R.drawable.letter_w, "Char W"))
        items.add(AlpaChar(R.drawable.letter_x, "Char X"))
        items.add(AlpaChar(R.drawable.letter_y, "Char Y"))
        items.add(AlpaChar(R.drawable.letter_z, "Char Z"))





        return items

    }
}