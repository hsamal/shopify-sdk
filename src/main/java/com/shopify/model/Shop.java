package com.shopify.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Shop {

	private String id;
	private String name;
	private String email;

	@XmlAnyElement(lax = true)
	private List<Object> anything;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Object> getAnything() {
		return anything;
	}

	public void setAnything(List<Object> anything) {
		this.anything = anything;
	}
}
