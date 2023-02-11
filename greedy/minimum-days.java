// G4G https://practice.geeksforgeeks.org/problems/f4d22b1f9d62e8bee0ff84e9fa51dc66eb5005ec/1

//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            String S;
            S = br.readLine();
            
            
            int[] P = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.getMinimumDays(N, S, P);
            
            out.println(res);
            
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    
    public static int getMinimumDays(int N, String S, int[] P) {
        
        int doubles = 0;
        char[] chars = S.toCharArray();
        
        for(int i=0; i < N - 1; i++) {
            if(chars[i] == chars[i + 1]) {
                doubles++;
            }
        }
        
        if(doubles == 0)
            return 0;
            
       
        int minDays = 0;
        
        for(int i=0; i < N; i++) {
            
            int in = P[i];
            
            if (in-1 >= 0 && chars[in-1]==chars[in]) {
                doubles--;
            }
            
            if (in+1 < N && chars[in+1]==chars[in]) {
                doubles--;
            }
            
            chars[in]='?';
            
            if(doubles == 0) {
                minDays=i+1;
                break;
            }
        }
        
        return minDays;
    }
}
        
     
