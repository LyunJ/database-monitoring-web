package com.example.databasemonitoringweb.datasource

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import javax.sql.DataSource


@Configuration
class CustomDatasourceConfigure(){

    @Value("\${DSdriver}")
    lateinit var driver:String
    @Value("\${DSurl}")
    lateinit var url:String
    @Value("\${DSusername}")
    lateinit var username:String
    @Value("\${DSpassword}")
    lateinit var password:String

    @Bean
     fun dataSource(): DataSource{

        return DataSourceBuilder.create()
            .driverClassName(driver)
            .url(url)
            .username(username)
            .password(password)
            .build();
    }
}