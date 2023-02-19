public class Book {
    private String title, author, isbn;
    private int pageCount;
    private double price;

    public Book(){}

    public Book(String title, String author, String isbn, int pageCount, double price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.price = price;
    }

    // 	A method to return the title of the book.
    public String getTitle(){
        return title;
    }

    // A method to return the author of the book.
    public String getAuthor(){
        return author;
    }

    // A method to return the ISBN of the book.
    public String getIsbn(){
        return isbn;
    }

    // 	A method to return the page count of the book.
    public int getPageCount(){
        return pageCount;
    }

    // A method to return the price of the book.
    public double getPrice(){
        return price;
    }

    // A method to set the title of the book.
    public void setTitle(String title){
        this.title = title;
    }

    // 	A method to set the author of the book.
    public void setAuthor(String author){
        this.author = author;
    }

    // 	A method to set the ISBN of the book.
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    // A method to set the page count of the book.
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }

    // A method to set the price of the book.
    public void setPrice(double price){
        this.price = price;
    }
    public static void main(String[] args){

        Book firstBook = new Book("Getting started with Nodejs", "Mr. Kissiedu", "978-0743273565", 200, 250.99 );

        System.out.println("Title of Book: " + firstBook.getTitle());
        System.out.println("Author of Book: " + firstBook.getAuthor());
        System.out.println("ISBN of Book: " + firstBook.getIsbn());
        System.out.println("Number of Pages: " + firstBook.getPageCount());
        System.out.println("Price of Book: " + firstBook.getPrice());
    }
}
