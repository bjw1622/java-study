package test0817;

import java.util.Arrays;

public class ReacArr {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        for(int[] b : a){
            for(int c : b){
                System.out.print(c+" ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(args));
    }
}
