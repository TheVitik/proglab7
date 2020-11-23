//Bubble Sorter
package Sortinglab.Sorters;
import Sortinglab.Interfaces.SortInterface;
public class BubbleSorter implements SortInterface{
    @Override
    public void Sort(byte[] array) {
        byte s;
        for(int i=0; i < array.length; i++){
            for(int j=1; j < array.length-i; j++){
                if(array[j-1] > array[j]){
                    s = array[j];
                    array[j] = array[j-1];
                    array[j-1] = s;
                }
            }
        }
    }
}
