import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Multiply
//  Description     :   Accept total marks and obtained marks from user and calculate percentage 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public float Percentage(int tmarks,int omarks)
    {
        float fResult;
        float t = (float)tmarks;
        float o = (float)omarks;

        fResult = (o/t)*100;

        return fResult;

    }
}

class program19
{
    public static void main(String args[])
    {
        int iValue1 = 0,iValue2 = 0;
        float fRet = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the total marks : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the obtained marks : ");
        iValue2 = sobj.nextInt();

        Numbers nobj = new Numbers();
        fRet=nobj.Percentage(iValue1,iValue2);

        System.out.println("Percentage : "+fRet+" %");

    }
}