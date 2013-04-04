package delfino;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CustomerStatementTest {
	
	@Test
	public void testRegularRentalWithOneDay() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("inteligência articial", Movie.REGULAR), 1));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	inteligência articial	2.0\n" +
						"Amount owed is 2.0\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testRegularRentalWithTwoDays() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("inteligência articial", Movie.REGULAR), 1));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	inteligência articial	2.0\n" +
						"Amount owed is 2.0\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testRegularRentalWithMoreThanTwoDays() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("inteligência articial", Movie.REGULAR), 4));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	inteligência articial	5.0\n" +
						"Amount owed is 5.0\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	

	@Test
	public void testNewReleaseRentalWithOneDay() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("life of pi", Movie.NEW_RELEASE), 1));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	life of pi	3.0\n" +
						"Amount owed is 3.0\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testNewReleaseRentalWithTwoDays() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("life of pi", Movie.NEW_RELEASE), 2));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	life of pi	6.0\n" +
						"Amount owed is 6.0\n" +
						"You earned 2 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testNewReleaseRentalWithThreeDays() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("life of pi", Movie.NEW_RELEASE), 3));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	life of pi	9.0\n" +
						"Amount owed is 9.0\n" +
						"You earned 2 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testChildrenRentalWithOneDay() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 1));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	1.5\n" +
						"Amount owed is 1.5\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testChildrenRentalWithTwoDay() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 2));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	1.5\n" +
						"Amount owed is 1.5\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testChildrenRentalWithThreeDay() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 3));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	1.5\n" +
						"Amount owed is 1.5\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testChildrenRentalWithFourDays() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 4));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	3.0\n" +
						"Amount owed is 3.0\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testChildrenRentalWithFiveDays() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 5));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	4.5\n" +
						"Amount owed is 4.5\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testSimpleRentalWithTwoMovies() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 1));
		customer.addRental(new Rental(new Movie("inteligência articial", Movie.REGULAR), 1));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	1.5\n" +
						"	inteligência articial	2.0\n" +
						"Amount owed is 3.5\n" +
						"You earned 2 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testSimpleRentalWithThreeMoviesOneOfAKindForOneDay() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 1));
		customer.addRental(new Rental(new Movie("inteligência articial", Movie.REGULAR), 1));
		customer.addRental(new Rental(new Movie("life of pi", Movie.NEW_RELEASE), 1));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	1.5\n" +
						"	inteligência articial	2.0\n" +
						"	life of pi	3.0\n" +
						"Amount owed is 6.5\n" +
						"You earned 3 frequent renter points"
						,
						statement);
		
		
	}
	
	@Test
	public void testSimpleRentalWithThreeMoviesOneOfAKindForFiveDays() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("rei leão", Movie.CHILDRENS), 5));
		customer.addRental(new Rental(new Movie("inteligência articial", Movie.REGULAR), 5));
		customer.addRental(new Rental(new Movie("life of pi", Movie.NEW_RELEASE), 5));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	rei leão	4.5\n" +
						"	inteligência articial	6.5\n" +
						"	life of pi	15.0\n" +
						"Amount owed is 26.0\n" +
						"You earned 4 frequent renter points"
						,
						statement);
		
		
	}

	@Test
	public void testRentalWithMovieThatHasUnknownPriceCodeBillsNothingAndGivesFrequentPoint() {
		Customer customer = new Customer("John");
		customer.addRental(new Rental(new Movie("inteligência articial", Integer.MAX_VALUE), 1));
		
		String statement = customer.statement();
		
		System.out.println(statement);
		
		assertEquals("The statement is incorrect", 
				"Rental Record for John\n" +
						"	inteligência articial	0.0\n" +
						"Amount owed is 0.0\n" +
						"You earned 1 frequent renter points"
						,
						statement);
		
	}
	
}
