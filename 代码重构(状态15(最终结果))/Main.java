package ´úÂëÖØ¹¹;

public class Main {
		public static void main(String[] args) {
			Customer person1=new Customer("HuangZhichao");
			int price=20,days=5;
			Movie movie1=new Movie("Harry potter",Movie.REGULAR);
			Rental rental1=new Rental(movie1,days);
			person1.addRental(rental1);
			System.out.println(person1. statement());
		}
}