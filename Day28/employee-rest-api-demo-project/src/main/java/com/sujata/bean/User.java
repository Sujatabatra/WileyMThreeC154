package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Setter
	@Getter
	private String userName;
	@Setter
	@Getter
	private String password;
}
