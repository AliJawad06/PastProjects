import java.util.*;
public class Learn {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String strTrans =scan.nextLine();
      String strTrans2 = strTrans;
      List<String>words = new ArrayList<String>();
      List<Integer>numbers = new ArrayList<Integer>();
   
      String space = " ";	
      int sum = 0;
      int c = 0;
      while(strTrans.indexOf(" ") != -1) {
         words.add(strTrans.substring(0,strTrans.indexOf(space)));
         strTrans = strTrans.substring(strTrans.indexOf(space)+1);
         numbers.add(c,0);
         c++;
      }
      
      int hold = 0;
      String str1 = "";
      String str2 = "";
   
      for(int x = 0; x < words.size(); x ++){
         for(int y = x; y < words.size(); y++){
            str1 = words.get(x);
            str2 = words.get(y);
            
            if((str1.compareTo(str2) == 0) && (x - y != 0)){
               numbers.remove(y);
               words.remove(y);
               hold = numbers.get(x);
               hold++;
               numbers.set(x,hold);
            }
         
         }
      }
      int y = 0;
      List <String> phrases = new ArrayList<String>();
      List<Integer> numpa = new ArrayList<Integer>();
      for (int z = 0; z < words.size(); z++){
         y = numbers.get(z);
         y++;
         numbers.set(z,y + 1);
         System.out.println(words.get(z) + ":" + numbers.get(z));
      }     
      for(int x = 0; x < words.size(); x ++ ){
         if(numbers.get(x) - 1 > 0){
            str1 = words.get(x);
            phrases.add(str1);
            numpa.add(numbers.get(x));
         
         } 
      
      }  
   
      List<String> actPhrase = new ArrayList<String>();
      String longPhrase = "";
      String strWord = "";
    
       
       
       
        
   }
}


