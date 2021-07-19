package com.example.workouttimersimple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.workouttimersimple.ui.theme.WorkOutTimerSimpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkOutTimerSimpleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Container()
                }
            }
        }
    }
}

@Composable
fun Container () {
   Column(modifier = Modifier
       .fillMaxWidth(1f)
       .fillMaxHeight(0.9f),horizontalAlignment = Alignment.CenterHorizontally) {
        Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.padding(20.dp)) {

            var setCount by remember { mutableStateOf("") }
            OutlinedTextField(
                value = setCount,
                onValueChange = { setCount = it },
                label = { Text("sets") })


        }
       Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.padding(20.dp)) {
           var activeTime by remember { mutableStateOf("") }
           OutlinedTextField(
               value = activeTime,
               onValueChange = { activeTime = it },
               label = { Text("active time") })
       }
       Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.padding(20.dp)) {
           var intervalTime by remember { mutableStateOf("") }
           OutlinedTextField(
               value = intervalTime,
               onValueChange = { intervalTime = it },
               label = { Text("interval time ") })
       }
       Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.padding(20.dp)) {
           Button(onClick = { /*TODO*/ }) {
               Text(text = "start")
           }
       }
   }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WorkOutTimerSimpleTheme {
        Container()
        
    }
}