import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FactRev
//  Description     :   Accept number from user and display its factors in decreasing order
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
//////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void FactRev(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = (iNo/2);iCnt >0 ;iCnt--)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt+" ");
            }
        }
    }
}

class program12
{
    public static void main(String args[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.FactRev(iValue);

    }
}