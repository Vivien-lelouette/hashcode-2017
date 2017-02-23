package com.ssg.hashcode.model;

public class Video {
	private int id;
	private int size;

	public int getSize() {
		return size;
	}

	public Video(int id, int size) {
		super();
		this.id = id;
		this.size = size;
	}

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Video [id=" + id + ", size=" + size + "]";
	}

	
	
}
