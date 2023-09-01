package com.pjm.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pjm.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)
}

@Composable
fun ArticleTitle(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.article_title),
        fontSize = 24.sp,
        modifier = modifier.padding(16.dp)
    )
}

@Composable
fun ArticleFirstText(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.article_first_text),
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(horizontal = 16.dp)
    )
}

@Composable
fun ArticleSecondText(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.article_second_text),
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(16.dp)
    )
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column {
        ArticleImage()
        ArticleTitle()
        ArticleFirstText()
        ArticleSecondText()
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        Article()
    }
}