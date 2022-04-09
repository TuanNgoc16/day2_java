public class SumOfNumber {
    public  static  void main (String[] args){
        int num =1, sum =0;
        do {
            sum = sum + sum;
            num++;
        }while (num<10);
        System.out.printf("Sum 10 Numbers : %d\n",sum);
    }
}
