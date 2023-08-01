import java.util.*;

//////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Input           :   21   3
//  Output          :   21   21  21
//  Description     :   Accept two numbers n1 and n2. Print n1 for n2 times.
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
//////////////////////////////////////////////////////////////////////////


class Numbers
{
    public void Display(int iNo,int iFreq)
    {
        int iCnt = 0;
    
        for(iCnt = 1;iCnt <= iFreq;iCnt++)
        {
            System.out.print(iNo+" ");
        }
    }
}

class program9
{
    public static void main(String args[])
    {
        int iValue = 0,iCount = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        System.out.println("Enter the frequency : ");
        iCount = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Display(iValue,iCount);

    }
}