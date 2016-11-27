import java.util.*;

public class PascalTriangle{

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      for(int i  = 0;i<num;i++){
         int value = 1;
         System.out.format("%"+(num-i)*2+"s","");
         for(int j = 0;j<=i;j++){
            System.out.format("%4d",value);
            value = value *(i-j)/(j+1);
         
         }
         System.out.println();
      
      }   
   
   
   
   }
}