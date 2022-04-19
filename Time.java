public class Time {
    int hour;
    int minute ;
    int second ;
    public Time ( int a , int b , int c) {
        hour = a;
        minute = b ;
        second = c ;
    }
    public int getHour () {
        return  hour ;
    }
    public int getMinute () {
        return  minute ;
    }
    public int getSecond () {
        return  second ;
    }
    public void setHour ( int a) {
        a = hour;
    }
    public void setMinute ( int b) {
        b = minute;
    }
    public void setSecond ( int c) {
        c = second;
    }
    public void setTime ( int a , int b, int c) {
        a = hour;
        b = minute;
        c = second ;
    }
    public String toString () {
        return   hour+ ":" + minute  +":" + second  ;
    }

}
