package interview;

import java.util.*;

public class SampleClass {

    public static void main(String args[]) {

       // int[] s = {-6, 91, 1011, -100, 84, -22, 0, 1, 473};
        String s = "cycle";
        System.out.println(getMinSubstrings(s));
    }


    public static int getMinSubstrings(String res){
        int right = 0;
        int count = 0;
        Set<Character> map = new HashSet<>();
        while(right < res.length()){
            if(map.contains(res.charAt(right))){
                count++;
                map.clear();
            }
            map.add(res.charAt(right));
            right++;
        }
        return count+1;
    }
    public static int solution1(int[] A) {
        int max = -10000;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0 && A[i] < 10 && A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
    public static boolean checkOrder(String s) {
        int indexA = s.indexOf('a');
        int indexB = s.indexOf('b');
        if (indexA == -1 || indexB == -1) {
            // No 'a' or 'b' in string
            return true;
        } else if (indexA < indexB) {
            // 'a' comes before 'b'
            return checkOrder(s.substring(indexB));
        } else {
            // 'a' comes after 'b'
            return false;
        }
    }

    public static void update(List<String> listOfValues) {

        listOfValues.set(1, listOfValues.get(2));

    }

    public int solution(int[] A) {
        return 0;
    }

}
