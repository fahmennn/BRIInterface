package com.nttdata.id.briinterface.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.model.mysql.ApiLog;

@Repository
public interface ApiLogRepository extends JpaRepository<ApiLog, Integer> {
}