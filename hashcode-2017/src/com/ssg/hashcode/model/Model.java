package com.ssg.hashcode.model;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class Model {
	private Map<Integer, CacheServer> cacheServer = new HashMap<>();
	private Map<Integer, Video> videos = new HashMap<>();
	private Map<Integer, EndPoint> endpoints = new HashMap<>();
	
	public void buildFromFile(File file) throws Exception{
		BufferedReader in = new BufferedReader(new FileReader(file));
		
		String premiereLigne = in.readLine();
		String[] split = premiereLigne.split(" ");
		
		int numberOfVideos = Integer.parseInt(split[0].trim());
		int numberOfEndpoints = Integer.parseInt(split[1].trim());
		int numberOfRequestsDesc = Integer.parseInt(split[2].trim());
		int numberOfCacheServers = Integer.parseInt(split[3].trim());
		int cacheCapacity = Integer.parseInt(split[4].trim());
		
		String deuxiemeLigne = in.readLine();
		split = deuxiemeLigne.split(" ");
		
		if(split.length != numberOfVideos){
			throw new Exception("De la merde !");
		}
		
		for(int i=0;i<split.length;i++){
			Video video = new Video();
			video.setId(i);
			video.setSize(Integer.parseInt(split[i].trim()));
			videos.put(video.getId(), video);
		}
		
		for(int i=0;i<numberOfEndpoints;i++){
			EndPoint ep = new EndPoint();
			ep.setId(i);
			String ligneEnTeteEndpoint = in.readLine();
			split = ligneEnTeteEndpoint.split(" ");
			ep.setLatencyWithDataCenter(Integer.parseInt(split[0].trim()));
			int nombreCachesConnectes = Integer.parseInt(split[1].trim());
			for(int j=0;j<nombreCachesConnectes;j++){
				String ligneCacheConnecte = in.readLine();
				split = ligneCacheConnecte.split(" ");
				int idCacheServer = Integer.parseInt(split[0].trim());
				CacheServer cs = null;
				if(cacheServer.containsKey(idCacheServer)){
					cs = cacheServer.get(idCacheServer);
				} else {
					cs = new CacheServer(idCacheServer, cacheCapacity);
					cacheServer.put(idCacheServer, cs);
				}
				CacheServerConnection connection = new CacheServerConnection();
				connection.setEndpoint(ep);
				connection.setCache(cs);
				connection.setLatency(Integer.parseInt(split[1].trim()));
			}
		}
		
	}
	
}
