package com.example.recipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecipeAdaptor extends RecyclerView.Adapter<RecipeAdaptor.WordViewHolder>{
    private LayoutInflater mInflater;
    private LinkedList<String> mRecipeList;
    private LinkedList<String> mRecipeDesc;
    private Context context;


    public RecipeAdaptor(Context context, LinkedList<String> recipeList, LinkedList<String> recipeDesc) {
        mInflater = LayoutInflater.from(context);
        mRecipeList = recipeList;
        mRecipeDesc = recipeDesc;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.recipe_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mCurrent = mRecipeList.get(position);
        holder.mRecipeView.setText(mCurrent);
        mCurrent = mRecipeDesc.get(position);
        holder.mRecipeDescView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mRecipeList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mRecipeView;
        private TextView mRecipeDescView;
        private RecipeAdaptor adapter;

        public WordViewHolder(View itemView, RecipeAdaptor adapter) {
            super(itemView);
            mRecipeView = itemView.findViewById(R.id.word);
            mRecipeDescView = itemView.findViewById(R.id.text);

            this.adapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, RecipeDetailActivity.class);
            context.startActivity(intent);
        }

    }

}