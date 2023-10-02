public class ceilingA {
    public static void main(String[] args) {
        char arr[]={'a','d','e','g','k'};
        
    }
    static int ceilingAlpha(int arr[], int target){
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
