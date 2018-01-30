package com.trvrx.smack.Services

import android.graphics.Color
import com.trvrx.smack.Controller.App
import java.util.*

/**
 * Created by User on 29/1/2561.
 */
object UserDataService {
    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

    fun logout() {
        id = ""
        avatarColor = ""
        avatarName = ""
        email = ""
        name = ""
        App.prefs.authToken = ""
        App.prefs.userEmail = ""
        App.prefs.isLoggedIn = false
    }
    fun returnAvatarColor(components: String) : Int {
        val strippedColor = components
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")

        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColor)
        if (scanner.hasNext()) {
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }
        println("stripped Color is: $strippedColor")
        println("color R is: $r")
        println("color G is: $g")
        println("color B is: $b")
        return Color.rgb(r, g, b)
    }
}