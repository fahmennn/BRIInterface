package com.nttdata.id.briinterface.model.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "master_system_parameter")
public class MySQLModel {
	
	@Id
	@Column(name = "SystemParameterId", length = 200)
    private String systemParameterId;
	
	@Lob
    @Column(name = "Data", columnDefinition = "mediumtext CHARACTER SET latin1 COLLATE latin1_swedish_ci")
    private String data;

	public String getSystemParameterId() {
        return systemParameterId;
    }

    public void setSystemParameterId(String systemParameterId) {
        this.systemParameterId = systemParameterId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
