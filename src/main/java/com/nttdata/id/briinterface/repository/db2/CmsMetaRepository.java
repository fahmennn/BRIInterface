package com.nttdata.id.briinterface.repository.db2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.dtos.ReleaseItemDocumentDTO;
import com.nttdata.id.briinterface.model.db2.CmsMeta;

@Repository
public interface CmsMetaRepository extends JpaRepository<CmsMeta, String> {

    @Query(name = "CmsMeta.findReleaseItemDocumentsByEventAndReference", nativeQuery = true)
    List<ReleaseItemDocumentDTO> findReleaseItemDocumentsByEventAndReference(@Param("event") String event, @Param("reference") String reference);
}
