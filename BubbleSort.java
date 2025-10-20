import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={9,2,3,5,2,53,1};
            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            Boolean swapped=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }

            if(!swapped)
            {
                break;
            }
        }
    }
}
