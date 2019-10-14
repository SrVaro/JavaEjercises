package com.varo.spring.model;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "OWNERS")
public class Owner {
	private int id;
	private String name;
	
	private Set<Kitty> kittys;

	@Id
	@GeneratedValue
	@Column(name = "OWNER_ID")
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

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "owner")
	public Set<Kitty> getKittys() {
		return kittys;
	}

	public void setKittys(Set<Kitty> kittys) {
		this.kittys = kittys;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + "]";
	}
	
	

}
