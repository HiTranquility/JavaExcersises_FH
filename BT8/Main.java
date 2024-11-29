package BT8;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		System.out.println("Library after initing:");
		library.showAllBooks();
		System.out.println();
		library.addBook(new Book("B01", "Book A", "06/01/2023", "Action", "Author A", 50.79, 0.2));
		library.addBook(new Book("B02", "Book B", "07/02/2023", "Horror", "Author B", 79.89, 0.1));
		library.addBook(new Book("B03", "Book C", "08/03/2023", "Romance", "Author A", 25.99, 0.3));
		library.addBook(new Book("B03", "Book D", "10/03/2023", "Romance", "Author D", 22.99, 0.45));
		System.out.println("Library after adding 3 books:");
		library.showAllBooks();
		System.out.println();
		System.out.println("Searching book with id by B01:");
		System.out.println(library.searchBookById("B01"));
		System.out.println();
		Book book = library.searchBookById("B02");
		book.setPublicationDate("20/11/2023");
		book.setCategoryName("Action");
		book.setPrice(123.99);
		book.setDiscountRate(0.55);
		library.updateBook(book);
		System.out.println("Library after updating book has id by B02:");
		library.showAllBooks();
		System.out.println();
		library.removeBookById("B02");
		System.out.println("Library after removing book has id by B02:");
		library.showAllBooks();
		}
}
