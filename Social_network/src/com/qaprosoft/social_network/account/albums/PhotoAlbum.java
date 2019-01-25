package com.qaprosoft.social_network.account.albums;

public class PhotoAlbum extends Album {
	
	private static final long serialVersionUID = 1L;

	public PhotoAlbum( ) {
		System.out.println("Photo album created");
	}

	@Override
	public void addEntry() {
		System.out.println("Photo added");
	}

	@Override
	public void deleteEntry() {
		System.out.println("Photo deleted");
	}

	@Override
	public void showEntry() {
		System.out.println("Photo shown");
	}

}
