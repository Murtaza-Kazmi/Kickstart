/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickstartroundgq3.practise;

import java.util.Scanner;

/**
 *
 * @author Murtaza Kazmi
 */
public class KickstartRoundGQ3Practise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        int i = 1;
        while(i <= T){
            int N = scan.nextInt();
            int H = scan.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            
            for(int k = 0; k < N; k++){
                A[k] = scan.nextInt();
            }
            
            for(int k = 0; k < N; k++){
                B[k] = scan.nextInt();
            }
           
            System.out.println("Case #" + i + ": "+ func(A,B, 0,0,H,H,N));
            i++;
        }
    }

    private static int func(int[] A, int[] B, int i, int j, int H,int H2, int N) {
        
        if(N == 0) {
            if(H <= 0 && H2 <= 0) return 1;
            return 0;
        }
        
        if(i >= A.length && j >= B.length){
            if(H <= 0 && H2<= 0) return 1;
            return 0;
        }
        
        if(i >= A.length && !(j >= B.length)){
            return func(A,B, i,j+1,H, H2-B[j], N-1);
        }
        if(!(i >= A.length) && j >= B.length){
            return func(A,B, i+1,1,H-A[i], H2, N-1);
        }
        
        
        return func(A,B, i+1, j+1, H-A[i], H2 - B[j], N-1) + func(A,B, i+1, j, H-A[i],H2, N-1)
+ func(A,B, i,j+1,H,H2-B[j], N-1);    }
    
}
