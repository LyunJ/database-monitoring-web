package com.example.databasemonitoringweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DatabaseMonitoringWebApplication

fun main(args: Array<String>) {
    runApplication<DatabaseMonitoringWebApplication>(*args)
}
