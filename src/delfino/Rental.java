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
		return getMovie().getCharge(getDaysRented());
		
	}

	public int getFrequentRenterPoints() {
		return getMovie().getFrequentRenterPoints(getDaysRented());
		
	}
	
}
