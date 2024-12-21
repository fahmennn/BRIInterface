package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.dtos.CustomerSearchRequestDTO;
import com.nttdata.id.briinterface.dtos.CustomerSearchResponseDTO;

@Repository
public class CustomerRepositoryCustomImpl implements CustomerRepositoryCustom{
  @PersistenceContext(unitName = "db2PU") 
  private EntityManager em;

  @SuppressWarnings("unchecked")
  @Override
  public List<CustomerSearchResponseDTO> customerSearchInquiry(CustomerSearchRequestDTO request) {

    // Check if sortBy is empty, set default value
    if (request.getPagination().getSortBy() == null) {
      request.getPagination().setSortBy("GFCUN");
    }

    // Check if sortType is empty, set default value
    if (request.getPagination().getSortType() == null) {
      request.getPagination().setSortType("ASC");
    }

    String sortBy = request.getPagination().getSortBy();
    switch (sortBy.toUpperCase()) {
      case "FULLNAME":
          sortBy = "g.GFCUN";
          break;
      case "CUSTOMERNUMBER":
          sortBy = "g.GFCPNC";
          break;
      case "COUNTRYOFRESIDENCE":
          sortBy = "g.GFCNAL";
          break;
      case "ACCOUNTOFFICER":
          sortBy = "g.GFACO";
          break;
      case "BLOCKED":
          sortBy = "g.GFCUB";
          break;
      case "CUSTOMERGROUP":
          sortBy = "g.GFGRP";
          break;
      case "LOCATION":
          sortBy = "g.GFCLC";
          break;
      default:
          sortBy = "g.GFCUN";
          break;
    }
  

    StringBuilder sql = new StringBuilder(
      "WITH NumberedRows AS (\r\n" + //
        "  SELECT \r\n" + //
        "      CASE \r\n" + //
        "          WHEN g.GFCUN = 'SUNDRYTI' THEN 'SUNDRYTI'\r\n" + //
        "          WHEN g.GFCUN != 'SUNDRYTI' THEN g.GFCPNC \r\n" + //
        "      END AS CustomerMnemonic,\r\n" + //
        "      g.GFCUN AS FullName,\r\n" + //
        "      g.GFCPNC AS CustomerNumber,\r\n" + //
        "      g.GFCNAL AS CountryOfResidence,\r\n" + //
        "      g.GFACO AS AccountOfficer,\r\n" + //
        "      g.GFCUB AS Blocked,\r\n" + //
        "      g.GFGRP AS CustomerGroup,\r\n" + //
        "      g.GFCLC AS Location, \r\n" + //
        "      ROW_NUMBER() OVER (ORDER BY " + sortBy + " " + request.getPagination().getSortType() + ") AS RowNum\r\n" + //
        "  FROM GFPF g \r\n" + //
        "  WHERE 1=1 "
    );

    // Kondisi untuk filter
    if (request.getCustomerNumber() != null && !request.getCustomerNumber().isEmpty()) {
      sql.append(" AND g.GFCPNC = :customerNumber ");
    }
    if (request.getCustomerMnemonic() != null && !request.getCustomerMnemonic().isEmpty()) {
      sql.append(" AND g.GFCUN = :customerMnemonic ");
    }
    if (request.getFullName() != null && !request.getFullName().isEmpty()) {
      sql.append(" AND g.GFCUN = :fullName ");
    }
    if (request.getCountryOfResidence() != null && !request.getCountryOfResidence().isEmpty()) {
      sql.append(" AND g.GFCNAL = :countryOfResidence ");
    }
    if (request.getAccountOfficer() != null && !request.getAccountOfficer().isEmpty()) {
      sql.append(" AND g.GFACO = :accountOfficer ");
    }
    if (request.getBlocked() != null && !request.getBlocked().isEmpty()) {
      sql.append(" AND g.GFCUB = :blocked ");
    }
    if (request.getCustomerGroup() != null && !request.getCustomerGroup().isEmpty()) {
      sql.append(" AND g.GFGRP = :customerGroup ");
    }
    if (request.getLocation() != null && !request.getLocation().isEmpty()) {
      sql.append(" AND g.GFCLC = :location ");
    }

    sql.append(") SELECT \r\n" +
      " CustomerMnemonic, FullName, CustomerNumber,\r\n" +
      " CountryOfResidence, AccountOfficer, Blocked,\r\n" +
      " CustomerGroup, Location \r\n" +
      "FROM NumberedRows \r\n" +
      "WHERE RowNum BETWEEN (:page - 1) * :size + 1 AND :page * :size");

    Query query = em.createNativeQuery(sql.toString(), "CustomerSearchMapping");
    if (request.getCustomerNumber() != null && !request.getCustomerNumber().isEmpty()) query.setParameter("customerNumber", request.getCustomerNumber());
    if (request.getCustomerMnemonic() != null && !request.getCustomerMnemonic().isEmpty()) query.setParameter("customerMnemonic", request.getCustomerMnemonic());
    if (request.getFullName() != null && !request.getFullName().isEmpty()) query.setParameter("fullName", request.getFullName());
    if (request.getCountryOfResidence() != null && !request.getCountryOfResidence().isEmpty()) query.setParameter("countryOfResidence", request.getCountryOfResidence());
    if (request.getAccountOfficer() != null && !request.getAccountOfficer().isEmpty()) query.setParameter("accountOfficer", request.getAccountOfficer());
    if (request.getBlocked() != null && !request.getBlocked().isEmpty()) query.setParameter("blocked", request.getBlocked());
    if (request.getCustomerGroup() != null && !request.getCustomerGroup().isEmpty()) query.setParameter("customerGroup", request.getCustomerGroup());
    if (request.getLocation() != null && !request.getLocation().isEmpty()) query.setParameter("location", request.getLocation());

    query.setParameter("page", request.getPagination().getPage());
    query.setParameter("size", request.getPagination().getSize());

    return query.getResultList();
  }
}
