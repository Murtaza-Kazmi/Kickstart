/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author Murtaza Kazmi
 */
public class JavaApplication26 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        
        int i = 1;
        while(i <= T){
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[] nums = new int[N];
            for(int j = 0;j < N; j++){
                nums[j] = scan.nextInt();
            }
            
            int max = -1;
            for(int k = 0; k <= 128; k++){
                int sum = 0;
                for(int l = 0; l < N; l++){
                    sum += (nums[l] ^ k);
                }
                if(sum <= M && sum > max){
                    max = k;
                }
            }
            
            System.out.println("Case #" + i + ": " + max);
            
            i++;
        }
        
    }
    
}
