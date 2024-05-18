package com.example.tiketcom

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiketcom.ui.theme.TiketcomTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(id = R.drawable.bglogin),
                        contentDescription = "login background",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.matchParentSize()
                    )
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier.padding(32.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Spacer(modifier = Modifier.height(20.dp))
                                Text(
                                    text = "Welcome Back",
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Log in now to enjoy the \n Lowest Price Guarantee",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    color = Color.White
                                )
                            }
                        }
                        Row (modifier = Modifier.fillMaxSize()) {
                            Column (
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
//                            Image(painter = painterResource(id = R.drawable.bglogin), contentDescription = "login image",
//                                modifier = Modifier.size(200.dp))

                                var email by remember { mutableStateOf("") }
                                var password by remember { mutableStateOf("") }

                                Spacer(modifier = Modifier.height(16.dp))

                                OutlinedTextField(value = email, onValueChange = {email = it}, label = {
                                    Text(text = "Email Address")
                                })

                                Spacer(modifier = Modifier.height(8.dp))

                                OutlinedTextField(value = password, onValueChange = {password = it}, label = {
                                    Text(text = "Password")
                                }, visualTransformation = PasswordVisualTransformation())

                                Spacer(modifier = Modifier.height(16.dp))

                                Button(
                                    modifier = Modifier.size(width = 280.dp, height = 48.dp),
                                    shape = RoundedCornerShape(5.dp),
                                    colors = ButtonDefaults.buttonColors(Color(0xFF1BA0E1)),
                                    onClick = {
                                        if(email == "admin" && password == "admin") {
                                            val intent = Intent(this@MainActivity, FlightMainActivity::class.java)
                                            startActivity(intent)
                                        }
                                    }
                                ) {
                                    Text(
                                        fontSize = 16.sp,
                                        text = "Login"
                                    )
                                }

                                Spacer(modifier = Modifier.height(64.dp))

                                Text(text = "Or Sign in with")

                                Row (
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(24.dp),
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Image(painter = painterResource(id = R.drawable.facebook),
                                        contentDescription = "facebook",
                                        modifier = Modifier
                                            .size(56.dp)
                                            .clickable {
                                            }
                                    )
                                    Image(painter = painterResource(id = R.drawable.google),
                                        contentDescription = "google",
                                        modifier = Modifier
                                            .size(56.dp)
                                            .clickable {
                                            }
                                    )
                                }

                                Spacer(modifier = Modifier.height(32.dp))

                                Text(
                                    textAlign = TextAlign.Center,
                                    text = "By logging in you have agreed to tiket.com's \n Terms & Conditions and Privacy Policy")
                            }
                        }
                    }
                }
            }
        }
    }
}
