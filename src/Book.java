

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Book implements Comparable<Book> {
    private final String title;
    private final String author;
    private final LocalDate publishedOn;
    private LocalDate startedReadingOn;
    private LocalDate finishedReadingOn;

    public Book(String title, String author, LocalDate publishedOn) {
        this.title = title;
        this.author = author;
        this.publishedOn = publishedOn;
        this.startedReadingOn = null;
        this.finishedReadingOn = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishedOn() {
        return publishedOn;
    }

    public boolean isRead() {
    	if(startedReadingOn != null && finishedReadingOn != null)
        return true;
    	else return false;
    }

    public boolean isProgress() {
 
        if(startedReadingOn != null && finishedReadingOn == null)
        	return true;
        else return false;
    }

    public String startedReadingOn(LocalDate startedOn) {
        this.startedReadingOn = startedOn;
        String message = "Start date added";
        return message;
    }

    public String finishedReadingOn(LocalDate finishedOn) {
        this.finishedReadingOn = finishedOn;
        String message = "Finished date added";
        return message;
    }
    
    public boolean publishedDateInputValidity(int montH , int datE, int yeaR ) {
    	int month = montH;
    	int daTE = datE;
    	int year =yeaR;
    	
    	if((month >=1 && month <=12) && (daTE >=1 && daTE <=31) && (year >=1900 && year <=2019))
    		return true;
    	else return false;
    	
    	
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return publishedOn != null ? publishedOn.equals(book.publishedOn) : book.publishedOn == null;

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publishedOn != null ? publishedOn.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Book that) {
        return this.title.compareTo(that.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedOn=" + publishedOn +
                '}';
    }
}
