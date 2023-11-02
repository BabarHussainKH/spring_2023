package com.spring.core.beans;

public class Projects {


	private String title;

	public Projects(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static Projects createInstance() {
		return new Projects("CLOS");
	}

	@Override
	public String toString() {
		return "Projects [title=" + title + "]";
	}

}
