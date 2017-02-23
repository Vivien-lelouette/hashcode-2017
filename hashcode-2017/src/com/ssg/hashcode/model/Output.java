package com.ssg.hashcode.model;

import java.util.List;
import java.util.Map;

public class Output {
	
	private Map<Integer,List<Video>> videosRepartitions;

	public Map<Integer, List<Video>> getVideosRepatitions() {
		return videosRepartitions;
	}

	public void setVideosRepatitions(Map<Integer, List<Video>> videosRepatitions) {
		this.videosRepartitions = videosRepatitions;
	}

}
