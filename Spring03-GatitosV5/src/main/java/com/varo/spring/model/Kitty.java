package com.varo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "KITTYS")
public class Kitty {
	private int id;
	private String name;
	private String url;
	private Owner owner;

	@Id
	@GeneratedValue
	@Column(name = "KITTY_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Kitty [id=" + id + ", name=" + name + ", url=" + url + "]";
	}

}
