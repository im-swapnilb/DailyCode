package code;

public class Extract_Word {


    public static void main(String a[]){
     
        String [] str = "This program splits a string based on space".split(" ");
      //  String[] tokens = str.split(" ");
        for(String s:str){
            System.out.println(s);
        }
    }
}
