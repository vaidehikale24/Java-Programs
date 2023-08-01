import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   ChkEqual
//  Description     :   Accept two numbers from user and check whether numbers are equal or 
//                      not.
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//  
//////////////////////////////////////////////////////////////////////////


class Numbers
{
    public boolean ChkEqual(int iNo1,int iNo2)
    {
        if(iNo1 == iNo2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program17
{
    public static void main(String args[])
    {
        int iValue1 = 0,iValue2 = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the num1 : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the num2 : ");
        iValue2 = sobj.nextInt();

        Numbers nobj = new Numbers();
        bRet=nobj.ChkEqual(iValue1,iValue2);

        if(bRet == true)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }

    }
}