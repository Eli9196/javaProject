package com.tbp.crud.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@MappedSuperclass
public class AccountProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String surname;
	
	private String httpImageLink;

	public AccountProfile( String name,String surname,String httpImageLink) {
		this.name = name;
		this.surname = surname;
		this.httpImageLink = httpImageLink;
	}
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getHttpImageLink() {
		return httpImageLink;
	}
	public void setHttpImageLink(String httpImageLink) {
		this.httpImageLink = httpImageLink;
	}
}

