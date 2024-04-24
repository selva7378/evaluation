public class BitPattern {
    public static void main(String[] args) {
        int matrixSize = 7;
        int matrix[][] = new int[matrixSize][matrixSize];
        int bit = 1;
        int index = 0;
        int end = matrixSize / 2;
        for(int i = 0; i <= end; i++){
            fill(matrix, index, index, bit, matrixSize);
            if(bit == 1){
                bit = 0;
            }else{
                bit = 1;
            }
            index++;
            matrixSize -= 2;
        }
        printArray(matrix);
    }

    public static void fill(int arr[][], int r, int c, int bit, int fillCount){
        for(int i = 0; i < fillCount; i++){
            arr[r][c+i] = bit;
        }
        for(int i = 0; i < fillCount; i++){
            arr[r+i][c] = bit;
        }
        for(int i = 0; i < fillCount; i++){
            arr[r+i][c+fillCount-1] = bit;
        }
        for(int i = 0; i < fillCount; i++){
            arr[r+fillCount-1][c+i] = bit;
        }


    }

    public static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
