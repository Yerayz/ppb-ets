package com.example.tiketcom

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiketcom.ui.theme.TiketcomTheme

class FlightMainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                    ) {
                        Text(
                            text = "Flight Booking",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    }
                }
            ) {
                innerPadding ->
                Box(modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(Color(0xFF1BA0E1))
                ) {
//                Image(
//                    painter = painterResource(id = R.drawable.bglogin),
//                    contentDescription = "login background",
//                    contentScale = ContentScale.FillBounds,
//                    modifier = Modifier.matchParentSize()
//                )

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(8.dp))
                            .padding(16.dp)
                        ) {
                            Text(text = "From", fontWeight = FontWeight.Bold, color = Color.Gray)
                            Spacer(modifier = Modifier.size(8.dp))
                            Row() {
                                Image(painter = painterResource(id = R.drawable.departures),
                                    contentDescription = "departure",
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                                Spacer(modifier = Modifier.size(16.dp))

                                var departure by remember { mutableStateOf("Jakarta")}

                                BasicTextField(
                                    value = departure,
                                    onValueChange = {departure = it},
                                    textStyle = TextStyle(
                                        fontSize = 18.sp
                                    )
                                )

//                            TextField(
//                                modifier = Modifier.height(16.dp).padding(0.dp),
//                                value = departure,
//                                onValueChange = {departure = it},
//                                singleLine = true,
//                                maxLines = 1,
//                                colors = TextFieldDefaults.textFieldColors(
//                                    containerColor = Color.Transparent,
//                                )
//                            )
                            }

                            Spacer(modifier = Modifier.size(24.dp))

                            Text(text = "To", fontWeight = FontWeight.Bold, color = Color.Gray)
                            Spacer(modifier = Modifier.size(8.dp))
                            Row() {
                                Image(painter = painterResource(id = R.drawable.arrivals),
                                    contentDescription = "destination",
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                                Spacer(modifier = Modifier.size(16.dp))

                                var destination by remember { mutableStateOf("Surabaya")}

                                BasicTextField(
                                    value = destination,
                                    onValueChange = {destination = it},
                                    textStyle = TextStyle(
                                        fontSize = 18.sp
                                    )
                                )
                            }

                            Spacer(modifier = Modifier.size(24.dp))

                            Text(text = "Departure Date", fontWeight = FontWeight.Bold, color = Color.Gray)
                            Spacer(modifier = Modifier.size(8.dp))
                            Row() {
                                Image(painter = painterResource(id = R.drawable.calendar),
                                    contentDescription = "departuredate",
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                                Spacer(modifier = Modifier.size(16.dp))

                                var date by remember { mutableStateOf("Saturday, 18 May 2024")}

                                BasicTextField(
                                    value = date,
                                    onValueChange = {date = it},
                                    textStyle = TextStyle(
                                        fontSize = 18.sp
                                    )
                                )
                            }

                            Spacer(modifier = Modifier.size(24.dp))

                            Row() {
                                Column() {
                                    Text(text = "Passengers", fontWeight = FontWeight.Bold, color = Color.Gray)
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Row() {
                                        Image(painter = painterResource(id = R.drawable.passenger),
                                            contentDescription = "passenger",
                                            modifier = Modifier
                                                .size(24.dp)
                                        )
                                        Spacer(modifier = Modifier.size(16.dp))

                                        var passenger by remember { mutableStateOf("1 Passenger")}

                                        BasicTextField(
                                            value = passenger,
                                            onValueChange = {passenger = it},
                                            textStyle = TextStyle(
                                                fontSize = 18.sp
                                            )
                                        )
                                    }

                                }
                                Column() {
                                    Text(text = "Seat Class", fontWeight = FontWeight.Bold, color = Color.Gray)
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Row() {
                                        Image(painter = painterResource(id = R.drawable.seat),
                                            contentDescription = "seat class",
                                            modifier = Modifier
                                                .size(24.dp)
                                        )
                                        Spacer(modifier = Modifier.size(16.dp))

                                        var seatclass by remember { mutableStateOf("Economy")}

                                        BasicTextField(
                                            value = seatclass,
                                            onValueChange = {seatclass = it},
                                            textStyle = TextStyle(
                                                fontSize = 18.sp
                                            )
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.size(32.dp))

                            Button(
                                modifier = Modifier.fillMaxWidth().height(40.dp),
                                shape = RoundedCornerShape(5.dp),
                                colors = ButtonDefaults.buttonColors(Color(0xFF1BA0E1)),
                                onClick = {
//                                        if(email == "admin" && password == "admin") {
                                    val intent = Intent(this@FlightMainActivity, FlightSearchActivity::class.java)
                                    startActivity(intent)
//                                        }
                                }
                            ) {
                                Text(
                                    fontSize = 18.sp,
                                    text = "Search Your Flight"
                                )
                            }

                        }
                    }
                }
            }

        }
    }
}