package model;

import com.github.javafaker.Faker;

public class SongFactory {

	public static MP3 createRandomMP3() {
		Faker faker = new Faker();

		String name = faker.dragonBall().character();
		int quality = (int) Math.ceil(Math.random() * 1000);
		int rating = (int) Math.ceil(Math.random() * 5);
		Category category = null;

		switch ((int) Math.ceil(Math.random() * 4)) {
		case 1:
			category = Category.ROCK;
			break;
		case 2:
			category = Category.POP;
			break;
		case 3:
			category = Category.RAP;
			break;
		case 4:
			category = Category.TRAP;
			break;
		}

		return new MP3(name, quality, rating, category);
	}

	public static MP4 createRandomMP4() {

		Faker faker = new Faker();

		MP3 mp3 = createRandomMP3();

		String videoclip = faker.pokemon().name();

		return new MP4(mp3.getName(), mp3.getQuality(), mp3.getRating(), mp3.getCategory(), videoclip);
	}

}
