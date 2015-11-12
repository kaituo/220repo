public class BinarySearch {
    public static void main(String[] args)
    {
        (new BinarySearch()).bsearch(null, -1); 
    }

    public int bsearch(int[] array, int taget) {
        int low = 0;
        int high = array.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(array[mid]==target)
                return mid;
            else if(array[mid]<target) {
                low = mid+1;
            }
            else
		high = mid-1;
         }
         //return -1;
         throw new RunTimeException("no target exist.");
     }
}
