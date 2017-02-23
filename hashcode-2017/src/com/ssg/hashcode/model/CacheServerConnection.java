package com.ssg.hashcode.model;

public class CacheServerConnection {
	private EndPoint endpoint;
	private CacheServer cache;
	private int latency;
	
	public int getLatency() {
		return latency;
	}
	public void setLatency(int latency) {
		this.latency = latency;
	}
	
	public CacheServerConnection(EndPoint endpoint, CacheServer cache, int latency) {
		this.endpoint = endpoint;
		this.cache = cache;
		this.latency = latency;
	}
	
	public CacheServerConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public EndPoint getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(EndPoint endpoint) {
		this.endpoint = endpoint;
	}
	public CacheServer getCache() {
		return cache;
	}
	public void setCache(CacheServer cache) {
		this.cache = cache;
	}
	@Override
	public String toString() {
		return "CacheServerConnection [cache=" + cache.getId() + ", latency=" + latency + "]";
	}
}
