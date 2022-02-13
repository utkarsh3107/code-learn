/**
 * 
 */
package arrays_and_strings;

/**
 * @author utkarsh
 *
 */
public class OneAway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String b = "apalef";
		String a = "apbef";
		
		System.out.println(setup(a,b));
	}
	
	
	private static boolean setup(String op1, String op2){
		
		if(op1.length() == op2.length()){
			return isReplacement(op1,op2);
		}else if(op1.length() - 1 == op2.length()){
			return isEdited(op1,op2);
		}else if(op2.length() - 1 ==  op1.length()){
			return isEdited(op2,op1);
		}
		
		return false;
	}
	
	
	private static boolean isReplacement(String op1, String op2){
		boolean flag = false;
		int length = 0;
		while(length < op1.length()){
			if(op1.charAt(length) != op2.charAt(length)){
				if(!flag){
					flag = true;
				}else{
					return false;
				}				
			}
			length++;
		}
		
		return true;
	}
	
	private static boolean isEdited(String op1, String op2){
		
		boolean flag = false;
		int index1 = 0, index2 = 0;
		
		while(index1 < op1.length()){
			System.out.println(op1.charAt(index1) +" "+ op2.charAt(index2));
			if(op1.charAt(index1) != op2.charAt(index2)){
				if(!flag){
					flag = true;
					index1++;
					continue;
				}else{
					return false;
				}
			}
			index1++;
			index2++;
		}
		
		return true;
	}
	/*
	private static boolean setup(char[] operand1, char[] operand2){
		int[] op1 = new int[24];
		int[] op2 = new int[24];
		
		int flag = 0;
		for(char each : operand1){
			op1[each - 97] = ++op1[each - 97];
		}
		
		for(char each : operand2){
			op2[each - 97] = ++op2[each - 97];
		}
		
		
		for(int i = 0; i <op1.length;i++){
			flag += Math.abs(op1[i] - op2[i]);
			
			if(flag > 1){
				return false;
			}
		}
		
		return true;
	}*/
	
	

}
