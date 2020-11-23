//Array printer module
package Sortinglab.Modules;
public class Print {
    public static void Output(byte[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
