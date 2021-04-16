import java.util.Stack;
public class Stringreversal {
    public static Stack<String> reverseArray(String mWord ){
        Stack<String> wStack   = new Stack<String>();
        String[] arr = mWord.split("\\s");
        for (int i=arr.length-1;i>=0;i--){
            wStack.push(arr[i]);
        }
        return wStack;
    }
    public static void main(String[] args) {
        String mWord = "Dang Anh Dong";
            System.out.println(reverseArray(mWord));
    }
}
