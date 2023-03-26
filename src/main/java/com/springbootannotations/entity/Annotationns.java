package com.springbootannotations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ANNOTATION_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Annotationns {

	@Id
	@Column(name = "ANNOTATION_ID")
	private int id;
	@Column(name = "ANNOTATION_NAME")
	private String name;

	@Column(name = "ANNOTATION_DESC")
	private int desc;

}