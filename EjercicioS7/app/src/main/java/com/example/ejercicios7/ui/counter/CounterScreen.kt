package com.example.ejercicios7.ui.counter
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreen(viewModel: CounterViewModel = viewModel()) {

    val numeroActual by viewModel.contador.collectAsState()

    Column() {
        Text(text = "Valor Actual: $numeroActual")

        Row{
            Button(onClick = {viewModel.decrementar() }){
                Text("Restar")
            }
            Button(onClick = {viewModel.incrementar()}){
                Text("Sumar")
            }

        }

    }

}