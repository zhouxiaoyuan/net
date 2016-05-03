package com.ge.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>User: dream0708@163.com
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public class Brand implements Serializable {
	
	  private Long id;
	  private String name;
	  private String storypic;
	  private String link;
	  private String logo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStorypic() {
		return storypic;
	}
	public void setStorypic(String storypic) {
		this.storypic = storypic;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	  
	  
	  
}
