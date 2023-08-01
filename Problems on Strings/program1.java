import java.util.*;

//////////////////////////////////////////////////////////////////
//
//  Function Name   :   Accept
//  Description     :   Accept name from user and print that name 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//  
//////////////////////////////////////////////////////////////////

class StringX
{
    public void Accept(String name)
    {
        System.out.println("Your name is :"+name);
    }
}

class program1 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String Name = sobj.nextLine();

        StringX obj = new StringX();

        obj.Accept(Name);
    }
}
