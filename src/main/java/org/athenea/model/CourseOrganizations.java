package org.athenea.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document (collection="courses_organizations")
public class CourseOrganizations {

	private String title;
	private String description;
	private Date date;
	private String place;

	public CourseOrganizations(String title) {
		this.setTitle(title);
	}

	public CourseOrganizations(String title, String description, Date date, String place) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.place = place;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return String.format(
				"Grade[name='%s']",
				title);
	}


}
