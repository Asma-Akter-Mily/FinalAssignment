/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mily
 */
public class Employee{
    float salary= 40000;
}
class Programme implement  Employee{
    int bonus=10000;
    public static void main(String arg[]){
        programmer p=new programmer();
        System.out.println("Programmer Salary is : "+p.salary);
    }
}
