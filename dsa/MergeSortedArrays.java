import java.util.*;

class MergeSortedArrays
{
    public static void mergeSort(int arr1[], int arr2[], int m, int n)
    {

        int tot = m+n;
        int newArr[] = new int[tot];


        // int temp;

        System.out.println("Original Array1");
        // for(int i=0; i<tot; i++)
        for(int i=0; i<m; i++)
        {
            System.out.print(arr1[i]  + " ");
        }

        System.out.println();

        System.out.println("Original Array2");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr2[i]  + " ");
        }

        int i=0, j=0, k=0;

        while(i<m && j<n)
        {
            if(arr1[i]>=arr2[j])
            {
                newArr[k++] = arr2[j++];
            }
            else
            {
                newArr[k++] = arr1[i++];
            }
        }

        while(i<m)
        {
            newArr[k++] = arr1[i++];
        }

        while(j<n)
        {
            newArr[k++] = arr2[j++];
        }


        //merging arr2 in arr1
        // int c= 0;
        // while(c<n)
        // {
        //     arr1[m+c] = arr2[c];
        //     ++c;
        // }

        //bubble sort the final merge array
        // for(int i=0; i<tot; i++)
        // {
        //     for(int j=0; j<tot-1-i; j++)
        //     {
        //         if(arr1[j] > arr1[j+1])
        //         {
        //             temp = arr1[j];
        //             arr1[j] = arr1[j+1];
        //             arr1[j+1] = temp; 
        //         }
        //     }
        // }

        //display the merged sorted array
        System.out.println("\nSorted Array");
        for(i=0; i<tot; i++)
        {
            System.out.print(newArr[i]  + " ");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements you want in ARRAY 1");
        int m = sc.nextInt();

        System.out.println("Enter number of elements you want in ARRAY 2");
        int n = sc.nextInt();

        // int arr1[] = new int[m+n];
        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for(int i=0; i<m; i++)
        {
            System.out.println("Enter element of array1:");
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter element of array2:");
            arr2[i] = sc.nextInt();
        }

        mergeSort(arr1, arr2, m, n);

    }
}