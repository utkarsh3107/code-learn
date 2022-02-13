/**
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

 

Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1
 */
package leetcode;

public class FirstBadVersion{

    private int bad;

    private int n;

    public FirstBadVersion(int n, int bad){
        this.bad = bad;
        this.n = n;
    }
    public static void main(String[] args){
        int n = 2126753390;
        int bad = 1702766719;
    
        FirstBadVersion obj = new FirstBadVersion(n, bad);
        System.out.println(obj.firstBadVersion(n));
    }

    public int firstBadVersion(int n) {
        return (int)binarySearch(1, n);
      }
  
      private long binarySearch(long leftIndex, long rightIndex){
          try{
            long mid = (leftIndex + rightIndex) / 2;
            System.out.println("leftIndex:" + leftIndex + ", rightIndex:" + rightIndex + ", mid:" + mid);
            
            if(leftIndex >= rightIndex){
                if(isBadVersion((int)rightIndex)){
                    return rightIndex;
                }else{
                    return rightIndex +  1;
                }
            }else if(isBadVersion((int)mid)){
                 return binarySearch(leftIndex, mid - 1);
            }else{
                return binarySearch(mid + 1, rightIndex);
            }
          }catch(Exception ex){
            throw ex;
          }
         
      }

    public boolean isBadVersion(int version){
        if(version >= this.bad){
            return true;
        }

        return false;
    }
}