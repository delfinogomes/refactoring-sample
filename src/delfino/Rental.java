package delfino;

public class Rental {

	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		super();
		this._movie = movie;
		this._daysRented = daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public double getCharge() {
		//determine amounts for each line
		switch (getMovie().getPriceCode()) {
		case Movie.REGULAR:
			return chargeForRegularMovie();
		case Movie.NEW_RELEASE:
			return chargeForNewReleaseMovie();
		case Movie.CHILDRENS:
			return chargeForChildrenMovie();
		}
		
		return 0;
	}

	public double chargeForChildrenMovie() {
		double charge = 1.5;
		if (getDaysRented() > 3)
			charge += (getDaysRented() - 3) * 1.5;
		return charge;
	}

	public double chargeForNewReleaseMovie() {
		return getDaysRented() * 3;
	}

	public double chargeForRegularMovie() {
		double charge = 2;
		if (getDaysRented() > 2)
			charge += (getDaysRented() - 2) * 1.5;
		return charge;
	}

	public int getFrequentRenterPoints() {
		if (hasBonusFrequentPoint())
			return 2;
		return 1;
	}
	
	public boolean hasBonusFrequentPoint() {
		return (getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&& getDaysRented() > 1;
	}
	
}
