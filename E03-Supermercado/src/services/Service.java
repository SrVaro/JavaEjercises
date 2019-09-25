package services;

import data.RepositoryImp;
import test.DataTest;

public class Service {

	private static RepositoryImp r = new RepositoryImp();

	public static void fillWithData() {
		DataTest.test(r);
	}

}
