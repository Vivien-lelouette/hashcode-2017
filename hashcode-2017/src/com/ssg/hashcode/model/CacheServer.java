package com.ssg.hashcode.model;

public class CacheServer {
	private int id;
	
	private int capacity;

	public CacheServer(int id, int capacity) {
		this.id = id;
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
