import java.util.*;

class UserInput{
    int[] arrayInput(){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 no.s : ");

        for(int i=0;i<array.length;i++){
            array[i] = scan.nextInt();
        }
        return array;
    }


}