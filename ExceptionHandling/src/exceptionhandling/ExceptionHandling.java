
package exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {
     try{
         int a[]=new int[13];
         a[14]= 13;
    }
     catch(ArrayIndexOutOfBoundException e){
         System.out.println("Asma Mily");
     }
    }
}
