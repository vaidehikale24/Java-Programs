import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Display "Hello" if accepted number from user is less than 10 otherwise "Demo"
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
/////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void Display(int iNo)
    {
    
        if(iNo < 0)
        {
            System.out.print("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}

class program8
{
    public static void main(String args[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Display(iValue);

    }
}