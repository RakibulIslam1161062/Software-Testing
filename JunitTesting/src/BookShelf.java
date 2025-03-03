

import java.time.Year;
import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class BookShelf {

    public ArrayList<Book> books = new ArrayList<>();
    private  int capacity;

    public BookShelf() {
        this.capacity = Integer.MAX_VALUE;
    }

    public BookShelf(int capacity) {
        this.capacity = capacity;
    }
    
    public void setCapacity(int value) {
    	this.capacity = value;
    }
    
    public int getCapacity() {
    	return capacity;
    }

    public List<Book> books() {
        return Collections.unmodifiableList(books);
    }

    public boolean add(Book b) {
       
            if (books.size() == capacity) {
            	
               return false; 
            }
            books.add(b);
        
        return true;
    }

    public List<Book> arrange() {
        return arrange(Comparator.naturalOrder());
    }

    public List<Book> arrange(Comparator<Book> comparator) {
        return books
                .stream()
                .sorted(comparator)
                .collect(toList());
    }

    public Map<Year, List<Book>> groupByPublicationYear() {
        return groupBy(book -> Year.of(book.getPublishedOn()));
    }

    public <K> Map<K, List<Book>> groupBy(Function<Book, K> fx) {
        return books
                .stream()
                .collect(groupingBy(fx));
    }

    public int parcentageCompleted() {
        if (books.isEmpty()) {
            return 0;
        }
        int booksRead = Long.valueOf(books.stream().filter(Book::isRead).count()).intValue();
        int PercentageCompleted = booksRead * 100 / books.size();
        return PercentageCompleted ;
    }
    
    public int parcentageToRead() {
        if (books.isEmpty()) {
            return 0;
        }
        int booksRead = Long.valueOf(books.stream().filter(Book::isRead).count()).intValue();
        int booksInProgress = Long.valueOf(books.stream().filter(Book::isProgress).count()).intValue();
        int booksToRead = books.size() - booksRead - booksInProgress;

       
        int percentageToRead = booksToRead * 100 / books.size();
       

        return percentageToRead;
    }
    public int parcentageInProgress() {
        if (books.isEmpty()) {
            return 0;
        }
        int booksRead = Long.valueOf(books.stream().filter(Book::isRead).count()).intValue();
        int booksInProgress = Long.valueOf(books.stream().filter(Book::isProgress).count()).intValue();
        int booksToRead = books.size() - booksRead - booksInProgress;

       
        int percentageInProgress = booksInProgress * 100 / books.size();

        return  percentageInProgress;
    }



    public List<Book> findBooksByTitle(String title) {
        return findBooksByTitle(title, b -> true);
    }

    public List<Book> findBooksByTitle(String title, BookFilter filter) {
        return books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(title))
                .filter(b -> filter.apply(b))
                .collect(toList());
    }
}
