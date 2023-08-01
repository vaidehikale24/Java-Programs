import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Function Name   :   Check
//  Description     :   Accept and Check if number is divisible by 5
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
/////////////////////////////////////////////////////////////////

class Numbers
{
    public boolean Check(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program4
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue = sobj.nextInt();
        
        Numbers nobj = new Numbers();
        bRet = nobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not Divisible by 5");
        }
    }
}