package com.SpringDataJPA.entitiy;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name",nullable = false)
	private String firstName;
	@Column(name = "last_name",nullable = false)
	private String lastName;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "birth_of_data",nullable = true)
	private Date birthOfDate;
	
	
	@ManyToMany
	@JoinTable(
	    name = "student_course", // Ortak tablo adı
	    joinColumns = @JoinColumn(name = "student_id"), // Öğrenci ID'si
	    inverseJoinColumns = @JoinColumn(name = "course_id") // Kurs ID'si
	)
	private List<Course> courses;

	
	

}
