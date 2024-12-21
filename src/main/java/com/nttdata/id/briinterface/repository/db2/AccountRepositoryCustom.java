package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import com.nttdata.id.briinterface.dtos.AccountResultResponseDTO;
import com.nttdata.id.briinterface.dtos.AccountSearchRequestDTO;

public interface AccountRepositoryCustom {
  List<AccountResultResponseDTO> getAccountResponse(
    AccountSearchRequestDTO request
  );
}
