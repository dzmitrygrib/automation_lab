package com.qaprosoft.social_network.account.documents;

import java.io.Serializable;

import com.qaprosoft.social_network.account.account_interfaces.Sendable;

public class Document implements Sendable, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name = "DefaultName";
	private DocumentType type = DocumentType.DEFAULT;
	
	public Document() {}
	
	public Document(String name, DocumentType type) {
		this.name = name;
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setType(DocumentType type) {
		this.type = type;
	}
	public DocumentType getType() {
		return this.type;
	}

	@Override
	public void send() {
		System.out.println("Document sent");		
	}
	
	

}
