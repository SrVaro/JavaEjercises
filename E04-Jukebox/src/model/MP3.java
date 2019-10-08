package model;

import gui.UI;

public class MP3 {

	private String name;
	private int quality;
	private int rating;

	private Category category;

	public MP3() {
		super();
	}

	public MP3(String name, int quality, int rating, Category category) {
		super();
		this.name = name;
		this.quality = quality;
		this.rating = rating;
		this.category = category;
	}
	
	public void play() {
		UI.playMP3Msg();
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "MP3 [name=" + name + ", quality=" + quality + ", rating=" + rating + ", category=" + category + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
