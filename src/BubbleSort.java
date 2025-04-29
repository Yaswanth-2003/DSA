public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={9,7,5,3,1};
        System.out.println("before sorting");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int temp=0;
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                     temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
