package demo ;
import java.util.* ;
public class practice {
    public  static void rearrange(int[] arr) {

        int n = arr.length ;
  	  ArrayList<Integer> pos = new ArrayList<>();
  	  ArrayList<Integer> neg = new ArrayList<>();
    	for( int i=0 ; i<n ;i++) {
    		if (arr[i] < 0 ) {
    			neg.add(arr[i]);
    		} else {
    			pos.add(arr[i]);
    		}
    		
    	}
    	for( int i=0 ; i< neg.size() ; i++) {
    		      arr[i*2]  = pos.get(i);
    		      arr[i*2 + 1] = neg.get(i);
    	}
    int	index = 4 ;
    	for( int i=2 ; i<pos.size() ; i++) {
                 arr[index] =  pos.get(i);
                 index++ ;
    		
    		
    	}
    	for( int i=0 ; i<arr.length ; i++) {
    	System.out.println(arr[i]);
    	
    	
    	}
    }   	
    public static void main(String args[]){
     int arr[] = {1,2,-4,-5,3,4};
 rearrange(arr);   	
}
}