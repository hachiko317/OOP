public class MyLine {
     private MyPoint begin;
     private MyPoint end;
   public MyLine(int x1, int y1, int x2, int y2){
       this.begin = new MyPoint(x1,y1);
       this.end = new MyPoint(x2, y2);
   }
   public MyLine(MyPoint begin, MyPoint end){
       this.begin = begin;
       this.end = end;
   }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
       return  begin.getX();
    }
    public void setBeginX(int x){
       begin.setX(x);
    }
   public int getBeginY(){
       return begin.getY();
   }
    public void setBeginY(int y){
        begin.setX(y);
    }
    public int getEndX(){
        return  begin.getY();
    }
    public void setEndX(int y){
        begin.setY(y);
    }
    public int getEndY(){
        return begin.getY();
    }
    public void setEndY(int y){
        begin.setY(y);
    }
    public int[] getBeginXY(){
       int[] arr= new int[2];
       arr[0]=begin.getX();
       arr[1]=begin.getY();
       return arr;
    }
    public int[] getEndXY(){
        int[] arr= new int[2];
        arr[0]=end.getX();
        arr[1]=end.getY();
        return arr;
    }
   public void setBeginXY(int x, int y){
       begin.setX(x);
       begin.setY(y);
   }
    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }
    public double getLength(){
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
   public String toString(){
       return "MyLine[begin= ("+begin.getX()+","+begin.getY()+"), end=("+end.getX()+","+end.getY()+")";
   }

}
