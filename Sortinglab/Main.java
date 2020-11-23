package Sortinglab;
import Sortinglab.Sorters.*;
import Sortinglab.Modules.*;
public class Main {
    public static void main(String[] args){
        //Installation of utility class
        Processor sorter = new Processor();
        Print print = new Print();
        RandomArray randomArray = new RandomArray();
        //Sorting and output
        System.out.println("Bubble Sort");
        sorter.SetSort(new BubbleSorter());
        print.Output(sorter.Start(randomArray.Generate(5)));
        System.out.println("Insertion Sort");
        sorter.SetSort(new InsertionSorter());
        print.Output(sorter.Start(randomArray.Generate(5)));
        System.out.println("Selection Sort");
        sorter.SetSort(new SelectionSorter());
        print.Output(sorter.Start(randomArray.Generate(5)));
    }
}
