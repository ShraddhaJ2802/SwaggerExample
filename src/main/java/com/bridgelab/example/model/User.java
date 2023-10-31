package com.bridgelab.example.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelab.example.dto.UserDTO;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="User_Msg")
@Data
@NoArgsConstructor
public class User {
		
		@Id
		@GeneratedValue
		private int id;
		private String fName;
		private String lName;
		private LocalDate updateDate;
		
		/*public User(String fName, String lName) {
			super();
			this.fName = fName;
			this.lName = lName;
		}*/
		
		public User(UserDTO userDTO) {
			
			this.fName = userDTO.fName;
			this.lName = userDTO.lName;
		}


}