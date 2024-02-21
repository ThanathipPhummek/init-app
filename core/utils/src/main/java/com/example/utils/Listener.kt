package com.example.utils

class AppView : Listener {
    override fun succeed(message: String) {
        println("succeed message sdk : $message")
    }

    override fun onClick(event: String, action: String, id: String) {
    }

    override fun onGa4(event: String, action: String, id: String) {
    }

    override fun onError(message: String) {
        println("Error message sdk : $message")
    }
}

interface Listener {
    fun succeed(message: String)
    fun onClick(event: String, action: String, id: String)
    fun onGa4(event: String, action: String, id: String)
    fun onError(message: String)
}