package data;

import java.util.ArrayList;
import model.MP3;

public interface RepositoryI {

	public abstract void songList();

	public abstract void mp3List();

	public abstract void mp4List();

	public abstract MP3 randomSong(ArrayList<MP3> list);

	public abstract void playRandomAll();

	public abstract void RatingSongsAVG();

	public abstract void playRandomRatingn5();

	public abstract void playRandomRock5();

}
