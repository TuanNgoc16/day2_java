public class Time {
    int hour;
    int minute ;
    int second ;
    public Time ( int a , int b , int c) {
        if ( a >= 0 && a <= 23){}
        if ( b >= 0 && b <= 59){}
        if ( c >= 0 && c <= 59){}
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
    public int nextSecond ( ) {
        second ++;
        return nextSecond();
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
