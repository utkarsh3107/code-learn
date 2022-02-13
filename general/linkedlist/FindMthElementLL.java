package linkedlist;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindMthElementLL{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),65536);
    
       LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
       list.insertElement(1);
       list.insertElement(2);
       list.insertElement(3);
       list.insertElement(4);
       list.insertElement(5);
       System.out.println(list.printList());
       
       String ch = "N";
       
       do{
           System.out.println("Enter Kth Position");
           int value = Integer.parseInt(br.readLine());
           System.out.println(getElement(list,value));
           System.out.println("Do you wish to continue?");
           ch = br.readLine();
       }while(ch.equals("y"));
    }
    
    public static int getElement(LinkedListImpl<Integer> list , int var){
        LinkedList<Integer> head = list.getListHead();
        LinkedList<Integer> current = null;
        
        if(var == 0)
            return -1;
         
        while(var != 1){
            head = head.getNextNode();
            var--;
        }
        current = list.getListHead();
        
        while(head.getNextNode() != null){
            current = current.getNextNode();
            head = head.getNextNode();     
        }
             
        return current.getData(); 
    }
    
}
