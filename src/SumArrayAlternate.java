public class SumArrayAlternate {
    public static void main(String[] args) {
        int arr1[] = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int arr2[] = {7, 8, 4, 6, 2, 1, 9, 9, 7};
        long num1 = number(arr1);
        long num2 = number(arr2);
        long total = num1 + num2;
        long totalRev = numberReverse(total);
        printReverse(totalRev);
    }

    public static long number(int arr[]){
        long num = 0;
        for(int i = 0; i < arr.length; i++){
            num = num * 10 + arr[i];
        }
        return num;
    }

    public static long numberReverse(long num){
        long rev = 0;
        while(num != 0){
            long lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        return rev;
    }

    public static void printReverse(long num){
        while(num != 0){
            long lastDigit = num % 10;
            num = num / 10;
            System.out.print(lastDigit);
        }

    }
}
