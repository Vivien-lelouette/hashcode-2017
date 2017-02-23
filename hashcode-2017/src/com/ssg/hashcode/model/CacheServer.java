package com.ssg.hashcode.model;

import java.util.ArrayList;
import java.util.List;

public class CacheServer {
	private int id;
	private int capacity;
	private List<Video> videos = new ArrayList<>();

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

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	@Override
	public String toString() {
		return "CacheServer [id=" + id + ", capacity=" + capacity + ", videos=" + videos + "]";
	}
	
	
}
