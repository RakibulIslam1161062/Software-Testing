
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public interface BookFilter {
  boolean apply(Book b);
}

class BookPublishedYearFilter implements BookFilter {
  private Function<LocalDate, Boolean> comparison;
//year range 1900 to 2019
  public Boolean After(int year, Book b) {
    final LocalDate date = LocalDate.of(year, 12, 31);
    BookPublishedYearFilter filter = new BookPublishedYearFilter();
//    filter.comparison = date::isBefore;
    if(afterYearFilter(year, b))
    	return true; 
    else return false;
  }
  
  public Boolean afterYearFilter(int year, Book b) {
	  if(year > b.getPublishedOn())
		  return true;
	  else return false;
  }

  public Boolean Before(int year,Book b) {
    final LocalDate date = LocalDate.of(year, 1, 1);
    BookPublishedYearFilter filter = new BookPublishedYearFilter();
    if(beforeYearFilter(year, b))
    	return true; 
    else return false;
  }
  public Boolean beforeYearFilter(int year, Book b) {
	  if(year < b.getPublishedOn())
		  return true;
	  else return false;
  }


  @Override
  public boolean apply(final Book b) {
//    return b!=null && comparison.apply(b.getPublishedOn());
	  return true;
  }
}

class CompositeFilter implements BookFilter {
  public List<BookFilter> filters;

  CompositeFilter() {
    filters = new ArrayList<>();
  }

  @Override
  public boolean apply(final Book b) {
    return filters.stream()
      .map(bookFilter -> bookFilter.apply(b))
      .reduce(true, (b1, b2) -> b1 && b2);
  }

  public boolean addFilter( BookFilter bookFilter) {
    filters.add(bookFilter);
    return true;
  }
}

