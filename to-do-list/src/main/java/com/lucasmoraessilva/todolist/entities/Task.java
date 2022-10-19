package com.lucasmoraessilva.todolist.entities;

import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Boolean done;
	
	public Task() {	
	}

	public Task(Integer id, String name, Boolean done) {
		super();
		this.id = id;
		this.name = name;
		this.done = done;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", done=" + done + "]";
	}
}
