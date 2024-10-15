package Module303_7;

public class MInMaxArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,-1};
        int min=arr[0];
        int max=arr[0];
        for(int v:arr){
            if(v<min){
                min=v;
            }
            if(v>max){
                max=v;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
