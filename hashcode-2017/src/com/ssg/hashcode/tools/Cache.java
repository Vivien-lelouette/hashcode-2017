package com.ssg.hashcode.tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.ssg.hashcode.model.*;

public class Cache {

	public static List<EndPoint> getEndpoints(CacheServer c, HashSet<EndPoint> endPoints) {
		List result = new ArrayList<EndPoint>();
		
		for (EndPoint endPoint : endPoints) {
			if( endPoint.getCacheServerConnections().contains(c)) {
				result.add(endPoint);
			}
		}
		
		return result;
	}
}
