package com.ssg.hashcode.model.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ssg.hashcode.model.CacheServer;
import com.ssg.hashcode.model.CacheServerConnection;
import com.ssg.hashcode.model.EndPoint;
import com.ssg.hashcode.model.Video;
import com.ssg.hashcode.model.VideoRequest;

public class DataUtils {
	
	private DataUtils(){
		
	}
	
	public static List<Video> getExampleVideos(){
		List<Video> videos = new ArrayList<>();
		videos.add(new Video(0,50));
		videos.add(new Video(1,50));
		videos.add(new Video(2,80));
		videos.add(new Video(0,30));
		videos.add(new Video(0,110));
		
		return videos;
	}
	
	public static List<EndPoint> getExampleEndpoints() {
		List<EndPoint> endpoint = new ArrayList<>();
		
		List<CacheServer> caches = getExampleCacheServers();
		
		// First endpoint
		EndPoint e1 = new EndPoint(0,1000, null);
		Set<CacheServerConnection>  c1 = new HashSet<>();
		c1.add(new CacheServerConnection(e1, caches.get(0), 100));
		c1.add(new CacheServerConnection(e1, caches.get(1), 300));
		c1.add(new CacheServerConnection(e1, caches.get(2), 200));
		e1.setCacheServerConnections(c1);
		
		// Second enpoint
		Set<CacheServerConnection>  c2 = new HashSet<>();
		EndPoint e2 = new EndPoint(1,500, c2);
		
		endpoint.add(e1);
		endpoint.add(e2);
		
		return endpoint;
	}
	
	public static List<CacheServer> getExampleCacheServers() {
		List<CacheServer> caches = new ArrayList<>();
		
		CacheServer c1 = new CacheServer(0,100);
		CacheServer c2 = new CacheServer(1,100);
		CacheServer c3 = new CacheServer(2,100);
		
		caches.add(c1);
		caches.add(c2);
		caches.add(c3);
		
		return caches;
	}
	
	public static List<VideoRequest> getExampleVideoRequests() {
		List<VideoRequest> videoRequests = new ArrayList<>();
		
		List<Video> videos = getExampleVideos();
		List<EndPoint> endpoints = getExampleEndpoints();
		
		
		VideoRequest v1 = new VideoRequest(videos.get(3), endpoints.get(0), 1500);
		VideoRequest v2 = new VideoRequest(videos.get(0), endpoints.get(1), 1000);
		VideoRequest v3 = new VideoRequest(videos.get(4), endpoints.get(0), 500);
		VideoRequest v4 = new VideoRequest(videos.get(2), endpoints.get(0), 1500);
		
		videoRequests.add(v1);
		videoRequests.add(v2);
		videoRequests.add(v3);
		videoRequests.add(v4);
		
		return videoRequests;
	}

}
