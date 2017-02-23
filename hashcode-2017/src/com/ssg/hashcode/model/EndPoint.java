package com.ssg.hashcode.model;

import java.util.HashSet;
import java.util.Set;

public class EndPoint {
	private int id;
	private int latencyWithDataCenter;
	private Set<CacheServerConnection> cacheServerConnections = new HashSet<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getLatencyWithDataCenter() {
		return latencyWithDataCenter;
	}
	public void setLatencyWithDataCenter(int latencyWithDataCenter) {
		this.latencyWithDataCenter = latencyWithDataCenter;
	}
	public Set<CacheServerConnection> getCacheServerConnections() {
		return cacheServerConnections;
	}
	public void setCacheServerConnections(Set<CacheServerConnection> cacheServerConnections) {
		this.cacheServerConnections = cacheServerConnections;
	}	
}