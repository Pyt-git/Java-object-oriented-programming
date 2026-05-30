import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class BookTest {

  void testConstructorInitializesFields() {
    Book b = new Book("Harry Potter", 350);
    assertEquals("Harry Potter", b.title);
    assertEquals(350, b.pages);
  }

  void testTotalPagesSingleBook() {
    ArrayList<Book> list = new ArrayList<>();
    list.add(new Book("Book A", 120));

    int result = Book.totalPages(list);
    assertEquals(120, result); 
  }

   void testTotalPagesMultipleBooks() {
    ArrayList<Book> list = new ArrayList<>();
    list.add(new Book("Book A", 100));
    list.add(new Book("Book B", 279));
    list.add(new Book("Book C", 104));
    
    int result = Book.totalPages(list);
    assertEquals(483, result);
   }

   void testEmptyList() {
     ArrayList<Book> list = new ArrayList<>();

     int result = Book.totalPages(list);
     assertEquals(0, result);
   }
}

  
