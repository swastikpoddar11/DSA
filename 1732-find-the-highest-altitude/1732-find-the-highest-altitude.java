class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int n = gain.length;
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            if(i==0){arr[i]= gain[i];}
            else{arr[i] = arr[i-1]+gain[i];}
        }
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}