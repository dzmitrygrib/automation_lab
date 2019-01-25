package com.qaprosoft.social_network.account;

import java.io.Serializable;
import java.util.ArrayList;

import com.qaprosoft.social_network.account.account_interfaces.Editable;
import com.qaprosoft.social_network.account.albums.PhotoAlbum;
import com.qaprosoft.social_network.account.albums.VideoAlbum;
import com.qaprosoft.social_network.account.documents.Document;
import com.qaprosoft.social_network.account.wall.Wall;
import com.qaprosoft.social_network.user.*;

public abstract class Account implements Editable, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String ID;
	private String name;
	private VideoAlbum videoAlbum;
	private PhotoAlbum photoAlbum;
	private Wall wall;
	private ArrayList<Document> documents;
		
	public Account(User user)
	{
		this.videoAlbum = new VideoAlbum();
		this.photoAlbum = new PhotoAlbum();
		this.wall = new Wall();
		this.documents = new ArrayList<Document>();
		this.name = user.getName();
	}
	
	@Override
	public abstract void edit();
	
	@Override
	public abstract void delete();
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getID() {
		return this.ID;
	}
	
	public void addAvatar() {
		System.out.println("Avatar added");
	}
	
	public void addDocument(Document document) {
		this.documents.add(document);
	}
	public ArrayList<Document> getDocumentList() {
		return this.documents;
	}
	
}
