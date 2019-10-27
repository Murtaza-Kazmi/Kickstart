
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murtaza Kazmi
 */
public class Solution{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        int i = 1;
        while(i <= T){
            
            int N = scan.nextInt();//pgs
            int M = scan.nextInt();//torn out
            int Q = scan.nextInt();//readers
            
            ArrayList<Integer> tornout = new ArrayList();
            for(int j = 0; j < M; j++){
                tornout.add(scan.nextInt());
            }
            int z = 0;
            int count = 0;
            while(z < Q){
                int multiple  = scan.nextInt();
                
                for(int  k= 1; multiple * k <= N; k++){
                    int s = multiple * k;
                    if(s <= N && !tornout.contains(s)){
                        count++;
                    }
                }
                z++;
            }
            
            System.out.println("Case #" + i + ": " + count);
            i++;
           
        }
    }
}