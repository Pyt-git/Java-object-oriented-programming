public class Book {
  String title; 
  int pages; 

  public Book(String t, int p) {
    title = t;
    pages = p; 
  }

  public static int totalPages(ArrayList<Book> list) {
    int sum = 0;

    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i).pages; 
    }
    return sum;
  }
}
