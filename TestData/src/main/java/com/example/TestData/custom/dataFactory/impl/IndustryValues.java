package com.example.TestData.custom.dataFactory.impl;

import com.example.TestData.custom.dataFactory.Industry;

public class IndustryValues implements	Industry{
	private	static	String[]	industries	=	{
			"Telecom","Liquor","Finance","Fiber Optics"
	};

	@Override
	public String[] getIndutries() {
		// TODO Auto-generated method stub
		return industries;
	}
}
