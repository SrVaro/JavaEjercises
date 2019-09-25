package control;

import gui.UI;
import model.MediaFactory;
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
				Service.addBook(MediaFactory.readBook());
				break;
			case 2:
				Service.addDisk(MediaFactory.readDisk());
				break;
			case 3:
				Service.bookBorroweds();
				break;
			case 4:
				Service.publicationsBefore(Writer.readDate());
				break;
			case 5:
				Service.printAllMedia();
				break;
			case 6:
				Service.printAllMediaDiff();
				break;
			case 7:
				Service.exportData();
				break;
			}

			UI.waitMsg();

			Writer.readString();

			UI.showMenu();
			n = Writer.readInt();

		}

	}

}
