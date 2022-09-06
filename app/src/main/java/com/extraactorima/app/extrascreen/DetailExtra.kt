package com.bakeysdietfood.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.extraactorima.app.databinding.ActivityDetailQuotesBinding


class DetailExtra : AppCompatActivity() {
    private lateinit var binding: ActivityDetailQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailQuotesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        isisdidwq()
        nhdsdsdf()
    }

    private fun isisdidwq() = with(binding){
        val title = intent.getStringExtra(ExtraAdapter.USASD)
        val desc = intent.getStringExtra(ExtraAdapter.KSAJSA)

        tvAuthorDetail.text = title.toString()
        tvContentDetail.text = desc.toString()
    }

    private fun nhdsdsdf(){
        binding.imBack.setOnClickListener {
            finish()
        }
    }
}