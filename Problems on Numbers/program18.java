import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Multiply
//  Description     :   Accept three numbers from user and prints its multiplication 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public int Multiply(int iNo1,int iNo2,int iNo3)
    {
        if(iNo1 == 0  && iNo2 == 0 && iNo3 == 0)
        {
            return 0;
        }
        if(iNo1 == 0)
        {
            iNo1 = 1;
        }
        if(iNo2 == 0)
        {
            iNo2 = 1;
        }
        if(iNo3 == 0)
        {
            iNo3 = 1;
        }
        return iNo1*iNo2*iNo3;

    }
}

class program18
{
    public static void main(String args[])
    {
        int iValue1 = 0,iValue2 = 0,iValue3 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the num1 : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the num2 : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter the num2 : ");
        iValue3 = sobj.nextInt();

        Numbers nobj = new Numbers();
        iRet=nobj.Multiply(iValue1,iValue2,iValue3);

        System.out.println("Multiplication : "+iRet);

    }
}