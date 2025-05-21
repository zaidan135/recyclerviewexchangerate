package project.android.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import project.android.recyclerview.adapter.CountryAdapter
import project.android.recyclerview.model.Country

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val countries = listOf(
            Country("Vietnam", R.drawable.vn, 1.403, 1.746),
            Country("Nicaragua", R.drawable.ni, 9.123, 12.09),
            Country("Korea", R.drawable.kr, 3.704, 5.151),
            Country("Russia", R.drawable.ru, 116.0, 144.4),
            Country("China", R.drawable.cn, 1.725, 2.234),
            Country("Portuguese", R.drawable.pt, 1.403, 1.746),
            Country("Korea", R.drawable.kr, 3.454, 4.312),
            Country("French", R.drawable.fr, 23.45, 34.56),
            Country("Nicaragua", R.drawable.ni, 263.1, 300.3),
            Country("China", R.drawable.cn, 1.725, 2.234),
        )

        adapter = CountryAdapter(countries)
        recyclerView.adapter = adapter
    }
}

// Sabtu 17 Mei 2025

/*
NIM   : 10122231
NAMA  : Zaidan Febriandi
Kelas : IF-6
*/
