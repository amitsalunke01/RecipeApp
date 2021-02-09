package com.amitsalunke.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RecipeListFragment : Fragment() {

    //new way to create layout is just to pass the R.layout.fragment_recipe_list to the extended Fragment(R.layout.fragment_recipe_list)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
        return view
    }


}