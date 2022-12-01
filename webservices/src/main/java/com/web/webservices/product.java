package com.web.webservices;

public class product {

	private long Id;
	private String ProName;
	private String ProDescrip;
	
	
	@Override
	public String toString() {
		return "product [Id=" + Id + ", ProName=" + ProName + ", ProDescrip=" + ProDescrip + "]";
	}


	public product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getProName() {
		return ProName;
	}


	public void setProName(String proName) {
		ProName = proName;
	}


	public String getProDescrip() {
		return ProDescrip;
	}


	public void setProDescrip(String proDescrip) {
		ProDescrip = proDescrip;
	}


	public product(long id, String proName, String proDescrip) {
		super();
		Id = id;
		ProName = proName;
		ProDescrip = proDescrip;
	}
	
	
	
	
}