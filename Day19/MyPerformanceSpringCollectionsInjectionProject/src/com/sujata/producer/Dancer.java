package com.sujata.producer;

import java.util.List;

public class Dancer implements Performer {

	private List<String> styles;

	public void setStyles(List<String> styles) {
		this.styles = styles;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in " );
		for(String style:styles) {
			System.out.print(style+" , ");
		}
		System.out.println(" ");

	}

}
