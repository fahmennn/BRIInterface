package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.dtos.BranchInquiryResponseDTO;

@Repository
public class BranchInquiryRepositoryCustomImpl implements BranchInquiryRepositoryCustom{
  @PersistenceContext(unitName = "db2PU") 
  private EntityManager em;

  @SuppressWarnings("unchecked")
  @Override
  public List<BranchInquiryResponseDTO> filterDataBranch(String cabbn, String fullName, String city, Integer page, Integer size, String sortBy, String sortType) {
    StringBuilder sql = new StringBuilder(
      "WITH RowOrdered AS ( " +
          " SELECT \r\n" +
          "   b.CABAD1, b.CABAD2, b.CABAD3, b.CABAD4, b.CABBN, b.CABRN, b.CATLY, b.CATPH, \r\n" +
          "   b.CABRNM, b.CABAD5, b.CASWB, b.CACNAS, b.CASWL, b.CASWBR, b.TIBICN, b.MNT_IN_BO, \r\n" +
          "   b.PARENT_BRN, b.BASECCY, b.LOCALCCY, b.SWIFT_BRN, b.COUNTRY, b.FURTHERID, \r\n" +
          "   b.BRANCHENT, b.TIMEZONE, b.MAINBANK, b.NOTRANS, b.BRCHLEVEL, b.CHILDREN, \r\n" +
          "   b.MAINBRANCH, b.ULTPARENT, b.FULLNAME, b.CITY, b.EMAIL, b.TELEPHONE, \r\n" +
          "   b.FAX, b.TELEX, b.TELEXAB, b.BANKGROUP, b.BUSINESS, b.AUTONOMOUS, \r\n" +
          "   b.RATEFORMAT, b.TOLERANCE, b.PARAMSET, b.SERVICES, b.OPTPARSET, \r\n" +
          "   b.INHERITCDP, b.RF_STATUS, b.BHOPENING, b.BHCLOSING, b.SWIFTGPI,\r\n" +
          "   ROW_NUMBER() OVER (ORDER BY b." + sortBy + " " + sortType + ") AS RowNum " +
          " FROM CAPF b " + 
          " WHERE 1=1 "
    );

    // Kondisi untuk filter
    if (cabbn != null && !cabbn.isEmpty()) {
      sql.append(" AND b.CABBN = :cabbn ");
    }
    if (city != null && !city.isEmpty()) {
      sql.append(" AND b.CITY = :city ");
    }
    if (fullName != null && !fullName.isEmpty()) {
      sql.append(" AND b.FULLNAME = :fullName ");
    }

    sql.append(") SELECT * FROM RowOrdered WHERE RowNum BETWEEN (:page - 1) * :size + 1 AND :page * :size");

    Query query = em.createNativeQuery(sql.toString(), "BranchInquiryMapping");
    if (cabbn != null && !cabbn.isEmpty()) query.setParameter("cabbn", cabbn);
    if (city != null && !city.isEmpty()) query.setParameter("city", city);
    if (fullName != null && !fullName.isEmpty()) query.setParameter("fullName", fullName);
    query.setParameter("page", page);
    query.setParameter("size", size);

    return query.getResultList();
  }
}
