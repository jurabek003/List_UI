package uz.turgunboyevjurabek.listui

import android.annotation.SuppressLint
import android.graphics.Paint.Style
import android.graphics.Typeface
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.listui.ui.theme.ListUITheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    val img = painterResource(id = R.drawable.img)

                    val list = ArrayList<Data>()
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    list.add(Data(img, "kuchukcha", "hayvonlar turkumiga kiradi"))
                    Column(modifier = Modifier.fillMaxSize()) {
                        Scaffold(
                            topBar = {
                                ActionBar()
                            },
                            content = {
                                val scrollState = rememberLazyListState()

                                LazyColumn(
                                    contentPadding = PaddingValues(top = 60.dp), // TopAppBarni joylashtirish
                                state = scrollState
                                ) {
                                    items(list.size) { index ->
                                        ItemUI(data = list[index])
                                    }
                                }
                            }
                        )
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview(showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        ListUITheme {
            Column {
                ActionBar()
                val img = painterResource(id = R.drawable.img)
                val data = Data(img, "kuchukcha", "hayvonlar turkumiga kiradi")
                ItemUI(data)
            }

        }
    }

    @Composable
    fun ItemUI(
        data: Data,
        modifier: Modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {

        Card(
            modifier = modifier.clip(
                RoundedCornerShape(
                    topStart = 25.dp,
                    bottomEnd = 25.dp,
                    topEnd = 0.dp,
                    bottomStart = 0.dp
                )
            ),

            shape = CardDefaults.shape,
        ) {
            Row(
                modifier = Modifier
                    .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(35.dp)
                        .clip(MaterialTheme.shapes.extraLarge),
                    painter = painterResource(R.drawable.img), contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(
                        text = data.name,
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier.padding(vertical = 5.dp)
                    )
                    Text(
                        text = data.description,
                        color = Color.Black,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier.padding(vertical = 5.dp)
                    )
                }
            }
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ActionBar(modifier: Modifier = Modifier.fillMaxWidth()) {

        CenterAlignedTopAppBar(
            title = {
                Row(
                    modifier = modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Dogs",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.DarkGray
                    )
                }

            },
            modifier = modifier
        )


    }
}
