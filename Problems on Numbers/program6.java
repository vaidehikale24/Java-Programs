import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Display "*" for n times using for loop. Accept n from user 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
/////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void Accept(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            System.out.print("* ");
        }
    }
}

class program6
{
    public static void main(String args[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Accept(iValue);

    }
}