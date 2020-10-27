package junitjava.logic;

public class Calculation {

    public static int findMax(int arr[]){

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }

        return max;
    }

    public static long findCube(long number){

        return number * number * number;
    }

    public static String reverseString(String str){

        char arr[] = str.toCharArray();
        String s = "";
        for(int i = arr.length - 1; i >= 0; i--){
            s = s + arr[i];
        }

        return s;
    }
}
