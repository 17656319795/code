package ´úÂëÖØ¹¹;

public class Main {
		public static void main(String[] args) {
			Customer person1=new Customer("HuangZhichao");
			Movie movie1=new Movie("Harry Potter",1235);
			Rental rental1=new Rental(movie1,19999999);
			person1.addRental(rental1);
			System. out.print(person1. statement());
		}
}