package BT8;

public class Book {
    private String id;
    private String name;
    private String publicationDate;
    private String categoryName;
    private String authorName;
    private double price;
    private double discountRate;
    
    // Constructor
    public Book(String id, String name, String publicationDate, String categoryName, String authorName, double price, double discountRate) {
        this.id = id;
        this.name = name;
        this.publicationDate = publicationDate;
        this.categoryName = categoryName;
        this.authorName = authorName;
        this.price = price;
        this.discountRate = discountRate;
    }
    
    // Getters and Setters
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return String.format("Book[id=%s, name=%s, publicationDate=%s, categoryName=%s, authorName=%s, price=%.2f, discountRate=%.2f]",
                id, name, publicationDate, categoryName, authorName, price, discountRate);
    }
}
