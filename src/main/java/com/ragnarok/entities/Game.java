package com.ragnarok.entities;

import java.util.List;

public class Game {

	private String name;
	private int yearsOld;
	private String gender;
	private boolean isMultiplayer;
	private MinimumAge minimumAge;
	private List<Producer> producers;
	
	public Game(String name, int yearsOld, String gender, boolean isMultiplayer, MinimumAge minimumAge,
			List<Producer> producers) {
		super();
		this.name = name;
		this.yearsOld = yearsOld;
		this.gender = gender;
		this.isMultiplayer = isMultiplayer;
		this.minimumAge = minimumAge;
		this.producers = producers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isMultiplayer() {
		return isMultiplayer;
	}

	public void setMultiplayer(boolean isMultiplayer) {
		this.isMultiplayer = isMultiplayer;
	}

	public MinimumAge getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(MinimumAge minimumAge) {
		this.minimumAge = minimumAge;
	}

	public List<Producer> getProducers() {
		return producers;
	}

	public void setProducers(List<Producer> producers) {
		this.producers = producers;
	}
	
}
