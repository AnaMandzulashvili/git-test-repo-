import java.util.Arrays;
import java.util.List;


public class Main {
     public static void main(String[] args) {
     //   initializing array additionResults
         int  [] additionResults;
         additionResults =new int [5];
         additionResults[0]= add(8,15);
         additionResults[1]= add(8,9);
         additionResults[2]=add(3,5);
         additionResults[3]= add(11,6);
         additionResults[4]= add(8,3);

         //   initializing array subtractionResults;

         int [] subtractionResults;
         subtractionResults =new int [5];
         subtractionResults[0]=subtract(8,2);
         subtractionResults[1]= subtract(9,3);
         subtractionResults[2]=subtract(5,8);
         subtractionResults[3]=subtract(5,1);
         subtractionResults[4]=subtract(10,5);




         System.out.println("Printing elements via for loop" + "\n");
         for (int i = 0; i < additionResults.length; i++) {

          //  System.out.print( additionResults[i] + " " );
          System.out.println(additionResults[i]);
         }

         System.out.println("Printing elements via for loop second " + "\n");
         for (int i = 0; i < subtractionResults.length; i++) {

          // System.out.print( subtractionResults[i] + " " );
          System.out.println(subtractionResults[i]);
         }
         int x =0;
         while (x<additionResults.length){
             System.out.print( additionResults[x] + " " );
             x++;}

         while (x<subtractionResults.length){
             System.out.print( subtractionResults[x] + " " );

         }
         for (int i=0 ; i < additionResults.length; i++) {
             if(additionResults[i]%2!=0){ System.out.println("even"+ additionResults[i]);
             } else   System.out.println("odd" + additionResults[i]);}

     }
// initializing add function
         public static int add(int x, int y){
             int sum = x + y;
             return sum;
         }
    // initializing subtract function
        public static int subtract(int x,int y) {
          int minus = x- y;
          return minus;

        }

    }
