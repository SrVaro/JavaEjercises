package model;

import gui.UI;

public class MP4 extends MP3 {

	private String videoclip;

	public MP4() {
		super();
	}

	public MP4(String name, int quality, int rating, Category category, String videoclip) {
		super(name, quality, rating, category);
		this.videoclip = videoclip;
	}

	public void play() {
		UI.playMP4Msg();
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "MP4 [videoclip=" + videoclip + ", toString()=" + super.toString() + "]";
	}

	public String getVideoclip() {
		return videoclip;
	}

	public void setVideoclip(String videoclip) {
		this.videoclip = videoclip;
	}

}
