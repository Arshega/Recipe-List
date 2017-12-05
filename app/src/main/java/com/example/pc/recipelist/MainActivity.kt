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

        users.add(User("Roast Pork and Pickled Cucumber Sandwich", "Make quick pickles by combining cucumber, vinegar, oil, brown sugar, salt, and pepper; they give the sandwich an extra zing."))
        users.add(User("Smoked Salmon Salad Sandwich", "Mix freshly roasted salmon with smoked salmon for a delicious filling that’s not overpowering. Bonus: The salmon mixture can be made up to 3 days in advance."))
        users.add(User("Beets, Spinach, and Goat Cheese Sandwich", "Mild, creamy goat cheese pairs well with the sweet roasted beets and raisins."))
        users.add(User("Tomato, Bacon, and Garlic Mayo Sandwich", "Upgrade a standard BLT with a garlicky yogurt sauce and sliced avocado."))
        users.add(User("Chicken, Sprouts, and Provolone Sandwich", "Warm chicken, melted cheese, and crisp sprouts in a toasted bagel makes a satisfying snack or meal."))
        users.add(User("French Ham and Cheese Sandwich", "A mixture of chopped cornichons, butter, Dijon mustard, and fresh tarragon gives this ham and cheese sandwich a French twist."))
        users.add(User("Egg, Frisée, and Caramelized Onion Sandwich", "The slightly runny egg yolk creates a rich, delicious sauce as it mingles with the fig jam."))
        users.add(User("Eggplant With Peppers and Beans Sandwich", "Mash cannellini beans with garlic, tahini, lemon juice, and olive oil for a delicious Middle Eastern-style sandwich spread. "))



        val adapter = CustomAdpater(users)

        recycleview.adapter = adapter



    }



}
