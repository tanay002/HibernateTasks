package com.onetoone.mappingAnno6;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="onetoneCompanyAnno")
public class CompanyAnno 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   @PrimaryKeyJoinColumn
private int cId;
private String cname;
private String cfounder;

@OneToOne(targetEntity = AddressAnno.class,cascade = CascadeType.ALL)
private AddressAnno add;

public int getcId() {
	return cId;
}

public void setcId(int cId) {
	this.cId = cId;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCfounder() {
	return cfounder;
}

public void setCfounder(String cfounder) {
	this.cfounder = cfounder;
}

public AddressAnno getAdd() {
	return add;
}

public void setAdd(AddressAnno add) {
	this.add = add;
}


}
