import java.time.LocalDate;

public class Book {

    private String title, author, isbn;
    private LocalDate publicationDate;
    private int pageNumber;

    public Book(){};

    public Book(String title, String author, String isbn, LocalDate publicationDate, int pageNumber){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.pageNumber = pageNumber;
    }

    // A method to return the title of the book.
    public String getTitle(){
        return title;
    }

    // A method to return the author of the book
    public String getAuthor(){
        return author;
    }

    // A method to return the ISBN of the book
    public String getIsbn(){
        return isbn;
    }

    // A method to return the publication date of the book
    public LocalDate getPublicationDate(){
        return  publicationDate;
    }

    // A method to return the number of pages of the book
    public int getPageNumber(){
        return pageNumber;
    }

    // A method to set the title of the book
    public void setTitle(){
        this.title = title;
    }

    // A method to set the author of the book
    public void setAuthor(){
        this.author = author;
    }

    // A method to set the ISBN of the book
    public void setIsbn(){
        this.isbn = isbn;
    }

    // A method to set the publication date of the book
    public void setPublicationDate(){
        this.publicationDate = publicationDate;
    }

    // A method to set the number of pages of the book
    public void setPageNumber(){
        this.pageNumber = pageNumber;
    }

    // Check if book is long
    public boolean isBookLong(){
        return pageNumber > 500;
    }

    // Check if the book is a recent publication
    public boolean checkPublicationDate(){
        LocalDate currentDate = LocalDate.now();
        LocalDate cutoffDate = currentDate.minusYears(5);
        return publicationDate.isAfter(cutoffDate) || publicationDate.isEqual(cutoffDate);
    }
    public static void main(String[] args){

         Book book1 = new Book("Getting Started with Nodejs", "Mr. Kissiedu", "435-3649204727", LocalDate.of(2021, 8, 4), 600);

        System.out.println("Title of Book: " + book1.getTitle());
        System.out.println("Author of Book: " + book1.getAuthor());
        System.out.println("ISBN of Book: " + book1.getIsbn());
        System.out.println("Is book a recent Publication: " + book1.checkPublicationDate());
        System.out.println("Number of pages: " + book1.getPageNumber());
        System.out.println("Checking if book is long: " + book1.isBookLong());
    }
}
