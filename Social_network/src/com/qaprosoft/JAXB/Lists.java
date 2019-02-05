package com.qaprosoft.JAXB;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

/*
 *  Class for storing unmarshaled with JAXB objects
 */

@XmlRootElement(name = "objects")
public class Lists {
	
	private ArrayList<Object> list = new ArrayList<Object>();
	
	@XmlAnyElement(lax = true)
	public ArrayList<Object> getList() {
		return list;
	}

}
