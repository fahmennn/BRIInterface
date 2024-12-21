package com.nttdata.id.briinterface.repository.db2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.model.db2.ReleaseItemCharge;

@Repository
public interface ReleaseItemChargeRepository extends JpaRepository<ReleaseItemCharge, Long>, ReleaseItemChargeRepositoryCustom {

}
