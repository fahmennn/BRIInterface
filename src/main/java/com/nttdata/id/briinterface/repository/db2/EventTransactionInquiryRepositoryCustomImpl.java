package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.dtos.EventTransactionInquiryDTO;

@Repository
public class EventTransactionInquiryRepositoryCustomImpl implements EventTransactionInquiryRepositoryCustom {
	
	@PersistenceContext(unitName = "db2PU") 
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EventTransactionInquiryDTO> filterEventTransaction(String masterRef, String refNoPfix, String refNoSerl, String timeStart, 
				String status, String timeFinish, String theirRef, Double amount, String ccy, String statusEV, String crossRef, String startDate, String finished,
				Integer page, Integer size, String sortBy, String sortType) {
			
			String rangeFilterDate = "";

			// Condition for startDate is Empty
			if ((startDate == null || startDate.isEmpty()) && (finished != null && !finished.isEmpty())) {
				rangeFilterDate = " AND b.FINISHED <= ':finished'";
			}

			// Condition for finished is Empty
			if ((finished == null || finished.isEmpty()) && (startDate != null && !startDate.isEmpty())) {
				rangeFilterDate = " AND b.START_DATE <= ':startDate'";
			}

			// Condition for startDate and finished is Empty
			if ((startDate == null || startDate.isEmpty()) && (finished == null || finished.isEmpty())) {
				rangeFilterDate = "";
			}

			// Condition for startDate and finished is not Empty
			if ((startDate != null && !startDate.isEmpty()) && (finished != null && !finished.isEmpty())) {
				// Check if startDate and finished is same
				if (startDate.equals(finished)) {
					rangeFilterDate = " AND b.START_DATE = ':startDate' AND b.FINISHED = ':finished'";
				}
				// Check if startDate more than finished
				if (startDate.compareTo(finished) > 0) {
					throw new IllegalArgumentException("Start Date must be less than or equal to Finished Date");
				} else {
					rangeFilterDate = " AND b.START_DATE >= ':startDate' AND b.FINISHED <= ':finished'";
				}
			}
			
	    StringBuilder sql = new StringBuilder(
	      "WITH RowOrdered AS ( " +
	          " SELECT \r\n" +
	          "   b.KEY97 AS KEY97, b.REFNO_PFIX AS REFNO_PFIX, b.REFNO_SERL AS REFNO_SERL, m.MASTER_REF AS MASTER_REF, b.START_DATE AS START_DATE, b.START_TIME AS START_TIME, b.TIMESTART AS TIMESTART, b.STATUS AS STATUS, b.TOUCHED AS TOUCHED, b.FINISHED AS FINISHED, b.FINISHTIME AS FINISHTIME, \r\n" +
	          "   b.TIMEFINISH AS TIMEFINISH, b.EXEMPLAR AS EXEMPLAR, b.THEIR_REF AS THEIR_REF, b.AMOUNT AS AMOUNT, b.CCY AS CCY, b.TFR_METHOD AS TFR_METHOD, b.STATUS_EV AS STATUS_EV, b.CROSS_REF AS CROSS_REF, b.USER_INP AS USER_INP, b.USER_REV AS USER_REV, b.USER_AUT AS USER_AUT, \r\n" +
	          "   b.CREATNMTHD AS CREATNMTHD, b.SLADATA AS SLADATA, b.LAST_STEP AS LAST_STEP, b.PSBBCODE AS PSBBCODE, b.PRIMNM AS PRIMNM, b.EBANKEVREF AS EBANKEVREF, b.ANCIL_MST AS ANCIL_MST, b.VERLEVEL AS VERLEVEL, b.OFAC AS OFAC, b.EV_INDEX AS EV_INDEX, b.REPAIR AS REPAIR, b.POST_WGRP AS POST_WGRP, \r\n" +
	          "   b.EXTFIELD AS EXTFIELD, b.BPHASEK AS BPHASEK, b.FXRATESET AS FXRATESET, b.FIX2DAY AS FIX2DAY, b.NEEDCHECK AS NEEDCHECK, b.NO_BROWSE AS NO_BROWSE, b.SWONCEREL AS SWONCEREL, b.PRIADLINE AS PRIADLINE, b.ENRRESSTAT AS ENRRESSTAT, b.ATTACHD_EV AS ATTACHD_EV, b.ORIGNAME AS ORIGNAME, \r\n" +
	          "   b.ORIGTEAM AS ORIGTEAM, b.ORIGISUSER AS ORIGISUSER, b.ORIGBRANCH AS ORIGBRANCH, b.ORIGUSER AS ORIGUSER, b.ORIGREF AS ORIGREF, b.NPSBBCODE AS NPSBBCODE, b.NPRIMNM AS NPRIMNM, b.VIOLATION AS VIOLATION, b.ORCH_DEFN AS ORCH_DEFN, b.ORCH_STEP AS ORCH_STEP, b.NPRIADLINE AS NPRIADLINE, \r\n" +
	          "   b.STEPPHASE AS STEPPHASE, b.EXTRAINFO AS EXTRAINFO, b.FURTHERID AS FURTHERID, b.TYPEFLAG AS TYPEFLAG, b.TSTAMP AS TSTAMP, b.EVTREFUSED AS EVTREFUSED, b.ISPROVISEV AS ISPROVISEV, b.AUTONEXTEV AS AUTONEXTEV, b.PROVCONTBY AS PROVCONTBY, b.DOCSPREP AS DOCSPREP, b.DOCSPREPRQ AS DOCSPREPRQ, \r\n" +
	          "   b.PCP_SW_BIC AS PCP_SW_BIC, b.NPC_SW_BIC AS NPC_SW_BIC, b.EVTREFSTOR AS EVTREFSTOR, b.SWIFTVERSN AS SWIFTVERSN, b.CORPACCESS AS CORPACCESS, \r\n" +
	          "   ROW_NUMBER() OVER (ORDER BY b.:sortBy :sortType) AS RowNum " +
	          " FROM BASEEVENT b " + 
	          " INNER JOIN MASTER m ON b.MASTER_KEY = m.KEY97  " + 
	          " WHERE 1=1 " + rangeFilterDate
	    );
	    
	 // Kondisi untuk filter
	    if (masterRef != null && !masterRef.isEmpty()) {
	      sql.append(" AND m.MASTER_REF = :masterRef ");
	    }
	    if (refNoPfix != null && !refNoPfix.isEmpty()) {
	      sql.append(" AND b.REFNO_PFIX = :refNoPfix ");
	    }
	    if (refNoSerl != null && !refNoSerl.isEmpty()) {
	      sql.append(" AND b.REFNO_SERL = :refNoSerl ");
	    }
	    if (timeStart != null && !timeStart.isEmpty()) {
		  sql.append(" AND b.TIMESTART = :timeStart ");
		}
	    if (status != null && !status.isEmpty()) {
		  sql.append(" AND b.STATUS = :status ");
		}
	    if (timeFinish != null && !timeFinish.isEmpty()) {
		  sql.append(" AND b.TIMEFINISH = :timeFinish ");
		}
	    if (theirRef != null && !theirRef.isEmpty()) {
		  sql.append(" AND b.THEIR_REF = :theirRef ");
		}
	    if (amount != null) {
		  sql.append(" AND b.AMOUNT = :amount ");
		}
	    if (ccy != null && !ccy.isEmpty()) {
		  sql.append(" AND b.CCY = :ccy ");
		}
	    if (statusEV != null && !statusEV.isEmpty()) {
		  sql.append(" AND b.STATUS_EV = :statusEV ");
		}
	    if (crossRef != null && !crossRef.isEmpty()) {
		  sql.append(" AND b.CROSS_REF = :crossRef ");
		}
	    
	    

	    sql.append(") SELECT * FROM RowOrdered WHERE RowNum BETWEEN (:page - 1) * :size + 1 AND :page * :size");

	    Query query = em.createNativeQuery(sql.toString(), "EventTransactionMapping");
	    if (masterRef != null && !masterRef.isEmpty()) query.setParameter("masterRef", masterRef);
	    if (refNoPfix != null && !refNoPfix.isEmpty()) query.setParameter("refNoPfix", refNoPfix);
	    if (refNoSerl != null && !refNoSerl.isEmpty()) query.setParameter("refNoSerl", refNoSerl);
	    if (timeStart != null && !timeStart.isEmpty()) query.setParameter("timeStart", timeStart);
	    if (status != null && !status.isEmpty()) query.setParameter("status", status);
	    if (timeFinish != null && !timeFinish.isEmpty()) query.setParameter("timeFinish", timeFinish);
	    if (theirRef != null && !theirRef.isEmpty()) query.setParameter("theirRef", theirRef);
	    if (amount != null) query.setParameter("amount", amount);
	    if (ccy != null && !ccy.isEmpty()) query.setParameter("ccy", ccy);
	    if (statusEV != null && !statusEV.isEmpty()) query.setParameter("statusEV", statusEV);
	    if (crossRef != null && !crossRef.isEmpty()) query.setParameter("crossRef", crossRef);
	    if (crossRef != null && !crossRef.isEmpty()) query.setParameter("startDate", startDate);
	    if (crossRef != null && !crossRef.isEmpty()) query.setParameter("finished", finished);
	    query.setParameter("page", page);
	    query.setParameter("size", size);
	    query.setParameter("sortBy", sortBy);
	    query.setParameter("sortType", sortType);

	    return query.getResultList();
	}

}
