import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
   
   
   
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a word: ");
      
      String word = scan.nextLine();
      
      System.out.print("Enter number of lines: ");
      
      
      int n = scan.nextInt();
      int len = word.length();
      int a = 0;

      for(int i=0; i<=n; i++) {
      
        // for space
        for (int j=0; j<=n-i; j++) {
           System.out.print(" "); // print space
        }
        
        
        for(int k=0; k<=i; k++) {
           // print character
           System.out.print(word.charAt(a)+" ");
           a++;

           // if index reach end of string then again
           // it should start from initial characters
           if(a == len) a = 0;
        }
        System.out.println(); // new line
        
        
        
        
        
        
      }
   }
}
