package Java14.ex3;

public class Line {
        Point begin, end;

    public Line(int x1, int x2, int y1, int y2){
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin(){
        return begin;
    }

    void setBegin(Point begin){
        this.begin=begin;
    }

    public Point getEnd(){
        return end;
    }

    void setEnd(Point end){
        this.end=end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    void setBeginX(int x){
        begin.setX(x);
    }

    public int getBeginY(){
        return begin.getY();
    }

    void setBeginY(int y){
        begin.setY(y);
    }

    public int[] beginXY(){
        return begin.getXY();
    }

    void setBeginXY(int x, int y){
        begin.setXY(x, y);
    }

    public int getEndX(){
        return end.getX();
    }

    void setEndX(int x){
        end.setX(x);
    }

    public int getEndY(){
        return end.getY();
    }

    void setEndY(int y){
        end.setY(y);
    }

    public int[] getEndXY(){
        return end.getXY();
    }

    void setEndXY(int x, int y){
        end.setXY(x, y);
    }

    public String toString(){
        return "Line[begin=" + begin + ", end=" + end + "]";
    }

    public double getLength(){
        return begin.distance(end);
    }
}
