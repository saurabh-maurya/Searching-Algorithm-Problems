
package algorithms;


public class Algorithms {
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
      algorithms.missingNumber();
    }
    
}
