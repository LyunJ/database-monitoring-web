package com.example.databasemonitoringweb.service

import com.example.databasemonitoringweb.repository.PerformanceRepository
import org.springframework.stereotype.Service

@Service
class PerformanceService(private val performanceRepository: PerformanceRepository) {

    public fun getData(id: Int): String{
        return performanceRepository.selectData(id)
    }
}