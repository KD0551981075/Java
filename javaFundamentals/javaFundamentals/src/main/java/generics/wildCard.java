package generics;


/*This is used if child is not part of parent, for example
happy scenario - parent object, child string
but - List<String> is not children of List<Objects>

Wildcard is ?

This works when you don't know about the object is
*/

import java.util.ArrayList;
import java.util.List;

public class wildCard {
    public static void main(String args[])
    {
        List<Integer> listObj = new ArrayList<>();
        listObj.add(23);
        printList(listObj);

       /*
       Can't be passed to method level because Integer doesn't extends cats
        printListWithExtends(listObj);

        */

        List<Cat> catListObj = new ArrayList<>();
        catListObj.add(new Cat(456));
        printListWithExtends(catListObj);
    }

    public static void printList(List<?> methodObj)
    {
        System.out.println(methodObj);
    }

    //bounded generics
    public static void printListWithExtends(List<? extends Cat>methodObj)
    {
        System.out.println(methodObj);
    }
}
