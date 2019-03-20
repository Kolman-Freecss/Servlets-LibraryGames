package com.ragnarok.entities;

public enum MinimumAge {

	PARENT_GUIDE ("!"),
	THREE ("3"),
	SEVEN ("7"),
	TWELVE ("12"),
	SIXTEEN ("16"),
	EIGHTEEN ("18");
	
	private final String age;
	
	private MinimumAge(String age)
	{
		this.age = age;
	}
	
	public String getAge()
	{
		return this.age;
	}
	
}
