public class SumArray {
    public static void main(String[] args) {
        int arr1[] = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int arr2[] = {7, 8, 4, 6, 2, 1, 9, 9, 7};
        reverseArray(arr1);
        reverseArray(arr2);
        int maxArrayLength = 0;
        if(arr1.length >= arr2.length){
            maxArrayLength = arr1.length;
        }else{
            maxArrayLength = arr2.length;
        }
        int totalArray[] = new int[maxArrayLength+1];
        int rem = 0;
        int i =0;
        for(; i < maxArrayLength; i++){
            if(i < arr1.length && i < arr2.length){
                int total = numberReverse(arr1[i] + arr2[i] + rem);
//                total = total + rem;
                if((arr1[i] + arr2[i] + rem) == 10){
                    totalArray[i] = 0;
                    rem = 1;
                }else if(total < 10){
                    totalArray[i] = total;
                    rem = 0;
                }else{
                    rem = total % 10;
                    total = total / 10;
                    totalArray[i] = total;
                }
            } else if(i < arr1.length){
                int total = numberReverse(arr1[i] + rem);
                if(arr1[i] + rem == 10 ){
                    totalArray[i] = 0;
                    rem = 1;
                }else if(total < 10){
                    totalArray[i] = total;
                    rem = 0;
                }else{
                    rem = total % 10;
                    total = total / 10;
                    totalArray[i] = total;
                }
            }else if(i < arr2.length){
                int total = numberReverse(arr2[i] + rem);
//                total = total + rem;
                if(arr2[i] + rem == 10 ){
                    totalArray[i] = 0;
                    rem = 1;
                }else if(total < 10){
                    totalArray[i] = total;
                    rem = 0;
                }else{
                    rem = total % 10;
                    total = total / 10;
                    totalArray[i] = total;
                }
            }
        }
        totalArray[i] = rem;

        reverseArray(totalArray);
        printArray(totalArray);
    }

    public static void reverseArray(int[] arr){
        for(int i = 0, j = arr.length-1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int numberReverse(int num){
        int rev = 0;
        while(num != 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        return rev;
    }

    public static void printArray(int[] arr){
        int i = 0;
        if(arr[0] == 0){
            i = 1;
        }
        for(; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }


}
