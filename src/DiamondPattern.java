public class DiamondPattern {
    public static void main(String[] args) {
        char inputLetter = 'H';
        int totalRowCount = (inputLetter-'A' + 1) * 2 - 1;
        int halfRowCount = inputLetter -'A' + 1;
//        System.out.println(totalRowCount);
//        System.out.println(halfRowCount);
        char letter = 'A';
        int c_c = 1;
        int starting_space = halfRowCount-1;
        for(int r = 1; r <= totalRowCount; r++){
            for(int startSpace = 1; startSpace <= starting_space; startSpace++){
                System.out.print(" ");
            }
            for(int c = 1; c <= c_c; c++){
                if(c == 1 || c == c_c){
                    System.out.print(letter);
                }else{
                    System.out.print(" ");
                }
            }

            if(r < halfRowCount){
                starting_space--;
                c_c += 2;
                letter++;
            }else{
                starting_space++;
                c_c -= 2;
                letter--;
            }
            System.out.println();

        }
    }
}
