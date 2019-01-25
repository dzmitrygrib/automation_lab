package com.qaprosoft.social_network.account.documents;

public enum DocumentType {

	DOC ("doc"),
	XLS ("xls"),
	JAVA ("java"),
	PDF ("pdf"),
	DWG ("dwg"),
	DEFAULT ("default");
	
	private String name;
	
	private DocumentType(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return this.name;
	}
	
}
