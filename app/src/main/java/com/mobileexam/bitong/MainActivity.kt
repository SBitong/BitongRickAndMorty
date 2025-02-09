package com.mobileexam.bitong

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobileexam.bitong.model.Character
import com.mobileexam.bitong.model.characters
import com.mobileexam.bitong.ui.theme.BitongTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BitongTheme {
                CharacterListScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterListScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Rick and Morty Characters") }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier.padding(8.dp)
        ) {
            items(characters) { character ->
                CharacterCard(character)
            }
        }
    }
}

@Composable
fun CharacterCard(character: Character) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp).animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy,
                stiffness = Spring.StiffnessMedium
        )
        )) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    Image(
                        painter = painterResource(id = character.image),
                        contentDescription = stringResource(id = character.name),
                        modifier = Modifier.size(80.dp).clip(RoundedCornerShape(12.dp))
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text(text = stringResource(id = character.name), style = MaterialTheme.typography.titleMedium)
                        Text(text = "Status: ${stringResource(id = character.status)}")
                        Text(text = "Species: ${stringResource(id = character.species)}")
                    }
                }

                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = if (expanded) Icons.Default.ArrowDropUp else Icons.Default.ArrowDropDown,
                        contentDescription = if (expanded) "Collapse" else "Expand"
                    )
                }
            }

            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Gender: ${stringResource(id = character.gender)}")
                Text(text = "Origin: ${stringResource(id = character.origin)}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCharacterListScreen() {
    BitongTheme {
        CharacterListScreen()
    }
}
