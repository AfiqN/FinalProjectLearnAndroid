package com.example.finalproject

import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailView : AppCompatActivity() {
    companion object {
        const val EXTRA_FOOD = "extra_food"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_food)

        val imgObject: ImageView = findViewById(R.id.img_detail)
        val title: TextView = findViewById(R.id.tv_data_received)
        val desc: TextView = findViewById(R.id.detail_description)
        val recipe: TextView = findViewById(R.id.detail_recipe)
        val procedure: TextView = findViewById(R.id.detail_procedure)

        val food = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(EXTRA_FOOD, Food::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_FOOD)
        }

        if (food != null) {
            Glide.with(this)
                .load(food.image)
                .into(imgObject)
            title.text = food.name
            desc.text = food.description
            recipe.text = food.recipe
            procedure.text = food.procedure
        }
    }
}