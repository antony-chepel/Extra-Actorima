package com.extraactorima.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bakeysdietfood.app.ExtraAdapter
import com.extraactorima.app.databinding.ActivityMainBinding
import com.extraactorima.app.extrautils.ExtraList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var hshsdgdw : ExtraAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        isidwfewf()
    }

    private fun isidwfewf() = with(binding){
        hshsdgdw = ExtraAdapter(ExtraList.isosoadwqwdw,this@MainActivity)
        bnsamksd.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        bnsamksd.adapter = hshsdgdw

    }
}