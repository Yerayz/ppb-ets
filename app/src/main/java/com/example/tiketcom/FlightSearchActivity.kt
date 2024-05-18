package com.example.tiketcom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiketcom.ui.theme.TiketcomTheme

class FlightSearchActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                modifier = Modifier.background(Color(0xFF1BA0E1)),
                topBar = {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF1BA0E1))
                        .padding(16.dp)
                    ) {
                        Text(
                            text = "Flight Search",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
            ) {
                innerPadding ->
                Column(modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(Color(0xFFF4F4F4))
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .shadow(1.dp, RoundedCornerShape(16.dp))
                        .background(Color.White, shape = RoundedCornerShape(16.dp))
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Rp 881.500",
                                color = Color(0xFFE27A26),
                                fontWeight = FontWeight.Bold,
                                fontSize = 24.sp
                            )

                            Spacer(modifier = Modifier.size(16.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text="18.40",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text="1h 25m",
                                    fontSize = 12.sp
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text = "20.15",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                            }

                            Spacer(modifier = Modifier.size(16.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(painter = painterResource(id = R.drawable.citilink),
                                    contentDescription = "citilink",
                                    modifier = Modifier
                                        .size(48.dp)
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text = "Citilink",
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .shadow(1.dp, RoundedCornerShape(16.dp))
                        .background(Color.White, shape = RoundedCornerShape(16.dp))
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Rp 881.500",
                                color = Color(0xFFE27A26),
                                fontWeight = FontWeight.Bold,
                                fontSize = 24.sp
                            )

                            Spacer(modifier = Modifier.size(16.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text="18.40",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text="1h 25m",
                                    fontSize = 12.sp
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text = "20.15",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                            }

                            Spacer(modifier = Modifier.size(16.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(painter = painterResource(id = R.drawable.citilink),
                                    contentDescription = "citilink",
                                    modifier = Modifier
                                        .size(48.dp)
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text = "Citilink",
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .shadow(1.dp, RoundedCornerShape(16.dp))
                        .background(Color.White, shape = RoundedCornerShape(16.dp))
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Rp 881.500",
                                color = Color(0xFFE27A26),
                                fontWeight = FontWeight.Bold,
                                fontSize = 24.sp
                            )

                            Spacer(modifier = Modifier.size(16.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text="18.40",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text="1h 25m",
                                    fontSize = 12.sp
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text = "20.15",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                            }

                            Spacer(modifier = Modifier.size(16.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(painter = painterResource(id = R.drawable.citilink),
                                    contentDescription = "citilink",
                                    modifier = Modifier
                                        .size(48.dp)
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text = "Citilink",
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
