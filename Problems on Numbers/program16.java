import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   ChkGreater
//  Description     :   Accept one number from user and check whether that 
//                      number is greater than 100 or not.
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//  
//////////////////////////////////////////////////////////////////////////


class Numbers
{
    public boolean ChkGreater(int iNo)
    {
        if(iNo > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program16
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        bRet=nobj.ChkGreater(iValue);

        if(bRet == true)
        {
            System.out.println("Greater");
        }
        else
        {
            System.out.println("Smaller");
        }

    }
}