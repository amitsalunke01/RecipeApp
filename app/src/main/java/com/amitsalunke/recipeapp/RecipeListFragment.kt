package com.amitsalunke.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class RecipeListFragment : Fragment() {

    //new way to create layout is just to pass the R.layout.fragment_recipe_list to the extended Fragment(R.layout.fragment_recipe_list)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                Column(Modifier.padding(16.dp)) {
                    Text(
                        "Recipe List",
                        style = TextStyle(
                            fontSize = TextUnit.Companion.Sp(21)
                        )
                    )
                    Spacer(Modifier.padding(10.dp))
                    Button(
                        onClick = {
                            findNavController().navigate(R.id.viewRecipe)
                        }
                    ) {
                        Text(text = "To Recipe Fragment")//what is this button going to do
                    }
                }
            }
        }


        //when using layout .xml file and this used for custom layout
        /* val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
         view.findViewById<ComposeView>(R.id.compose_view).setContent {
             Column(
                 Modifier
                     .border(BorderStroke(1.dp, Color.Black))
                     .padding(16.dp)
             ) {
                 Text("This is a composable inside the fragment")
                 Spacer(Modifier.padding(10.dp))
                 CircularProgressIndicator()
                 Spacer(Modifier.padding(10.dp))
                 Text("Neat")
                 Spacer(Modifier.padding(10.dp))
                 //custom view
                 val customView = HorizontalDottedProgress(ContextAmbient.current)
                 AndroidView(viewBlock = { customView })
             }
         }
         return view*/

        //one way of writing it
        /*val view = ComposeView(requireContext())
        view.apply {
            setContent {
                Text(" Hey look a composable ")
            }
        }
        return view*/

        //other way
        /*return ComposeView(requireContext()).apply {
            setContent {
                Text(text = "Recipe List Fragment")
            }
        }*/
    }


}