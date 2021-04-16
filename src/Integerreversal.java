import java.lang.reflect.Array;
import java.util.Stack;
public class Integerreversal {
    public static Stack<Integer> reverseArray(int[] arr){
        Stack<Integer> arr2 = new Stack<>();
        for (int i=arr.length-1; i >= 0;i--){
            arr2.push(arr[i]);
        }
        return arr2;
    }
    public static void main(String[] args) {
        int []arr = new int[9];
        arr[0]=2;
        arr[1]=44;
        arr[2]=5;
        arr[3]=4;
        arr[4]=76;
        arr[5]=55;
        arr[6]=21;
        arr[7]=42;
        arr[8]=72;
        System.out.println(reverseArray(arr));
    }
}
