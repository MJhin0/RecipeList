// Michael Jhin

package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mRecipeList = new LinkedList<>();
    private final LinkedList<String> mRecipeDesc = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private RecipeAdaptor mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecipeList.add("Pizza");
        mRecipeDesc.add("A classic homemade pizza recipe. Make perfect pizza at home!");
        mRecipeList.add("Chili");
        mRecipeDesc.add("The beans! The spices! The meat! When it comes to homemade Chili, what's not to love?");
        mRecipeList.add("General Tso's Chicken");
        mRecipeDesc.add("A favorite chinese food that's sweet and spicy with a kick!");
        mRecipeList.add("Meatloaf");
        mRecipeDesc.add("When it comes to comfort food, nothing quite beats a classic meatloaf.");
        mRecipeList.add("Stuffing");
        mRecipeDesc.add("Golden and crunchy edges, with a soft inside!");
        mRecipeList.add("Mashed Potatoes");
        mRecipeDesc.add("Rich, creamy, full of great flavor, easy to make, and always a crowd fave!");
        mRecipeList.add("Gravy");
        mRecipeDesc.add("The best sauce.");
        mRecipeList.add("French Onion Soup");
        mRecipeDesc.add("Warm, cozy, and flavorful. Top with croutons to finish!");
        mRecipeList.add("Chicken Pot Pie");
        mRecipeDesc.add("Tender, flaky, and most importantly, delicious.");
        mRecipeList.add("Buttermilk Pie");
        mRecipeDesc.add("This old-fashioned pie is wonderful to freeze, or just eat normally.");

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new RecipeAdaptor(this, mRecipeList, mRecipeDesc);
        mRecyclerView.setAdapter(mAdapter);

    }

}