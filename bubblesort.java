public class bubblesort {
    public static void bubblesort1(int nums[]){
        int n=nums.length;
        for(int turn=0;turn<n;turn++){
                for(int j=0;j<n-turn-1;j++){
                    if (nums[j]>nums[j+1]) {
                       int temp=nums[j];
                       nums[j]=nums[j+1];
                       nums[j+1]=temp;
                    }
                }
            }
    }
    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(nums[minPos]>nums[j]){
                    minPos=j;
                }
            }
            int temp=nums[minPos];
            nums[minPos]=nums[i];
            nums[i]=temp;
        }
    }
    public static void insertionSort(int nums[]){
        int n=nums.length;
        for(int i=1;i<n;i++){
            int curr=nums[i];
            int prev=i-1;
            while (prev>=0 && nums[prev]>nums[i]) {
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;

        }
    }
    public static void countingSort(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest, nums[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={9,1,8,2,7,13,12,10,3,6};
         countingSort(nums);
         printArray(nums);

    }
    
}
