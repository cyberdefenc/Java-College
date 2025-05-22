// P6. Find pair of number in given array which has largest sum allover

package Day11;

public class P6_largest_pair_arr_ {
    public static void main(String[] args) {
        int[] arr={1,-2,3,4,-5,0};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }else{
            System.out.println("Largest pair of number in given array is: "+max1+" and "+max2);
            System.out.println("Sum of largest pair of number in given array is: "+(max1+max2));
        }
        
    }
    
}
