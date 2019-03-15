package com.veera.back.dto;


public class Catagory {
	
	private int id;
	private String name;
	private String description;
	private boolean active=true;
	private String imageUrl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Catagory [id=" + id + ", name=" + name + ", description=" + description + ", active=" + active
				+ ", imageUrl=" + imageUrl + "]";
	}
	public Catagory() {
		super();
	}
	

}
