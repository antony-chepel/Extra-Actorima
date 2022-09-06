package com.bakeysdietfood.app

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.extraactorima.app.databinding.QuotesItemBinding
import com.extraactorima.app.extradata.ExtraData


class ExtraAdapter(val jdggfwe : List<ExtraData>, val activity : AppCompatActivity) : RecyclerView.Adapter<ExtraAdapter.DietHolder>() {

    class DietHolder(val binding : QuotesItemBinding, val activity : AppCompatActivity) : RecyclerView.ViewHolder(binding.root) {

        fun setData(osisad : ExtraData) = with(binding){

            tvText.text = activity.getString(osisad.author)
            tvAuthor.text = activity.getString(osisad.title)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DietHolder {
        val binding = QuotesItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DietHolder(binding,activity)

    }

    override fun onBindViewHolder(holder: DietHolder, position: Int) {
        holder.setData(jdggfwe[position])
        holder.itemView.setOnClickListener {
            val i = Intent(activity,DetailExtra::class.java).apply {
                putExtra(USASD,activity.getString(jdggfwe[position].author))
                putExtra(KSAJSA,activity.getString(jdggfwe[position].title))
            }
            activity.startActivity(i)
        }

    }

    override fun getItemCount(): Int = jdggfwe.size

  companion object{
      const val USASD = "name_diet"
      const val KSAJSA = "dec_diet"
  }

}