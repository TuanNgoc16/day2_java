
public class Line {
    Line begin, end;

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Line(x1, y1);
        end = new Line(x2, y2);
    }

    public Line(Line begin, Line end) {
        this.begin = begin;
        this.end = end;
    }

    public Line getBegin() {
        return begin;
    }

    public Line getEnd() {
        return end;
    }

    public void setBegin(Line begin) {
        this.begin = begin;
    }

    public void setEnd(Line end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndy(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y); }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    public String toString () {
        return "line [ begin =" + begin + ",end =" + end + "]";
    }
    public double getLenght () {
        return  begin.distance (end);
    }


    public Object getLength() {
    }
}
*/

