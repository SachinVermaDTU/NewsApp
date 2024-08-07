import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.loc.newsapp.R
import com.loc.newsapp.presentation.Dimens.MediumPadding1
import com.loc.newsapp.presentation.Dimens.MediumPadding2
import com.loc.newsapp.presentation.common.NewsButton

import com.loc.newsapp.presentation.onboarding.Page
import com.loc.newsapp.presentation.onboarding.components.PageIndicator
import com.loc.newsapp.presentation.onboarding.pages


@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page

    ) {
    Column(modifier = modifier){
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(id = page.image),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
          modifier = Modifier.padding(horizontal = MediumPadding2),
        text = page.title ,
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
      )
     Text(
           modifier = Modifier.padding(horizontal = MediumPadding2),
          text = page.description ,
          style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
          // here colourResource help us to support
         // light and dark mode
           color = colorResource(id = R.color.text_medium)
       )
//why have you put so much spacer in between this



    }

}