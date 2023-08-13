package frac;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = { -5, 1, 1, -5, -5 };
        System.out.println(uni(integerArray));

    }
    public static boolean uni(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num: map.values()){
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;

    }
}
