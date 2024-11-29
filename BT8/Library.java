package BT8;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Library {
	private ArrayList<Book> bookList = new ArrayList<>();
	public Library() 
	{
	}
	public void showAllBooks() {
	    if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : bookList) {
                System.out.println(book.toString());
            }
        }
	}
	public void addBook(Book book) {
		bookList.add(book);
	}
	public void updateBook(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            Book currentBook = bookList.get(i);
            if (currentBook.getId().equals(book.getId())) {
                currentBook.setName(book.getName());
                currentBook.setPublicationDate(book.getPublicationDate());
                currentBook.setCategoryName(book.getCategoryName());
                currentBook.setAuthorName(book.getAuthorName());
                currentBook.setPrice(book.getPrice());
                currentBook.setDiscountRate(book.getDiscountRate());
                System.out.println("Book details updated.");
                return;  
            }
        }
        System.out.println("Book with ID " + book.getId() + " not found.");
    }
	public void removeBookById(String id) {
		for (int i = 0; i < bookList.size();)
		{
			Book currentBook = bookList.get(i);
			if (currentBook.getId().equals(id)) {
			    bookList.remove(i);
			    System.out.println("Book with ID " + id + " has been removed.");
			    return;
			}
		}
	    System.out.println("Book with ID " + id + " not found.");
	}
	 public Book searchBookById(String id) {
	        for (Book book : bookList) {
	            if (book.getId().equals(id)) {
	                return book;  
	            }
	        }
	        System.out.println("Book with ID " + id + " not found.");
	        return null;  
	    }
	    public ArrayList<Book> searchBookListByPublicationDateInRange(String dateFrom, String dateTo) {
	        ArrayList<Book> resultList = new ArrayList<>();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	        
	        LocalDate startDate = LocalDate.parse(dateFrom, formatter);
	        LocalDate endDate = LocalDate.parse(dateTo, formatter);

	        for (Book book : bookList) {
	            LocalDate publicationDate = LocalDate.parse(book.getPublicationDate(), formatter);
	            
	            if ((publicationDate.isEqual(startDate) || publicationDate.isAfter(startDate)) &&
	                (publicationDate.isEqual(endDate) || publicationDate.isBefore(endDate))) {
	                resultList.add(book);  
	            }
	        }
	        return resultList;  
	    }
}


	
