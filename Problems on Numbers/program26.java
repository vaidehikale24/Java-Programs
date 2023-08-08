import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Accept number from user and print it into word
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void Display(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        if(iNo == 0)
        {
            System.out.println("Zero");
        }
        else if(iNo == 1)
        {
            System.out.println("One");
        }
        else if(iNo == 2)
        {
            System.out.println("Two");
        }
        else if(iNo == 3)
        {
            System.out.println("Three");
        }
        else if(iNo == 4)
        {
            System.out.println("Four");
        }
        else if(iNo == 5)
        {
            System.out.println("Five");
        }
        else if(iNo == 6)
        {
            System.out.println("Six");
        }
        else if(iNo == 7)
        {
            System.out.println("Seven");
        }
        else if(iNo == 8)
        {
            System.out.println("Eight");
        }
        else if(iNo == 9)
        {
            System.out.println("Nine");
        }
        else if(iNo == 10)
        {
            System.out.println("Ten");
        }
        else
        {
            System.out.println("Invalid Number");
        }

    }
}

class program26
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Display(iValue);

    }
}