// Leetcode 66

import java.util.*;

// public class PlusOne 
// {
//     public static void calculate(int digits[])
//     {
//         // int digits[] = {9,9,9,9};


//         int l = digits.length;

//         // System.out.println(digits[l-1] + 1);

//         int idx = l-1;
//         int overflow=0;

//         digits[idx] = digits[idx] + 1;

//         while(digits[idx] == 10 && idx != 0)
//         {
//             digits[idx] = 0;

//             idx--;
//             digits[idx] = digits[idx] + 1 ;

//             if(idx == 0)
//             {
//                 if(digits[idx] == 10)
//                 {
//                     ++overflow;
//                     digits[idx] = 0;
//                 }
//             }
//         }

//         if(overflow==1)
//         {
//             int b[] = new int[l+1];
//             b[0] = 1;

//             for(int i=0; i<l+1; i++)
//             {
//                 System.out.print(b[i] + " ");
//             }
//         }

//         else
//         {
//             for(int i=0; i<l; i++)
//             {
//                 System.out.print(digits[i] + " ");
//             }
//         }
        
//     }    

public int[] plusOne(int digits[])
{
    int l = digits.length - 1;

    digits[l]++;

    if(digits[l] > 0)



}

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements you want in an array");
        int l = sc.nextInt();

        int arr[] = new int[l];

        for(int i=0; i<l; i++)
        {
            System.out.println("Enter any element");
            arr[i] = sc.nextInt();
        }

        calculate(arr);
        
    }
}
