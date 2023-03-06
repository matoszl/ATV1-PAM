package com.example.aula20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aula20.ui.theme.Aula20Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula20Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        TituloDoApp()
                        Saudacoes("veinho")
                        Text(text= "Daora qbada?")
                    }
                }
            }
        }
    }
}

@Composable
fun Saudacoes(name: String) {
    Text(text = "Eae $name!")
}

@Composable
fun TituloDoApp(){
    Text(text= "Aula2")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Aula20Theme {
        Column {
            TituloDoApp()
            Saudacoes(name = "veinho")
            Text(text= "Daora qbada?")
        }
    }
}