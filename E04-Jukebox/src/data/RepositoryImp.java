package data;

import java.util.ArrayList;

import model.Category;
import model.MP3;
import model.MP4;

public class RepositoryImp implements RepositoryI {

	private static ArrayList<MP3> musicList = new ArrayList<MP3>();

	public void songList() {
		musicList.forEach((n) -> System.out.println(n));
	}

	public void mp3List() {
		for (MP3 p : musicList) {
			if (p.getClass().isInstance(new MP3()))
				System.out.println(p);
		}
	}

	public void mp4List() {
		for (MP3 p : musicList) {
			if (p.getClass().isInstance(new MP4()))
				System.out.println(p);
		}
	}

	public MP3 randomSong(ArrayList<MP3> list) {
		return list.get((int) Math.ceil((Math.random() * list.size() - 1)));
	}

	public void playRandomAll() {
		randomSong(musicList).play();
	}

	public void RatingSongsAVG() {
		int sum = 0;
		for (MP3 p : musicList) {
			sum += p.getRating();
		}

		System.out.println("Average Rating: " + sum / musicList.size());
	}

	public void playRandomRatingn5() {
		ArrayList<MP3> rating5Songs = new ArrayList<>();
		for (MP3 p : musicList) {
			if (p.getRating() == 5)
				rating5Songs.add(p);
		}

		randomSong(rating5Songs).play();
	}

	public void playRandomRock5() {
		ArrayList<MP3> rockSongs = new ArrayList<>();
		for (MP3 p : musicList) {
			if (p.getCategory() == Category.ROCK)
				rockSongs.add(p);
		}

		randomSong(rockSongs).play();
	}

	public void addSong(MP3 s) {
		musicList.add(s);
	}

}
