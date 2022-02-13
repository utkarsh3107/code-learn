/**
 * Fredo is playing a game. The rules of the game are:
Initially, you are given A units of ammo. There are N obstacles placed on a path. When you hit an obstacle, you gain three units ammo and lose one unit of ammo. When you don't hit an obstacle, you lose one unit ammo. If at any instance, you are left with 0

ammo units, the game ends there.

Fredo has an array Arr
containing N elements corresponding to the N obstacles. If Fredo will hit obstacle i , then Arr[i]=1 else Arr[i]=0

.
Fredo asks you to tell him if he will be able to reach the end of the path. If yes, then also tell him the remaining number of ammo units.
If he is not able to reach the end of the path, tell him the obstacle index at which his game would end.

Note: If Fredo reaches the last obstacle, he is said to reach the end of the path.

Input Format:
The first line consists of an integer T
, denoting the number of test cases.
Each test cases consists of two lines:
The first line consists of two integers A and N, denoting the initial ammo units Fredo has and the number of obstacles respectively.
The second line consists of array Arr

as described in the question.

Output Format:
For each test case:
If he is able to reach the end of the path, print Yes followed by the number of ammo units remaining.
Else print No followed by the index (1 based) of the obstacle at which the game ends.

Input Constraints:
1≤T≤10

1≤A≤105
1≤N≤105
0≤Arr[i]≤1

SAMPLE INPUT

2
5 5
0 0 1 0 1
2 5
0 0 1 0 1

SAMPLE OUTPUT

Yes 6
No 2


 * 
 */
package selfstudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author utkarsh
 *
 */
public class FredoAndGame {

	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0){
            String[] AN = br.readLine().split(" ");
            int A = Integer.parseInt(AN[0]);
            int N = Integer.parseInt(AN[1]);
            
            String[] arr = br.readLine().split(" ");
            int arrP = 0;
            
            while(A > 0 && arrP < N){
                if(arr[arrP].equals("0")){
                    A--; 
                }else{
                    A += 2;
                }
                arrP++;
            }
            
            if(arrP == N){
                System.out.println("Yes " + A);
            }else{
                System.out.println("No " + arrP);
            }
        }   
    }
}
