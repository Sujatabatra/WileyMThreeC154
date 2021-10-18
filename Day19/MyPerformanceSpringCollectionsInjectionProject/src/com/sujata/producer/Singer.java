package com.sujata.producer;

import java.util.Set;

public class Singer implements Performer {

	private Set<String> songs;

	public Singer(Set<String> songs) {
		super();
		this.songs = songs;
	}

	@Override
	public void perform() {
		System.out.print("Singer is singing ");
		for(String song:songs) {
			System.out.print(song+" , ");
		}
		System.out.println("");

	}

}
