package com.ssg.hashcode.model;

public class VideoRequest {
	private Video video;
	private EndPoint endpoint;
	private int nbRequests;
	
	
	
	
	public VideoRequest(Video video, EndPoint endpoint, int nbRequests) {
		this.video = video;
		this.endpoint = endpoint;
		this.nbRequests = nbRequests;
	}
	
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public EndPoint getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(EndPoint endpoint) {
		this.endpoint = endpoint;
	}
	public int getNbRequests() {
		return nbRequests;
	}
	public void setNbRequests(int nbRequests) {
		this.nbRequests = nbRequests;
	}

	@Override
	public String toString() {
		return "VideoRequest [video=" + video.getId() + ", endpoint=" + endpoint.getId() + ", nbRequests=" + nbRequests + "]";
	}
}
