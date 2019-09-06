

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
class BookTesting {
	
	
	@Test
	void checkPublishedDateValidity0() {
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity1() {
		LocalDate date = LocalDate.of(2019, Month.MAY, 16);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity2() {
		LocalDate date = LocalDate.of(1901, Month.MAY, 8);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity3() {
		LocalDate date = LocalDate.of(2018, Month.MAY, 8);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity4() {
		LocalDate date = LocalDate.of(2020, Month.MAY, 8);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, false);	
	}
	@Test
	void checkPublishedDateValidity5() {
		LocalDate date = LocalDate.of(1899, Month.MAY, 8);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, false);	
	}
	@Test
	void checkPublishedDateValidity6() {
		LocalDate date = LocalDate.of(2019, Month.MAY, 8);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity7() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 1);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity8() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 31);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity9() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 2);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity10() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 30);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity11() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 31);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = 32;
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, false);	
	}

	@Test
	void checkPublishedDateValidity12() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 1);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = 0;
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, false);	
	}
	@Test
	void checkPublishedDateValidity13() {
		LocalDate date = LocalDate.of(1960, Month.JANUARY, 16);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity14() {
		LocalDate date = LocalDate.of(1960, Month.DECEMBER, 12);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity15() {
		LocalDate date = LocalDate.of(1960, Month.FEBRUARY, 2);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity16() {
		LocalDate date = LocalDate.of(1960, Month.FEBRUARY, 16);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = date.getMonthValue();
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, true);	
	}
	@Test
	void checkPublishedDateValidity17() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 16);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = 13;
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, false);	
	}
	@Test
	void checkPublishedDateValidity18() {
		LocalDate date = LocalDate.of(1960, Month.MAY, 16);
		Book newBook2 = new Book("Java Book", "rakib",date );
		int monthValue = 0;
		int dateValue = date.getDayOfMonth();
		int yearValue = date.getYear();
		System.out.println(monthValue +" " +dateValue + " " + yearValue);
		boolean check = newBook2.publishedDateInputValidity(monthValue, dateValue, yearValue);
		assertEquals(check, false);	
	}
	@Test
	void checkIsReadMethod1() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		
		newBook.startedReadingOn(LocalDate.of(1960, Month.MAY, 16));
		newBook.finishedReadingOn(LocalDate.of(1961, Month.MAY, 16));
		boolean check = newBook.isRead();
		assertEquals(check, true);	
	}
	
	@Test
	void checkIsReadMethod2() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		
		boolean check = newBook.isRead();
		assertEquals(check, false);	
	}
	@Test
	void checkIsReadMethod3() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		
		
		newBook.finishedReadingOn(LocalDate.of(1961, Month.MAY, 16));
		boolean check = newBook.isRead();
		assertEquals(check, false);	
	}
	
	@Test
	void checkIsReadMethod4() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		
		newBook.startedReadingOn(LocalDate.of(1960, Month.MAY, 16));
		
		boolean check = newBook.isRead();
		assertEquals(check, false);	
	}

	@Test
	void checkIsProgress1() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		
		newBook.startedReadingOn(LocalDate.of(1960, Month.MAY, 16));
		boolean check = newBook.isProgress();
		assertEquals(check, true);	
	}
	
	@Test
	void checkIsProgress2() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		newBook.startedReadingOn(LocalDate.of(1960, Month.MAY, 16));
		newBook.finishedReadingOn(LocalDate.of(1961, Month.MAY, 16));
		boolean check = newBook.isProgress();
		assertEquals(check, false);	
	}
	@Test
	void checkIsProgress3() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		
		
		newBook.finishedReadingOn(LocalDate.of(1961, Month.MAY, 16));
		boolean check = newBook.isProgress();
		assertEquals(check, false);	
	}
	
	@Test
	void checkIsProgress4() {
		Book newBook = new Book("Java Book", "rakib",LocalDate.of(1960, Month.MAY, 16) );
		
		boolean check = newBook.isProgress();
		assertEquals(check, false);	
	}


	
	
	

	@Test
	void checkStartedREadingOnMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		Boolean successMessage = newBook.startedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, true);
		
		
	}
	@Test
	void checkStartedREadingOnMethod2() {
		Book newBook = new Book("", "rakib", LocalDate.of(2019, Month.FEBRUARY, 1));
		Boolean successMessage = newBook.startedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, true);
		
		
	}
	@Test
	void checkStartedREadingOnMethod3() {
		Book newBook = new Book("Java Book", "", LocalDate.of(2019, Month.DECEMBER, 31));
		Boolean successMessage = newBook.startedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, true);
		
		
	}
	
	
	@Test
	void checkfinishedREadingOnMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MARCH, 8));
		Boolean successMessage = newBook.finishedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, true);	
	}
	@Test
	void checkfinishedREadingOnMethod2() {
		Book newBook = new Book("", "", LocalDate.of(2009, Month.MAY, 8));
		Boolean successMessage = newBook.finishedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage,true);	
	}
	
	@Test
	void checkHashCodeMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.hashCode();
		
		assertEquals(outputCode, 701816346);	
	}
	@Test
	void checkHashCodeMethod2() {
		Book newBook = new Book("Testing Book", "Tanvir", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.hashCode();
		System.out.println(outputCode);
		assertEquals(outputCode, -246180605);	
	}
	
	
	
	@Test
	void checkToStringMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		String  outputCode = newBook.toString();
		
		assertEquals(outputCode, "Book{title='Java Book', author='rakib', publishedOn=2019-05-08}");	
	}
	@Test
	void checkToStringMethod2() {
		Book newBook = new Book("Java Book", "", LocalDate.of(2019, Month.MAY, 8));
		String  outputCode = newBook.toString();
		
		assertEquals(outputCode, "Book{title='Java Book', author='', publishedOn=2019-05-08}");	
	}
	@Test
	void checkCompareToMethod1() {
		Book newBook2 = new Book("HTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.compareTo(newBook2);
		
		assertEquals(outputCode, 2);	
	}
	@Test
	void checkCompareToMethod2() {
		Book newBook2 = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.compareTo(newBook2);
	
		assertEquals(outputCode, -48);	
	}
	
	@Test
	void checkCompareToMethod3() {
		Book newBook = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		Book newBook2 = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.compareTo(newBook2);
		
		assertEquals(outputCode, 48);	
	}
	@Test
	void getAuthor1() {
		Book newBook = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		newBook.setAuthor("Rex");
		String  outputCode = newBook.getAuthor();
		System.out.println(outputCode);
		assertEquals(outputCode, "Rex");	
	}
	@Test
	void getAuthor2() {
		Book newBook = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		newBook.setAuthor("Rex");
		String  outputCode = newBook.getAuthor();
		System.out.println(outputCode);
		assertNotEquals(outputCode, "ReX");	
	}
	@Test
	void getTitle1() {
		Book newBook = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		newBook.setTitle("C++ Book");
		String  outputCode = newBook.getTitle();
		System.out.println(outputCode);
		assertEquals(outputCode, "C++ Book");	
	}
	@Test
	void getTitle2() {
		Book newBook = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		newBook.setTitle("C++ Book");
		String  outputCode = newBook.getTitle();
		System.out.println(outputCode);
		assertNotEquals(outputCode, "C+ Book");	
	}
	
	@Test
	void getPublishedOn1() {
		Book newBook = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		newBook.setPublishDate(LocalDate.of(2019, Month.MAY, 8));
		int local   = newBook.getPublishedOn();
		//System.out.println(outputCode);
		assertEquals(local, 2019);	
	}
	@Test
	void getPublishedOn2() {
		Book newBook = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		newBook.setPublishDate(LocalDate.of(2019, Month.MAY, 8));
		int local   = newBook.getPublishedOn();
		//System.out.println(outputCode);
		assertNotEquals(local, 20199);	
	}
	
	
	
	
	
	
}
