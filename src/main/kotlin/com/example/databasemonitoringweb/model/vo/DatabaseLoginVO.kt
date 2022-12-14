package com.example.databasemonitoringweb.model.vo

class DatabaseLoginVO() {
    var host: String? = null;
    var user: String? = null;
    var password: String? = null;

    init {
        println("DatabaseLoginVO init")
    }

    constructor(_host: String, _user: String, _password: String) : this() {
        host = _host
        user = _user;
        password = _password;
    }
}