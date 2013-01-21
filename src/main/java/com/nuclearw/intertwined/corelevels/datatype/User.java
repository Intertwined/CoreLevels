package com.nuclearw.intertwined.corelevels.datatype;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.avaje.ebean.validation.NotEmpty;

@Entity
@Table(name="cl_user")
public class User {
	@Id
	@Column(name="id")
	private int id;

	@NotEmpty
	@Column(name="name")
	private String name;

	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	@Column(name="levels")
	private List<Level> levels = new ArrayList<Level>();

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

	public List<Level> getLevels() {
		return levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
	}
}
