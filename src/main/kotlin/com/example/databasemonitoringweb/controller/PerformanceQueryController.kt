package com.example.databasemonitoringweb.controller

import com.example.databasemonitoringweb.service.PerformanceService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PerformanceQueryController(private val performanceService: PerformanceService) {
    @GetMapping("/api/data/{id}")
    public fun getData(@PathVariable id: Int): ResponseEntity<String>{
        return ResponseEntity<String>(performanceService.getData(id), HttpStatus.OK)
    }
}