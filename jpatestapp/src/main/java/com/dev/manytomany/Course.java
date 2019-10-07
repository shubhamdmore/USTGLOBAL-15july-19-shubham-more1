package com.dev.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cource")
public class Course {

	@Id
	@Column
	private int cid;
	@Column
	private String cname;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	
	public void setCname(String cname) {
		this.cname = cname;
	}
}
