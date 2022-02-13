package hacker_earth.interview.gainsight;

public class Test1 {

	public static void main(String[] args) {
		String x  = "ffffasdasdasdasdff";
		String[] arr = {x};
		stringSimilarity(arr);
		System.out.println(count(x));
		solve2(x);
		System.out.println(finalM(arr)[0]);
		System.out.println(calculate(x));
		
		
	}
	
	public static int calculate(String s){
		char[]arr=s.toCharArray();
		int length=arr.length;
		int count=length;
		for(int i=1;i<length;i++){
			int len=length-i;
			int j=0;
			for(;j<len;j++)
				if(arr[j]!=arr[j+i]){
					break;
				}
			count+=j;
		}
		return count;
	}
	
	static int[] finalM(String[] inputs) {
        int[] total = new int[inputs.length];
        int counter = 0;
        for(String each : inputs){
            char[] charArr = each.toCharArray();
            int tCount = charArr.length;
            
            for(int i = 1; i <charArr.length;i++){
                int temp = 0;
                for(int j = i; j <charArr.length ; j++){
                    if(charArr[j-i] == charArr[j]){
                        temp++;
                    }else{
                        break;
                    }
                }
                tCount += temp;
            }
            total[counter] = tCount;
        }
        return total;
    }
	
    static int[] stringSimilarity(String[] inputs) {
    	int[] total = new int[inputs.length];
    	int counter = 0;
        for(String each : inputs){
        	 char[] charArr = each.toCharArray();
        	 int totalCount = charArr.length;
        	 for (int i = 1; i < charArr.length; i++) {
        		 int tempCount = 0;
        		 for (int j = i; j < charArr.length; j++) {
        			 if (charArr[j - i] == charArr[j]) {
        				 tempCount++;
        	         }else{
        	        	 break;
        	         }
        		 }
        		 totalCount = totalCount + tempCount;
        	 }
        	 System.out.println(totalCount);
        	 total[counter] = totalCount;
        }
        return total;
    }

    private static void solve2(final String input) {
        int total = 0;
        final char[] inputArray = input.toCharArray();
        for (int i = 1; i < inputArray.length; i++) {
            int count = 0;
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[j - i] != inputArray[j]) {
                    break;
                }
                count++;
            }
            total = total + count;
        }
        System.out.println(total + inputArray.length);
    }
    
    
    private static int count(String input) {
        int c = 0, j;
        char[] array = input.toCharArray();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n - i && i + j < n; j++)
            if (array[i + j] != array[j])
                break;
            c+=j;
        }
        return c;
        }
}
