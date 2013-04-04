package delfino;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Customer {

	private String name;
	private List<Rental> _rentals = new ArrayList<Rental>();
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Rental> getRentals() {
		return _rentals;
	}
	
	public void addRental(Rental arg) {
		_rentals.add(arg);
	}
	
	public String statement() {
		
		StringBuilder statement = new StringBuilder();
		
		addHeader(statement);
		addRentals(statement);
		addFooter(statement);
		
		return statement.toString();
	}

	public void addHeader(StringBuilder statement) {
		statement.append("Rental Record for " + getName() + "\n");
	}
	
	public void addRentals(StringBuilder statement) {
		for (Rental aRental : getRentals()) {
			addMovieToStatement(statement, aRental);
		}
	}

	private void addMovieToStatement(StringBuilder statement, Rental rental) {
		statement.append("\t" + rental.getMovie().getTitle() + 
						 "\t" + String.valueOf(rental.getCharge()) + "\n");
	}

	public void addFooter(StringBuilder statement) {
		statement.append("Amount owed is " + String.valueOf(getTotalCharge()) + "\n");
		statement.append("You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points");
	}

	private double getTotalCharge() {
		double totalCharge = 0;
		
		for (Rental aRental : getRentals()) {
			totalCharge += aRental.getCharge();
		}
		
		return totalCharge;
	}
	
	private int getTotalFrequentRenterPoints() {
		int totalFrequentRenterPoints = 0;
		
		for (Rental aRental : getRentals()) {
			totalFrequentRenterPoints += aRental.getFrequentRenterPoints();
		}
		
		return totalFrequentRenterPoints;
	}
	
	
	public String htmlStatement() {
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
		for (Rental each : getRentals()) {
			// show figures for each rental
			result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		// add footer lines
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
		return result;
	}
}
