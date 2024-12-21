package com.nttdata.id.briinterface.repository.mysql;

import com.nttdata.id.briinterface.model.mysql.MySQLModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySQLRepository extends JpaRepository<MySQLModel, String> {

}
