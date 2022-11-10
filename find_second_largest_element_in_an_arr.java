import java.util.Scanner;

class s1 {

    public static void sum(int a[], int b) {
        int first = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
        for (int i = 0; i < b; i++) {
            if (a[i] > first) { // greatest value
                sec = first;
                first = a[i];
            }
            if (sec > a[i] || a[i] != first) {/*
                                               * second greatest value by if second value is greater than
                                               * value first value arr value gets stored
                                               */
                sec = a[i];
            }
        }
        System.out.println(first + " " + sec);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int b = sc.nextInt();
        System.out.println("enter the elements of the array:");
        int a[] = new int[100];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        sum(a, b);
    }
}