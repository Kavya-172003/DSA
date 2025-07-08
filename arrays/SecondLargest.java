package arrays;

import java.util.Arrays;

public class SecondLargest {
    int secondlargest(int a[], int n) {
        Arrays.sort(a);
        int max = a[n - 1];
        int min = a[0];
      for (int i = 0; i < n; i++) {
            if (a[i] > min && a[i] < max) {
                min = a[i];
            }
        }
        if(min<max)
        {
            return min;
        }
        else
        {
        return -1;
        }++++++++++

    }
    public static void main(String[] args) {
        int a[] = { 10,10,8,10 };
        int n = a.length;
        SecondLargest obj = new SecondLargest();
       int result= obj.secondlargest(a, n);
       System.out.println(result);

    }

}
