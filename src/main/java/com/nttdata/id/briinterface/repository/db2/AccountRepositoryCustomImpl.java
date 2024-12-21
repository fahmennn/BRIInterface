package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.dtos.AccountResultResponseDTO;
import com.nttdata.id.briinterface.dtos.AccountSearchRequestDTO;

@Repository
public class AccountRepositoryCustomImpl implements AccountRepositoryCustom {
  @PersistenceContext(unitName = "db2PU")
  private EntityManager em;

  @SuppressWarnings("unchecked")
  @Override
  public List<AccountResultResponseDTO> getAccountResponse(AccountSearchRequestDTO request) {
    StringBuilder sql = new StringBuilder(
      "WITH JoinedData AS (\r\n" + //
      "    SELECT DISTINCT\r\n" + //
      "        c.FULLNAME AS Branch, c.CABBN AS BranchNumber, g.GFCUN AS Customer,\r\n" + //
      "        g.GFCPNC AS CustomerNumber, a.CATEGORY AS CategoryCode, a.ACC_TYPE AS AccountType,\r\n" + //
      "        a.CURRENCY AS Currency, a.OTHER_CCY AS OtherCurrency, a.BO_ACCTNO AS BackOfficeAccount,\r\n" + //
      "        a.SHORTNAME AS ShortName, a.EXT_ACCTNO AS ExternalAccount, a.IBAN AS IBAN\r\n" + //
      "    FROM \r\n" + //
      "        ACCOUNT a \r\n" + //
      "    LEFT JOIN GFPF g ON g.GFCPNC = a.CUS_MNM \r\n" + //
      "    LEFT JOIN CAPF c ON c.CABBN = a.BRCH_MNM \r\n" + //
      " WHERE 1=1 "
    );

    // Kondisi untuk filter
    if  (request.getBranch() != null && !request.getBranch().isEmpty()) {
      sql.append(" AND c.FULLNAME = :branch ");
    }
    if  (request.getBranchNumber() != null && !request.getBranchNumber().isEmpty()) {
      sql.append(" AND c.CABBN = :branchNumber ");
    }
    if  (request.getCustomer() != null && !request.getCustomer().isEmpty()) {
      sql.append(" AND g.GFCUN = :customer ");
    }
    if  (request.getCustomerNumber() != null && !request.getCustomerNumber().isEmpty()) {
      sql.append(" AND g.GFCPNC = :customerNumber ");
    }
    if  (request.getCategoryCode() != null && !request.getCategoryCode().isEmpty()) {
      sql.append(" AND a.CATEGORY = :categoryCode ");
    }
    if  (request.getAccountType() != null && !request.getAccountType().isEmpty()) {
      sql.append(" AND a.ACC_TYPE = :accountType ");
    }
    if  (request.getCurrency() != null && !request.getCurrency().isEmpty()) {
      sql.append(" AND a.CURRENCY = :currency ");
    }
    if  (request.getOtherCurrency() != null && !request.getOtherCurrency().isEmpty()) {
      sql.append(" AND a.OTHER_CCY = :otherCurrency ");
    }
    if  (request.getShortName() != null && !request.getShortName().isEmpty()) {
      sql.append(" AND a.SHORTNAME = :shortName ");
    }
    if  (request.getBackOfficeAccount() != null && !request.getBackOfficeAccount().isEmpty()) {
      sql.append(" AND a.BO_ACCTNO = :backOfficeAccount ");
    }
    if  (request.getExternalAccount() != null && !request.getExternalAccount().isEmpty()) {
      sql.append(" AND a.EXT_ACCTNO = :externalAccount ");
    }
    if  (request.getIban() != null && !request.getIban().isEmpty()) {
      sql.append(" AND a.IBAN = :iban ");
    }

    sql.append("), PaginatedResult AS (\r\n" + //
            "    SELECT \r\n" + //
            "        Branch, BranchNumber, Customer, CustomerNumber, CategoryCode, \r\n" + //
            "        AccountType, Currency, OtherCurrency, BackOfficeAccount, \r\n" + //
            "        ShortName, ExternalAccount, IBAN, \r\n" + //
            "        ROW_NUMBER() OVER (ORDER BY " + request.getPagination().getSortBy() + " " + request.getPagination().getSortType() + ") AS RowNum \r\n" + //
            "    FROM \r\n" + //
            "        JoinedData\r\n" + //
            ") \r\n" + //
            "SELECT * \r\n" + //
            "FROM PaginatedResult \r\n" + //
            "WHERE RowNum BETWEEN ((:page - 1) * :size + 1) AND (:page * :size)");

    Query query = em.createNativeQuery(sql.toString(), "AccountSearchResultMapping");
    if (request.getBranch() != null && !request.getBranch().isEmpty()) query.setParameter("branch", request.getBranch());
    if (request.getBranchNumber() != null && !request.getBranchNumber().isEmpty()) query.setParameter("branchNumber", request.getBranchNumber());
    if (request.getCustomer() != null && !request.getCustomer().isEmpty()) query.setParameter("customer", request.getCustomer());
    if (request.getCustomerNumber() != null && !request.getCustomerNumber().isEmpty()) query.setParameter("customerNumber", request.getCustomerNumber());
    if (request.getCategoryCode() != null && !request.getCategoryCode().isEmpty()) query.setParameter("categoryCode", request.getCategoryCode());
    if (request.getAccountType() != null && !request.getAccountType().isEmpty()) query.setParameter("accountType", request.getAccountType());
    if (request.getCurrency() != null && !request.getCurrency().isEmpty()) query.setParameter("currency", request.getCurrency());
    if (request.getOtherCurrency() != null && !request.getOtherCurrency().isEmpty()) query.setParameter("otherCurrency", request.getOtherCurrency());
    if (request.getShortName() != null && !request.getShortName().isEmpty()) query.setParameter("shortName", request.getShortName());
    if (request.getBackOfficeAccount() != null && !request.getBackOfficeAccount().isEmpty()) query.setParameter("backOfficeAccount", request.getBackOfficeAccount());
    if (request.getExternalAccount() != null && !request.getExternalAccount().isEmpty()) query.setParameter("externalAccount", request.getExternalAccount());
    if (request.getIban() != null && !request.getIban().isEmpty()) query.setParameter("iban", request.getIban());

    query.setParameter("page", request.getPagination().getPage());
    query.setParameter("size", request.getPagination().getSize());

    return query.getResultList();
  }
  
}
