package codemonk.stackqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LittleMonkandGobletofFire {

	private static QueueImpl<String> A;
	private static QueueImpl<String> B;
	private static QueueImpl<String> C;
	private static QueueImpl<String> D;
	private static List<String> computer = new ArrayList<String>();
	private static int counter = 0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Q = Integer.parseInt(br.readLine());
		A = new QueueImpl<>(50000);
		B = new QueueImpl<>(50000);
		C = new QueueImpl<>(50000);
		D = new QueueImpl<>(50000);
		
		for(int i=0;i<Q;i++){
			boolean flag1=false,flag2=false,flag3=false,flag4=false;
			int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
			String[] line = br.readLine().split(" ");
			String idetifier, x ="", y="";
			idetifier = line[0];
			if(line.length > 1){
				x = line[1];
				y = line[2];	
				if(!flag1 && x.equals("1")) count1 = i;
				if(!flag2 && x.equals("2")) count2 = i;
				if(!flag3 && x.equals("3")) count3 = i;
				if(!flag4 && x.equals("4")) count4 = i;
			}
			
			if(idetifier.equals("E")){
				inrementStack(idetifier,x,y);
			}else{
				popElements();
			}
		}
	}
	
	
	private static void inrementStack(String identifier,String x,String y){
		switch(x){
			case "1" : A.enque(x+" "+y);computer.add("a");break;
			case "2" : B.enque(x+" "+y);computer.add("b");break;
			case "3" : C.enque(x+" "+y);computer.add("c");break;
			case "4" : D.enque(x+" "+y);computer.add("d");break;
		}
	}
	
	private static String popElements(){
		return computer.get(counter);
	}

}
