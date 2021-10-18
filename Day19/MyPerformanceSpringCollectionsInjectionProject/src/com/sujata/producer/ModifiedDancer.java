package com.sujata.producer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ModifiedDancer implements Performer {

	private Map<String,String> songsStyles;

		public void setSongsStyles(Map<String, String> songsStyles) {
		this.songsStyles = songsStyles;
	}

	@Override
	public void perform() {
		
		Set<String> songs=songsStyles.keySet();
		for(String song:songs) {
			System.out.println("Dancer is dancing in "+songsStyles.get(song)+" on "+song);
		}
		System.out.println(" ");

	}

}
