package com.dev.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class PenBox {
	
	@Id
	@Column
	private String boxid;
	@Column
	private String boxName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="boxid",nullable=false)
	List<PenBox> li = new ArrayList<PenBox>();
	public String getPrice() {
		return boxid;
	}
	public void setPrice(String price) {
		this.boxid = price;
	}
	public String getBoxName() {
		return boxName;
	}
	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}

	

}
