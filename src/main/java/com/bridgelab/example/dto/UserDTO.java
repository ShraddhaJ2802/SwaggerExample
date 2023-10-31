package com.bridgelab.example.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class UserDTO {
	@NotEmpty
	@Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$",message = "Minimum 3 char start with capital letter")
	public String fName;
	public String lName;
	

}
