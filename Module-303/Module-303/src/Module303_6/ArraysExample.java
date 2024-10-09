package Module303_6;

public class ArraysExample {

    public static void main(String[] args) {
        int[] numbers=new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=0;
            System.out.print(numbers[i]+" ");
        }
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
        }
        String[] names= {"sushma","pratima","nish"};

        for(int i=0;i<names.length;i++){
            names[i]=""+i;
            System.out.print(names[i]+" ");
        }
    }
}
