package control;

import gui.UI;
import services.Service;
import utility.Writer;

public class Controller {

	public static void startProgram() {

		Service.fillWithData();

		UI.showMenu();

		int n = Writer.readInt();

		while (n != -1) {

			switch (n) {
			case 1:
				Service.songList();
				break;
			case 2:
				Service.mp3List();
				break;
			case 3:
				Service.mp4List();
				break;
			case 4:
				Service.playRandomAll();
				break;
			case 5:
				Service.RatingSongsAVG();
				break;
			case 6:
				Service.playRandomRatingn5();
				break;
			case 7:
				Service.playRandomRock5();
				break;
			}

			UI.waitMsg();

			Writer.readString();

			UI.showMenu();
			n = Writer.readInt();

		}

	}

}
