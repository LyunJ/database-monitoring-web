package com.example.databasemonitoringweb.controller

import com.example.databasemonitoringweb.model.vo.DatabaseLoginVO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping


@Controller
class WebController() {


    @GetMapping("/")
    fun getHome(model: Model): String{
        model["title"]="Blog"
        model["databaseLoginVO"]=DatabaseLoginVO();
        return "index"
    }

    @PostMapping("/connect")
    fun postConnect(model: Model,databaseLoginVO: DatabaseLoginVO?): String{
        with(databaseLoginVO) {
            println("host : ${this?.host}")
            println("user : ${this?.user}")
            println("password : ${this?.password}")
        }

        return "index"
    }
}