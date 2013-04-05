package delfino;

public abstract class Price {

	public abstract double getCharge(int daysRented);
	public abstract int getPriceCode();

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
	
}

class RegularPrice extends Price {

	@Override
	public double getCharge(int daysRented) {
		double charge = 2;
		if (daysRented > 2)
			charge += (daysRented - 2) * 1.5;
		return charge;
	}
	
	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}
	
}
class NewReleasePrice extends Price {

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}
	
	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	@Override
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}
}
class ChildrenPrice extends Price {
	@Override
	public double getCharge(int daysRented) {
		double charge = 1.5;
		if (daysRented > 3)
			charge += (daysRented - 3) * 1.5;
		return charge;
	}
	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}
}
