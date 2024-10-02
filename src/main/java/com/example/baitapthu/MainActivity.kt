

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*

import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.baitapthu.R
import com.example.baitapthu.ui.theme.BaitapThuTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.ui.text.TextStyle
import java.time.temporal.TemporalQueries.offset

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BaitapThuTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),

                    )
                }
            }
        }
    }
}



@Composable
fun TopRightImage() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.background1),
            contentDescription = "My Image",
            modifier = Modifier
                .size(150.dp)
                .offset(x = (80).dp, y = -40.dp)
                .align(Alignment.TopEnd)
        )
        Image(
            painter = painterResource(id = R.drawable.background2),
            contentDescription = "My Image",
            modifier = Modifier
                .size(150.dp)
                .offset(x = (-300).dp, y = 55.dp)
                .align(Alignment.BottomEnd)
        )


        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally


        ) {
             Text(text = "LOGIN", modifier = Modifier.align(Alignment.Start).offset(y = (-10).dp), fontSize = 30.sp)
             Text(text = "Login để tiếp tục", modifier = Modifier.align(Alignment.Start).offset(y = (-7).dp), fontSize = 15.sp, color = Color.Gray)
            Text(text = "Email", modifier = Modifier.align(Alignment.Start))

            OutlinedTextField(

                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                }
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Mật Khẩu", modifier = Modifier.align(Alignment.Start))
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("************") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "Lock Icon"
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.Yellow),
                modifier = Modifier.offset(x = 100.dp)

            ) {
                Text("Login")
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "đHello $name!",
        modifier = Modifier.
        background(Color.White)
    )
}



@Preview
@Composable
fun TopRightImagePreview() {

    TopRightImage()
}