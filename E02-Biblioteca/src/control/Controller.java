package control;

import gui.Menu;
import services.Service;
import utility.Writer;

public class Controller {

	public static void startProgram() {
		
		Service.fillWithData();
		
		Menu.showMenu();

		int n = Writer.readInt();

		while (n != -1) {

			switch (n) {
			case 1:

				Service.addBook();

				break;
			case 2:

				Service.addDisk();

				break;

			case 3:

				Service.bookBorroweds();

				break;

			case 4:
				
				Service.publicationsBefore();

				break;

			case 5:

				Service.printAllMedia();

				break;

			case 6:
				
				Service.printAllMediaDiff();

				break;
			}

			System.out.println("\nEscribe cualquier numero para continuar");

			Writer.readInt();

			Menu.showMenu();
			n = Writer.readInt();

		}

	}

}
