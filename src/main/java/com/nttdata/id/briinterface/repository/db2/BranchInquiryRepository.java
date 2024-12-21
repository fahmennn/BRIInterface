package com.nttdata.id.briinterface.repository.db2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.String;
import com.nttdata.id.briinterface.model.db2.BranchInquiry;

@Repository
public interface BranchInquiryRepository extends JpaRepository<BranchInquiry, String>, BranchInquiryRepositoryCustom{
}
