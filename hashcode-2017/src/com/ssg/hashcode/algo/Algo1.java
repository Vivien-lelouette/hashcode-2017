package com.ssg.hashcode.algo;

import java.util.ArrayList;
import java.util.List;

import com.ssg.hashcode.model.*;
import com.ssg.hashcode.tools.*;
import com.sun.javafx.collections.MappingChange.Map;

public class Algo1 extends Algo {

	@Override
	public Output execute(Model model) {
		Output output = new Output();
		for(CacheServer cache : model.getCacheServer().values()) {
			List<EndPoint> endPoints = Cache.getEndpoints(cache, model.getEndpoints().values());
			
			
			for(EndPoint endPoint : endPoints) {
				int value = value(endPoint, endPoint.getCacheServerConnection(cache), new ArrayList<VideoRequest>());
				
			}
			
		}
		
		return output;
	}
	
	private int value(EndPoint endPoint, CacheServerConnection cacheServerConnection, List<VideoRequest> videoRequests) {
		int latencyDatacenter = endPoint.getLatencyWithDataCenter();
		int latencyCacheServer = cacheServerConnection.getLatency();
		List<VideoRequest> filteredVideoRequests = Cache.getVideoRequests(endPoint, videoRequests);
		
		
		return 0;
	}

}
