package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.capt,
                "Captain America",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.ironman,
                "Iron Man",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.thor,
                "Thor",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.strange,
                "Dr. Strange",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.panther,
                "Black Panter",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.spider,
                "Spider Man",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.groot,
                "Groot",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}