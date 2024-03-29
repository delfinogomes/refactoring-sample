package delfino;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private Price price;
	
	public Movie(String title, int priceCode) {
		this._title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
		case Movie.REGULAR:
			price = new RegularPrice();
			break;
		case Movie.NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case Movie.CHILDRENS:
			price = new ChildrenPrice();
			break;
		default:
			throw new IllegalArgumentException("Price code is invalid.");
		}
	}

	public String getTitle() {
		return _title;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
	
	
}
