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
}
