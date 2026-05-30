public class Point {
  int x;
  int y;

  public Point(int h, int v) {
    x = h;
    y = v; 
  }

  public void move(int dx, int dy) {
    x += dx;
    y += dy;
  }

  public void print() {
    System.out.println(x+","+y);
  }
}
