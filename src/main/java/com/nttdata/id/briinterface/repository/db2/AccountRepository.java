package com.nttdata.id.briinterface.repository.db2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.model.db2.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String>, AccountRepositoryCustom{
}
