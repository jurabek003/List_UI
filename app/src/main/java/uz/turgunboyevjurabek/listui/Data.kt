package uz.turgunboyevjurabek.listui

import android.accounts.AuthenticatorDescription
import android.graphics.drawable.PaintDrawable
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter

data class Data(
     var img:Painter,val name:String,var description: String)
