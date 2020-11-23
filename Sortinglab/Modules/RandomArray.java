//Random array generator module
package Sortinglab.Modules;
import java.util.*;

public class RandomArray {
    public static byte[] Generate(int length) {
        byte[] num = new byte[length];
            new Random().nextBytes(num);
        return num;
        }

    }
