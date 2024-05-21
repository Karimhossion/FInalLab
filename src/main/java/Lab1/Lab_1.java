/*Problem Statement : 
	Suppose you have two arrays of similar length.
	Now Perform addition the elements of the two arrays position by     position from left to right.
	While performing addition you have to consider the carry and the carry that you get form a addition operator has to be added with the next addition operator.
	You have to create a new array from this operation.
	Now Reverse the two arrays and perform similar operators.
	Check the two output arrays you get from the addition operator, if they are same print "SAME", else print "NOT SAME".


            Array 1         =   4	5	8

            Array 2         =   3	5	5

	        Sum             =   8	1	3

	        Reverse Array 1 =   8	5	4

	        Reverse Array 2 =   5	5	3 

	        Reverse Sum     =	1	2	0	9	
                                
                                NOT SAME

        ------Md Karim------
 */


package Lab1;

/**
 *
 * @author Arafat
 */
public class Lab_1 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];

        array1[0] = 4;
        array1[1] = 5;
        array1[2] = 8;

        array2[0] = 3;
        array2[1] = 5;
        array2[2] = 5;

        System.out.print("array 1 : ");
        int i = 0;
        while (i < array1.length) {
            System.out.print(array1[i] + " ");
            i++;
        }
        System.out.println();
        System.out.print("array 2 : ");
        i = 0;
        while (i < array2.length) {
            System.out.print(array2[i] + " ");
            i++;
        }
        System.out.println();
        int sum1[] = new int[array1.length + 1];
        int sumTemp, carry = 0;
        i = array2.length - 1;
        while (i >= 0) {
            sumTemp = array1[i] + array2[i] + carry;
            carry = sumTemp / 10;
            if (sumTemp > 9) {
                sumTemp %= 10;
            }
            sum1[i + 1] = sumTemp;
            i--;
        }
        sum1[0] = carry;
        carry = 0;

        System.out.print("sum : ");
        i = 1;
        while (i < sum1.length) {
            System.out.print(sum1[i] + " ");
            i++;
        }
        System.out.println();
        //reverse
        int rev = 0;
        i = 0;
        while (i < array1.length / 2) {
            rev = array1[i];
            array1[i] = array1[array1.length - i - 1];
            array1[array1.length - i - 1] = rev;
            i++;
        }
        System.out.print("reverse array 1 : ");
        i = 0;
        while (i < array1.length) {
            System.out.print(array1[i] + " ");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < array2.length) {
            rev = array2[i];
            array2[i] = array2[array2.length - i - 1];
            array2[array2.length - i - 1] = rev;
            i++;
        }
        System.out.print("reverse array 2 : ");
        i = 0;
        while (i < array2.length) {
            System.out.print(array2[i] + " ");
            i++;
        }
        System.out.println();
        int sum2[] = new int[array2.length + 1];
        i = array2.length - 1;
        while (i >= 0) {
            sumTemp = array1[i] + array2[i] + carry;
            carry = sumTemp / 10;
            sumTemp %= 10;
            sum2[i + 1] = sumTemp;
            i--;
        }
        sum2[0] = carry;
        System.out.print("reverse sum : ");
        i = 0;
        while (i < sum2.length) {
            if (i == 0 && sum2[i] == 0) {
                i++;
                continue;
            }
            System.out.print(sum2[i] + " ");
            i++;
        }
        System.out.println();

        i = 0;
        while (i < sum1.length) {
            if (sum1[i] != sum2[i]) {
                System.out.println("NOT SAME");
                break;
            }
            i++;
        }
        if (i == sum1.length) {
            System.out.println("SAME");
        }
    }
}