package com.trvrx.smack.Utilities

/**
 * Created by User on 29/1/2561.
 */

//const val BASE_URL = "http://localhost:3005/v1/"
const val BASE_URL = "http://192.168.8.6:3005/v1/"
const val SOCKET_URL = "http://192.168.8.6:3005/"

const val URL_REGISTER = "${BASE_URL}account/register"
const val URL_LOGIN = "${BASE_URL}account/login"
const val URL_CREATE_USER = "${BASE_URL}user/add"
const val URL_GET_USER = "${BASE_URL}user/byEmail/"
const val URL_GET_CHANNEL = "${BASE_URL}channel/"
const val URL_GET_MESSAGES = "${BASE_URL}message/byChannel/"

// Broadcast Constants
const val BROADCAST_USER_DATA_CHANGE = "BROADCAST_USER_DATA_CHANGE"