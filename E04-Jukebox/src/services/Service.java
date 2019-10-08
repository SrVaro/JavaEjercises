package services;

import data.RepositoryImp;
import test.DataTest;

public class Service {

	private static RepositoryImp r = new RepositoryImp();

	public static void fillWithData() {
		DataTest.test(r);
	}

	public static void songList() {
		r.songList();
	}

	public static void mp3List() {
		r.mp3List();
	}

	public static void mp4List() {
		r.mp4List();
	}

	public static void playRandomAll() {
		r.playRandomAll();
	}

	public static void RatingSongsAVG() {
		r.RatingSongsAVG();
	}

	public static void playRandomRatingn5() {
		r.playRandomRatingn5();
	}

	public static void playRandomRock5() {
		r.playRandomRock5();
	}

}
