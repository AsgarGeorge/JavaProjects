public class ceiling {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9,10,22,45,67};
        int target = 44;
        int ans = ceilingBs(arr, target);
        System.out.println(ans);
        System.out.println(arr[ans]);

    }
    static int ceilingBs(int arr[], int target){
        int start=0;
        int end= arr.length-1;
        if (target >=arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else return mid;
    }
        return start;

}
}
