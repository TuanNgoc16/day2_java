public class TestLabeBreak {
public static void  main (String[] args){
    int i;
    outer:
    for (i = 0; i <5; i ++){
        System.out.println("Hello");
        break outer;}
        System.out.println("This is the outer loop.");
    }

}
//
