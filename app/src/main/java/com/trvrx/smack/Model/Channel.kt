package com.trvrx.smack.Model

/**
 * Created by User on 30/1/2561.
 */
class Channel(val name: String, val description: String, val id: String) {
    override fun toString(): String {
        return "#$name"
    }
}