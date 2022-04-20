//1.7
public class date {
    int day ;
    int month ;
    int year ;
    public date (int a, int b, int c ) {
        if (a >= 1 && a <= 31) {
        }
        if (b >= 1 && a <= 12) {
        }
        if (c >= 1990 && a <= 9999) {
        }
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

