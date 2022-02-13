
public class Demo{
    public static void main(String args[]){
        String s ="i am a boy";
        String tmp1 =" " + s;
        String tmp = "";
        
        for(int i=0;i<tmp1.length();i++){
            if(tmp1.charAt(i)==' '){
                tmp += " "+Character.toUpperCase(tmp1.charAt(i+1));
                i++;
            }else{
                tmp=tmp+tmp1.charAt(i);
            } 
              
         }
         System.out.println("Output is:"+tmp);
    }
}