package generics;

public class GenericMethod {

    public static void main(String args[])
    {
        //parameter can be any generic object
        genericMethod("genericMethodName");
        genericMethod(23);
        genericMethod(new Cat(243));

        genericMethodWithMultipleArguments(23,"datta");
    }

    // T - can be whatever
    public static <T>void genericMethod(T generic)
    {
        System.out.println(generic+"   : inside a generic method!!!!!!!!!!!!");
    }

    // T - can be whatever
    public static <T,V> T genericMethodWithMultipleArguments(T genericType1, V genericType2)
    {
        System.out.println(genericType1+"   : genericType1!");
        System.out.println(genericType2+"   : genericType2!");

        return genericType1;
    }



}

