public class majority {
    public static int findMajority(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
               if(nums[i]==nums[j]){
                count+=1;
               }
            }
            if(count>n/2){
                 return nums[i];
            }
        }
        return -1;
    }
    public static int countInversion(int nums[]){
        int n=nums.length;
        int inverseCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j] && i<j){
                    System.out.print("("+nums[i]+","+nums[j]+")");
                    inverseCount++;
                }
            }
              System.out.println();
        }
         return inverseCount;
    }
    public static void main(String[] args) {
        int nums[]={5,3,2,6,8,1};
        System.out.println(countInversion(nums));
        
    }
    
}
