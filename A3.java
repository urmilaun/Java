import java.util.*;

public class A3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 1;
        int iNo2 = 3;
        int iSum = 0;

        System.out.print("CLA are :");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        iNo1 = Integer.parseInt(args[0]);
        iNo2 = Integer.parseInt(args[1]);
        System.out.println();
        System.out.print(iNo1 + " " + iNo2 + ' ');

        int arr2[] = new int[13];
        for (int i = 0; i < arr2.length; i++) {
            iSum = iNo1 + iNo2;
            arr2[i] = iSum;
            iNo1 = iNo2;
            iNo2 = iSum;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

}
