package com.webservices.rest;
import java.util.HashMap;
import java.util.Map;

public class AnimalDao 
{
	

	public static AnimalDao instance;
	private Map<String, Animal> animals = new HashMap<String, Animal>();

	public AnimalDao() {

		//pumping-in some default data
		Animal animal = new Animal("1", "Lion", "Wild");
		animals.put("1", animal);
		animal = new Animal("2", "Crocodile", "Wild");
		animals.put("2", animal);
		animal=new Animal("3","Tiger","Wild");
		animals.put("3", animal);

	}

	public Map<String, Animal> getAnimals() {
		return animals;
	}

}
