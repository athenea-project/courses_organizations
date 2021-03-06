package org.athenea.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="courses_organizations")
public class CourseOrganizations {
	
	private String title;
	private String description;
	private String date;
	private String place;

	public CourseOrganizations(String title) {
		this.setTitle(title);
	}

	public CourseOrganizations(String title, String description, String date, String place) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.place = place;
	}


	public CourseOrganizations() {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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
