package com.example.databasemonitoringweb.repository

import org.apache.ibatis.session.SqlSession
import org.springframework.stereotype.Repository

@Repository
class PerformanceRepository(private val sqlSession: SqlSession) {

    public fun selectData(id: Int): String {
        return sqlSession.selectOne("mapper.data.selectData",id)
    }
}