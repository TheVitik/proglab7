//Processor of classes
package Sortinglab.Modules;
import Sortinglab.Interfaces.SortInterface;
public class Processor {
    private SortInterface sorter;
    public byte[] Start(byte[] array){
        sorter.Sort(array);
        return array;
    }
    public void SetSort(SortInterface method){
        sorter = method;
    }
}
