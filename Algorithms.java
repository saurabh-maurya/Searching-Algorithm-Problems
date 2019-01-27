
package algorithms;

import java.util.Arrays;


public class Algorithms {
    
    void maxMin(){
        /*
        Maximum and minimum of an array using minimum number of comparisons
        */
        int arr[]={1000, 11, 445, 1, 330, 3000};
        int max,min;
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }
        else{
            max=arr[1];
            min=arr[0];
        }
        for(int i =2;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max : "+max+" Min : "+min);
    }
    
    void twoSmallest(){
    /*
        
    */
    
    int arr[]={12, 13, 1, 10, 34, 1};
    int firstSmallest=arr[0];
    int secondSmallest=arr[1];
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]<firstSmallest){
            secondSmallest=firstSmallest;
            firstSmallest=arr[i];
        }
        else if(arr[i]<secondSmallest && arr[i]!=firstSmallest){
            secondSmallest=arr[i];
        }
    }
        System.out.println("Two Smallest No. : "+firstSmallest+" , "+secondSmallest);
    
    }
    
    void sumClosestToZero(){
        /*
        An Array of integers is given, both +ve and -ve.
        You need to find the two elements such that their sum is closest to zero.
        For the below array, program should print -80 and 85.
        */
        
        int arr[]={1, 60, -10, 70, -80, 85};
        Arrays.sort(arr);
        int start=0,min_start=start;
        int end=arr.length-1,min_end=end;
        int sum = 0,min_sum=99999;
        
        while(start<end){
            sum=arr[start]+arr[end];
            if(Math.abs(sum) < Math.abs(min_sum)){
                min_sum=sum;
                min_start=start;
                min_end=end;
            }
            if(sum<0)
                start++;
            else
                end--;
        }
        System.out.println("No. are : "+arr[min_start]+" + "+arr[min_end]+" = "+min_sum);
        
    }
    
    void missingNumber(){
        /*
        You are given a list of n-1 integers and these integers are in the range of 1 to n.
        There are no duplicates in list. 
        One of the integers is missing in the list.
        */
        int range=7; //give range of number
        int arr[]={2,5,3,4,1,6}; //array with missing no.
        int n=0,sumArr=0;
        n=range*(range+1)/2; //formula for sum of n numbers
        for(int i=0;i<arr.length;i++){
            sumArr+=arr[i];
        }
        System.out.println("missing no : "+(n-sumArr));
              
    }
    
    public static void main(String[] args) {
      Algorithms algorithms = new Algorithms();
      //algorithms.missingNumber();
      //algorithms.sumClosestToZero();
      //algorithms.twoSmallest();
      algorithms.maxMin();
    }
    
}
