public class Rectangle {
     float length ;
     float width ;
     public  Rectangle () {
         length = 9;
         width = 5 ;
     }
     public  Rectangle ( float a, float b){
         length = a;
         width = b;
     }
     public  void setLength ( float l){
         l = length;
     }
     public void setWidth ( float w){
         w = width;
     }

     public  double getPerimerter () {
         return  ( width + length ) * 2 ;
     }
    public  double getArea () {
        return  width * length ;
    }
    public String toString (){
         return "Rectangle [ Length = " + length + " width =" + width + "]" ;
    }
}
