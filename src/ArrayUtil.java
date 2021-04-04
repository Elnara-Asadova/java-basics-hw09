/**
 * ArrayUtil exercises.
 */

import java.util.*;
import java.util.stream.*;

public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // TODO fill in code here

        ArrayList<String> list1 = new ArrayList<String>();
        list1.addAll(Arrays.asList(array1));

        ArrayList<String> list2 = new ArrayList<String>();
        list2.addAll(Arrays.asList(array2));

        list1.retainAll(list2);

        ArrayList<String> finalList = new ArrayList<String>();

        for (String element : list1) {
            if (!finalList.contains(element)) {
                finalList.add(element);
            }
        }
        String [] matchedStrings = new String[finalList.size()];
        finalList.toArray(matchedStrings);
        return matchedStrings;
    }
}