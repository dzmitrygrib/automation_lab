package com.qaprosoft.social_network.account.albums;

import java.io.Serializable;

public abstract class Album implements IAlbum, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String albumID = "DefaultAlbumID";
	private String albumName = "DefaultAlbumName";
	
	public Album() {
		System.out.println("Abstract album created");
	}
	
	public void setAlbumID(String albumID) {
		this.albumID = albumID;
	}
	public String getAlbumID() {
		return this.albumID;
	}
	
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumName() {
		return this.albumName;
	}
	
	@Override
	public abstract void addEntry();
	
	@Override
	public abstract void deleteEntry();
	
	@Override
	public abstract void showEntry();
	
}
