package com.example.pc.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Adapter
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview = findViewById<RecyclerView>(R.id.recyclerView)

        recycleview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("Crispy Cheddar Chicken", "Super easy: Just halve some chicken breasts, and dip them in milk, cheddar, and crushed Ritz crackers or breadcrumbs. Then bake"))
        users.add(User("One Pot Spaghetti with Meat Sauce", "Ground beef can be expensive, so I substitute half the meat for minced mushrooms, and nobody ever notices. Just toss mushrooms in a food processor and pulse. After you brown the beef, add the mushrooms, seasonings, and tomato sauce. This also works with taco meat, chili, and sloppy joes."))
        users.add(User("Fish in Lemon & Butter Sauce", "So simple, and works with with pretty much any white fish."))
        users.add(User("Easy Fried Rice", "This takes less than 10 minutes if you use day-old rice and frozen peas and carrots."))
        users.add(User("Pesto Chicken Bake", "I love the store-brand pesto at Trader Joes and Whole Foods, but it's also pretty cheap and fast to make your own"))
        users.add(User("Whole Wheat Penne With Sausage & Peppers", "I use any produce that's about to turn, always with lots of garlic and olive oil"))
        users.add(User("Shakshuka", "The best part is the rich, tomato-y sauce — with eggs baked right in."))



        val adapter = CustomAdpater(users, applicationContext)

        recycleview.adapter = adapter



    }



}
