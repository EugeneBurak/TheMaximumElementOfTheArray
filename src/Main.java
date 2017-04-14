import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] list = null;          //We use check - array != null
        int[] list1 = {};
        int[] list2 = {1};
        int[] list3 = {-272};
        int[] list4 = { -1, -9 };
        int[] list5 = { 1, -3, 7};
        int[] list6 = { 1, -3, 7, 296, 8, 296, -1};
        System.out.println(maxElement(list));
        System.out.println(maxElement(list1));
        System.out.println(maxElement(list2));
        System.out.println(maxElement(list3));
        System.out.println(maxElement(list4));
        System.out.println(maxElement(list5));
        System.out.println(maxElement(list6));

        consolHelper(bubbleSort(list6));
    }

    public static Integer maxElement(int[] array)  {
        Integer max = null;         //return null if the array is empty
        if (array != null) {
            if (array.length == 1) {
                max = array[0];
            }
            if (array.length >= 2) {
                max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (max < array[i]) {
                        max = array[i];
                    }
                }
            }
        }
        return max;
    }

    public static int[] bubbleSort(int[] array) {
        int[] result = {};
        int temp;
        if (array != null) {
            if (array.length == 1) {
                result = array;
            }
            if (array.length >= 2) {
                result = array;
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i+1; j < array.length; j++)    {
                        if (result[i] < result[j])    {
                            temp = result[i];
                            result[i] = result[j];
                            result[j] = temp;
                        }
                    }

                }
                result = array;
            }
        }
        return result;
    }

    public static void consolHelper(int[] array)    {
        if (array != null) {
            if (array.length >= 1) {
                System.out.println();
                for (int i = 0; i < array.length; i++)  {
                    System.out.print(array[i] + ", ");
                }
                System.out.println();
            }   else    {
                System.out.println("[]");
            }
        }
    }
}
