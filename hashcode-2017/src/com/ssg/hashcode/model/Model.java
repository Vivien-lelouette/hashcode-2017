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
		int numberOfVideos;
		int numberOfEndpoints;
		int numberOfRequestsDesc;
		int numberOfCacheServers;
		int cacheCapacity;
		
		//IN PROGRESS String premiereLigne = 
	}
	
}
