/*
public static class Square{

  public static void drawLine(int x1, int y1, int x2, int y2){
  }

  public static void drawSquare(int x, int y, int len){
    if(x + len > 10 && y -len < 0){
      len = Math.min(10-x, y);
    }else if (x + len > 10){
      len = 10-x; 
    }else if(y - len < 0){
      len = y;
    }

  drawLine(x, y, x+len, y);
  drawLine(x, y, x, y-len);
  drawLine(x, y-len, x+len, y-len);
  drawLine(x+len, y-len, x+len, y);
  int area = len * len;
  System.out.println(String.format("Side Length = %d, Square Area = %d", len, area));
  } 
}
*/