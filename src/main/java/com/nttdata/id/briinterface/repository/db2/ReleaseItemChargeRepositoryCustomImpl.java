package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.dtos.ReleaseItemChargeDTO;


@Repository
public class ReleaseItemChargeRepositoryCustomImpl implements ReleaseItemChargeRepositoryCustom {
	
	@PersistenceContext(unitName = "db2PU") 
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ReleaseItemChargeDTO> findReleaseItemCharge(String reference, String event,
				Integer page, Integer size, String sortBy, String sortType) {
	    StringBuilder sql = new StringBuilder(
	      "WITH RowOrdered AS ( " +
	          " SELECT \r\n" +
	          "   m.MASTER_REF AS MASTER_REF, CONCAT(b2.REFNO_PFIX, LPAD(b2.REFNO_SERL, 3, '0')) AS EVENT, e.LINKED_CHG AS LINKED_CHG, e.AMD_CHG AS AMD_CHG, e.APP_TEXT AS APP_TEXT, e.OLD_ACTION AS OLD_ACTION, e.HASNEWTCS AS HASNEWTCS, e.APPCH_SCH AS APPCH_SCH, e.CALCTODATE AS CALCTODATE, e.TAPPCH_SCH AS TAPPCH_SCH, \r\n" +
	          "   e.APP_ORAMT AS APP_ORAMT, e.APP_ORCCY AS APP_ORCCY, e.APP_SCAMT AS APP_SCAMT, e.APP_SCCCY AS APP_SCCCY, e.APP_LOCK AS APP_LOCK, e.APP_WAIVE AS APP_WAIVE, e.CALCTEXT AS CALCTEXT, e.CHGFOR_LCK AS CHGFOR_LCK, e.CHG_PTY AS CHG_PTY, e.CHG_SCH AS CHG_SCH, e.TCHG_SCH AS TCHG_SCH, e.CCY_LCK AS CCY_LCK, \r\n" +
	          "   e.DEFER_LCK AS DEFER_LCK, e.RATECODE_C AS RATECODE_C, e.FXRTEFLG_C AS FXRTEFLG_C, e.ORIG_AMT AS ORIG_AMT, e.ORIG_CCY AS ORIG_CCY, e.PERIOD AS PERIOD, e.CODE_LCK AS CODE_LCK, e.SPLIT_SRC AS SPLIT_SRC, e.CODE_LCK_C AS CODE_LCK_C, e.RATE_LCK AS RATE_LCK, e.RATE_LCK_C AS RATE_LCK_C, e.SCH_AMT AS SCH_AMT, \r\n" +
	          "   e.SCH_CCY AS SCH_CCY, e.SCHAMT_LCK AS SCHAMT_LCK,e.CHG_SPLIT AS CHG_SPLIT, e.CONS_CHG AS CONS_CHG, e.CHG_ON_AMT AS CHG_ON_AMT, e.CHGBAS_AMT AS CHGBAS_AMT, e.CHGBAS_CCY AS CHGBAS_CCY, e.CHG_OS_AMT AS CHG_OS_AMT, e.CHG_OS_CCY AS CHG_OS_CCY, e.TOTL_CHGS AS TOTL_CHGS, e.CHGRECPTY AS CHGRECPTY, e.CHGTODATE AS CHGTODATE, \r\n" +
	          "   e.CHGFRDATE AS CHGFRDATE, e.RATECODE_T AS RATECODE_T, e.CODE_LCK_T AS CODE_LCK_T, e.RATE_LCK_T AS RATE_LCK_T, e.CHG_SHARE AS CHG_SHARE, e.SHARE_INC AS SHARE_INC, e.TAXAMT_LCK AS TAXAMT_LCK, e.PARTIC_CHG AS PARTIC_CHG, e.OWNSCHED AS OWNSCHED, e.EV_CHGPART AS EV_CHGPART, e.OLD_STATUS AS OLD_STATUS, e.CANAMDBAS AS CANAMDBAS, \r\n" +
	          "   e.AMDBAS_AMT AS AMDBAS_AMT, e.AMDBAS_CCY AS AMDBAS_CCY, e.AMENDBASIS AS AMENDBASIS, e.CHGSTRDAT AS CHGSTRDAT, e.CHGENDDAT AS CHGENDDAT, e.TIER1_DTLS AS TIER1_DTLS, e.TIER2_DTLS AS TIER2_DTLS, e.TIER3_DTLS AS TIER3_DTLS, e.TIER4_DTLS AS TIER4_DTLS, e.MINAPP_AMT AS MINAPP_AMT, e.MINAPP_CCY AS MINAPP_CCY, e.MAXAPP_AMT AS MAXAPP_AMT, \r\n" +
	          "   e.MAXAPP_CCY AS MAXAPP_CCY, e.PPAY_KEY AS PPAY_KEY, e.CHQ_KEY AS CHQ_KEY, e.EVT_DOC AS EVT_DOC, e.DRAFT_KEY AS DRAFT_KEY, e.KEY97 AS KEY97, e.CHG_ON_CNT AS CHG_ON_CNT, e.CHGCOUNT AS CHGCOUNT, e.ATTACHITEM AS ATTACHITEM, e.BOOK_RATE AS BOOK_RATE, \r\n" +
	          "   ROW_NUMBER() OVER (ORDER BY b." + sortBy + " " + sortType + ") AS RowNum " +
	          " FROM EVENTCHG e " + 
	          " INNER JOIN BASECHARGE b ON e.KEY97 = b.KEY97 " +
	    	  " INNER JOIN BASEEVENT b2 ON b.EVENT_KEY = b2.KEY97 " +
	    	  " INNER JOIN MASTER m ON b2.MASTER_KEY = m.KEY97 " +
	          " WHERE 1=1 "
	    );
	    
	    if (reference != null && !reference.isEmpty()) {
	    	sql.append(" AND m.MASTER_REF = :reference ");
	    }
		if (event != null && !event.isEmpty()) {
			sql.append(" AND CONCAT(b2.REFNO_PFIX, LPAD(b2.REFNO_SERL, 3, '0')) = :event ");
		}
		
		sql.append(") SELECT * FROM RowOrdered WHERE RowNum BETWEEN (:page - 1) * :size + 1 AND :page * :size");

	    Query query = em.createNativeQuery(sql.toString(), "ReleaseItemChargeMapping");
	    if (reference != null && !reference.isEmpty()) query.setParameter("reference", reference);
	    if (event != null && !event.isEmpty()) query.setParameter("event", event);
	    query.setParameter("page", page);
	    query.setParameter("size", size);

	    return query.getResultList();
	}

}
