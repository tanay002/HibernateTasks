package com.onetoone.mappingAnno6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="onetoneAddressAnno")
public class AddressAnno 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int addId;
private String city;
private String street;

@OneToOne(targetEntity = CompanyAnno.class)
private CompanyAnno comp;

public int getAddId() {
	return addId;
}

public void setAddId(int addId) {
	this.addId = addId;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public CompanyAnno getComp() {
	return comp;
}

public void setComp(CompanyAnno comp) {
	this.comp = comp;
}


}
