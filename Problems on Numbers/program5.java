import java.util.*;

/////////////////////////////////////////////////
//
//  Function Name   :   Accept
//  Description     :   Display "*" for 5 times
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
/////////////////////////////////////////////////

class Numbers
{
    public void Accept(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = 1;iCnt <= 5;iCnt++)
        {
            System.out.print("* ");
        }
    }
}

class program5
{
    public static void main(String args[])
    {
        int iValue = 5;

        Numbers nobj = new Numbers();
        nobj.Accept(iValue);

    }
}