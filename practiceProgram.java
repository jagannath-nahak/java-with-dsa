public class practiceProgram {
    public static void printPairs(int numbers[]){
         int n=numbers.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void printSubarraySum(int numbers[]){
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int start=0;start<numbers.length;start++){
            for(int end=start;end<numbers.length;end++){
                int subarraysum=0;
                subarraysum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                System.out.println(subarraysum);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        printSubarraySum(numbers);      
    }
}
