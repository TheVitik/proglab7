//Insertion Sorter
package Sortinglab.Sorters;
import Sortinglab.Interfaces.SortInterface;
public class InsertionSorter implements SortInterface{
    @Override
    public void Sort(byte[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            byte s = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > s) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = s;
        }
    }
}
