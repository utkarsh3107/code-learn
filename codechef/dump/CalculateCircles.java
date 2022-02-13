public class CalculateCircles{

    public static void main(String[] args){
        for(int i = 3; i <= 6; i++){
            for(int j = 0;j<=12;j++){
                for(int k=1;k<= (j+i) ;k++)
                    System.out.println("For N = "+i+", M = "+j+", L = "+k+"---->"+passCount(i,j,k));
            }
        }
        
    }

    public static int passCount(int input1,int input2,int input3)
    {
        if(input1 < 3 || input2 < 3 || input3 <= 0 || input1 > 1000 || input2 > 1000)
            return -1;
            
        if(input1 % 2 == 0)
            return calculateEven(input1,input2,input3);
        else
            return calculateOdd(input1,input2,input3);
    }
    
    public static int calculateOdd(int N,int M,int L){
        if(N == L || N % L == 0 || L % N == 0)
            return M -1 ;
        else if(N == M)    
            return (N - 1) * M;
        else
            return (M-1) * N;
            
    }
    
    public static int calculateEven(int N,int M,int L){
        if((N == L) || ((L/N) == 0))
            return M - 1;
        else if((N/2) == L)
            return 2 * (M - 1);
        else
            return (M - 1) * N;
    }
}