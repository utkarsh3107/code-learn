public class StringReplacer{

    public static void main(String[] args){
        String value = "this is just some string";
        convertString(value);
    }


    public static void convertString(String givenInp){
        String[] strArray = givenInp.split(" ");
        
        for(String each : strArray){
            char ch = (char)converter(each.charAt(0));
            System.out.print(ch);
            System.out.print(each.substring(1,each.length()));
            System.out.print(" ");
        }
    }

    public static int converter(char ch){
        return ch - 32;
    }
}