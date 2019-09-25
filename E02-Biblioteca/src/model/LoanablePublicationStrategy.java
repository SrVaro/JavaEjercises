package model;

public class LoanablePublicationStrategy implements PublicationStrategy {

	private boolean borrowed;

	@Override
	public boolean isBorrowed() {
		return borrowed;
	}

	@Override
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

}
