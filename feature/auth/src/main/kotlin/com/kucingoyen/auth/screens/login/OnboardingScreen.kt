package com.kucingoyen.auth.screens.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.kucingoyen.auth.screens.AuthViewModel
import com.kucingoyen.auth.screens.login.bottomsheet.BottomSheetLogin
import com.kucingoyen.auth.screens.login.bottomsheet.BottomSheetRegister
import com.kucingoyen.core.R
import com.kucingoyen.core.theme.BaseColor

@Composable
fun LoginScreen(
    viewModel: AuthViewModel = hiltViewModel(),
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BaseColor.Irish.Minus70)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Canton Network",
            fontSize = 18.sp,
            color = BaseColor.MicroLend.TextPurple,
            fontWeight = FontWeight.SemiBold,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
        )

        Spacer(modifier = Modifier.weight(1f))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_microlend_logo),
                contentDescription = "",
                modifier = Modifier.size(180.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(48.dp))

            Text(
                text = "Let's get started!",
                fontSize = 36.sp,
                lineHeight = 40.sp,
                color = BaseColor.MicroLend.TextPurple,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Normal
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = {viewModel.updateShowSheetRegister(true) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(10),
                colors = ButtonDefaults.buttonColors(
                    containerColor = BaseColor.Black,
                    contentColor = BaseColor.White
                )
            ) {
                Text(
                    text = "Create a new account",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Button(
                onClick = { viewModel.updateShowSheetLogin(true)},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(10),
                colors = ButtonDefaults.buttonColors(
                    containerColor = BaseColor.MicroLend.ButtonSecondaryBg,
                    contentColor = BaseColor.MicroLend.TextPurple
                ),
                elevation = ButtonDefaults.buttonElevation(0.dp)
            ) {
                Text(
                    text = "I have an existing account",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
        BottomSheetLogin(authViewModel = viewModel)
        BottomSheetRegister(authViewModel = viewModel)
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMetaMaskScreen() {
    LoginScreen()
}