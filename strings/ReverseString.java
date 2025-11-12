public class ReverseString {

    public static void main(String[] args) {
        String ans = reverseWords("a good example");
        System.out.println(ans);
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        reverse(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) 
                sb.append(" ");
        }
        return sb.toString();
    }

    static void reverse(String[] arr) {
        int start = 0, end = arr.length - 1;
        String temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
