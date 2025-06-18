package com.example.domain.exception

class SeverError (val status : String , val serverMessage:String):Exception(serverMessage) {


}