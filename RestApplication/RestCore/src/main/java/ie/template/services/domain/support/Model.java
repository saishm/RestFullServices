package ie.template.services.domain.support;

import java.io.Serializable;
import java.sql.Timestamp;

public class Model implements Serializable {

	private static final long serialVersionUID = 3448494344527364025L;
	
	private String createdBy;
	private Timestamp createdAt;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

}
