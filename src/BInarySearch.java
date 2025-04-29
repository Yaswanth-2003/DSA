public class BInarySearch {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11};
        int target=7;
        int result=Binary(arr,target);
        System.out.println("ELEMENT FOUND AT INDEX:"+result);
    }
    public static int Binary(int arr[], int target)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                left=mid-1;
            }
        }
        return -1;
    }

}
