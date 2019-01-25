package com.qaprosoft.social_network.account.albums;

public class VideoAlbum extends Album {
	
	private static final long serialVersionUID = 1L;

	public VideoAlbum() {
		System.out.println("Video album created");
	}

	@Override
	public void addEntry() {
		System.out.println("Video added");
	}

	@Override
	public void deleteEntry() {
		System.out.println("Video deleted");
	}

	@Override
	public void showEntry() {
		System.out.println("Video played");
	}

}
