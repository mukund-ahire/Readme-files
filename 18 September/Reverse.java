public class Reverse {

    //To reverse an array 
    void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9};
        Reverse obj = new Reverse();
        obj.reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }       

    }

}
