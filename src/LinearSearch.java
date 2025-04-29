public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11};
        int target=11;
        int result=linear(arr,target);
        System.out.println("ELEMENT FOUND AT INDEX:"+result);
    }
    public static int linear(int arr[],int target)
    {
        for(int n=0;n<=arr.length-1;n++)
        {
            if(arr[n]==target)
            {
                return n;
            }
        }
        return -1;
    }

}
