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
	public EndPoint(int id, int latencyWithDataCenter, Set<CacheServerConnection> cacheServerConnections) {
		this.id = id;
		this.latencyWithDataCenter = latencyWithDataCenter;
		this.cacheServerConnections = cacheServerConnections;
	}
	
	public EndPoint() {
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
	public CacheServerConnection getCacheServerConnection(CacheServer cache) {
		for(CacheServerConnection cacheServerConnection : cacheServerConnections) {
			if(cacheServerConnection.getCache().getId() == cache.getId()) {
				return cacheServerConnection;
			}
		}
		return null;
	}
	public void setCacheServerConnections(Set<CacheServerConnection> cacheServerConnections) {
		this.cacheServerConnections = cacheServerConnections;
	}
	@Override
	public String toString() {
		return "EndPoint [id=" + id + ", latencyWithDataCenter=" + latencyWithDataCenter + ", cacheServerConnections="
				+ cacheServerConnections + "]";
	}	
}
