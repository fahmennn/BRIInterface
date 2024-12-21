package com.nttdata.id.briinterface.repository.db2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.model.db2.Master;

@Repository
public interface MasterRepository extends JpaRepository<Master, Long>, MasterRepositoryCustom {
}
