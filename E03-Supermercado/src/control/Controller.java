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
				Service.addProduct();
				break;
			case 2:
				Service.deleteProduct();
				break;
			case 3:
				Service.listProducts();
				break;
			case 4:
				Service.listProductsName();
				Service.getStock();
				break;
			case 5:
				Service.getProductsMinItems();
				break;
			}

			UI.waitMsg();

			Writer.readString();

			UI.showMenu();
			n = Writer.readInt();

		}

	}

}
