public class orderAgnosticBS {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9,10,22,45,67};
        int arr1[]={67,58,45,37,25,19,14,13,9,7,4,2,0};

        int key = 44;
        int ans = binarySearch(arr,key);
        System.out.println("the element is present at the index:"+ans);
    }
    static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
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
            return -1;

        
        }
        else if (arr[start]>arr[end]){
            while(start<=end){
                int mid = start+(end-start)/2;
                if(target>arr[mid]){
                    end = mid - 1;
                }
                else if(target<arr[mid]){
                    start = mid + 1;
                }
                else return mid;
            }
            return -2;

        }
        return -3;
    }
    
}
