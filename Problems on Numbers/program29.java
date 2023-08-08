import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   TableRev
//  Description     :   Accept number from user and display its table.
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void TableRev(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 10;iCnt > 0;iCnt--)
        {    
            System.out.print(iNo*iCnt+" ");    
        }
    }
}

class program29
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.TableRev(iValue);

    }
}