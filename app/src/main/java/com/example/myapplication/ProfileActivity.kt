package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// --- Data model ---
data class CardItem(val title: String, val iconRes: Int)

// --- List of card items ---
val cardItems = listOf(
    CardItem("Text", R.drawable.baseline_expand_more_24),
    CardItem("Address", R.drawable.baseline_expand_more_24),
    CardItem("Character", R.drawable.baseline_text_fields_24),
    CardItem("Bank card", R.drawable.baseline_expand_more_24),
    CardItem("Password", R.drawable.baseline_expand_more_24),
    CardItem("Logistics", R.drawable.baseline_expand_more_24)
)

// --- Main Activity ---
class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFF1BD29A) // Background color
            ) {
                CardScreen()
            }
        }
    }
}

// --- Composable: Safe Image Loader for Previews ---
@Composable
fun SafeImage(resId: Int, contentDescription: String?, modifier: Modifier = Modifier) {
    val isInPreview = LocalInspectionMode.current
    if (isInPreview) {
        Box(
            modifier = modifier
                .background(Color.Gray, shape = CircleShape)
        )
    } else {
        Image(
            painter = painterResource(id = resId),
            contentDescription = contentDescription,
            modifier = modifier
        )
    }
}

// --- Composable: Main Screen ---
@Composable
fun CardScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // --- Profile Row ---
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SafeImage(
                resId = R.drawable.profile,
                contentDescription = "Profile",
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
            )
        }

        // --- Title Texts ---
        Text(
            text = "Card",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Simple and easy to use app",
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // --- Card Grid (LazyColumn) ---
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(cardItems.chunked(2)) { rowItems ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    for (item in rowItems) {
                        CardItemView(item, modifier = Modifier.weight(1f))
                    }
                    if (rowItems.size == 1) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Slightly more spacing

        // --- Settings Card ---
        SettingsCard()
    }
}

// --- Composable: Single Card Item ---
@Composable
fun CardItemView(item: CardItem, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.height(160.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            SafeImage(
                resId = item.iconRes,
                contentDescription = item.title,
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = item.title, fontWeight = FontWeight.Bold)
        }
    }
}

// --- Composable: Settings Card ---
@Composable
fun SettingsCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_expand_more_24),
                contentDescription = "Settings",
                modifier = Modifier.size(32.dp),
                tint = Color.Unspecified // Keep original icon color
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Settings",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

// --- Preview ---
@Preview(showBackground = true)
@Composable
fun CardScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF1BD29A)
    ) {
        CardScreen()
    }
}
