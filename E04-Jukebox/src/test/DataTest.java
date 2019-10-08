package test;

import data.RepositoryImp;
import model.SongFactory;

public class DataTest {

	public static void test(RepositoryImp r) {

		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP3());
		r.addSong(SongFactory.createRandomMP4());
		r.addSong(SongFactory.createRandomMP4());
		r.addSong(SongFactory.createRandomMP4());
		r.addSong(SongFactory.createRandomMP4());
		r.addSong(SongFactory.createRandomMP4());
		r.addSong(SongFactory.createRandomMP4());

	}

}
