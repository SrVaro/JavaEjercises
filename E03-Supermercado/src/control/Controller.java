package control;

import gui.UI;
import services.Service;
import utility.Writer;

public class Controller {

	public static void startProgram() {

		// Service.fillWithData();

		UI.showMenu();

		int n = Writer.readInt();

		while (n != -1) {

			switch (n) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			}

			UI.waitMsg();

			Writer.readString();

			UI.showMenu();
			n = Writer.readInt();

		}

	}

}
