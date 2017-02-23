package com.ssg.hashcode.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import com.ssg.hashcode.model.*;

public class Cache {

	public static List<EndPoint> getEndpoints(CacheServer c, Collection<EndPoint> endPoints) {
		List result = new ArrayList<EndPoint>();
		
		for (EndPoint endPoint : endPoints) {
			if( endPoint.getCacheServerConnections().contains(c)) {
				result.add(endPoint);
			}
		}
		
		return result;
	}
	
	public static List<CacheServerConnection> getCacheServerConnections(EndPoint endPoint, List<CacheServerConnection> cacheServerConnections) {
		List<CacheServerConnection> connectionCacheServerConnections = new ArrayList<CacheServerConnection>();
		
		for(CacheServerConnection cacheServerConnection : cacheServerConnections) {
			if (cacheServerConnection.getEndpoint() == endPoint) {
				connectionCacheServerConnections.add(cacheServerConnection);
			}
		}
		
		return connectionCacheServerConnections;
		
	}
	
	public static List<VideoRequest> getVideoRequests(EndPoint endPoint, List<VideoRequest> videoRequests) {
		List<VideoRequest> connectionVideoRequests = new ArrayList<VideoRequest>();
		
		for(VideoRequest videoRequest : videoRequests) {
			if (videoRequest.getEndpoint() == endPoint) {
				connectionVideoRequests.add(videoRequest);
			}
		}
		
		return connectionVideoRequests;
		
	}
}
