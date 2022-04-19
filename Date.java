//1.7
public class Date {
    int day ;
    int month ;
    int year ;
    public Date (int a, int b, int c ){
        day = a;
        month = b ;
        year = c ;
    }
    public int getDay () {
        return day;
    }
    public int getMonth () {
        return month;
    }
    public int getYear () {
        return year;
    }
    public void setDay(int a){ a = day;}
    public void setMonth ( int b) {
        b = month;
    }
    public void setYear (int c) {c = year;}
    public void setDate (int a,int b, int c) {a = day; b =month ; c = year;}
    public String toString () {
        return  + day+ " / " + month  +" / " + year  ;
    }
}
