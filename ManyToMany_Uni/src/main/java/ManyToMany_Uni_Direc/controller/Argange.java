package ManyToMany_Uni_Direc.controller;

public class Argange {
//	static void rearrangeArrayElement(int arr[], int n)
//    {
//        int j = 0, temp;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < 0) {
//                if (i != j) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j++;
//            }
//        }
//    }
//    public static void main(String args[])
//    {
//        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
//        int n = arr.length;
// 
//        rearrangeArrayElement(arr, n);
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");}
//    }
    void Argange(int arr[], int n, int sum)
    {
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
 
            if (currentSum == sum) {
                System.out.println("Sum found at indexe " + i);
                return;
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];
 
                    if (currentSum == sum) {
                        System.out.println( "Sum found between indexes " + i + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }
 
    public static void main(String[] args)
    {
    	Argange arraysum = new Argange();
        int arr[] = { 5, 2, 4, 1, 23 };
        int n = arr.length;
        int sum = 6;
        arraysum.Argange(arr, n, sum);
    }

}
