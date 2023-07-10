package com.nit.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
@Data
public class Actor {

	@Id
	private Integer id;
	private String name;
	private String movie;
	private String award;
	
}
