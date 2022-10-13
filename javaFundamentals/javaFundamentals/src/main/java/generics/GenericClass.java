package generics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericClass<T > {

    T memberVariable;

    public void printMemberVariable()
    {
        System.out.println(memberVariable);
    }
}
