public class task5 {

    public static void main(String[] args) {

        // Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int[] arr = new int[5];

        arr[0] = 15;
        arr[1] = 18;
        arr[2] = 13;
        arr[3] = 19;
        arr[4] = 10;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];
        }

        System.out.println("The sum of elements in the array is: "+sum);
    }
}
