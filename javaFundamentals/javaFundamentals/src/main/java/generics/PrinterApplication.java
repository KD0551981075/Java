package generics;

import java.util.ArrayList;

public class PrinterApplication {

    public static void main(String args[])
    {
        //using generics of type Integer
        GenericClass<Integer> genericClass = new GenericClass<>(23);
        genericClass.printMemberVariable();

        //using generics of type Double
        GenericClass<Double> doubleGenericClass = new GenericClass<>(23.22);
        doubleGenericClass.printMemberVariable();

        //before generics
        //This leads to type safety issues

        /*Exception in thread "main" java.lang.ClassCastException: class genericsRepo.Dog cannot be cast to
        class genericsRepo.Cat (genericsRepo.Dog and genericsRepo.Cat are in unnamed module of loader 'app')
        at genericsRepo.PrinterApplication.main(PrinterApplication.java:22)*/
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat(43) );

        // we need to cast it, if we are before generics
        Cat cat = list.get(0);



    }
}