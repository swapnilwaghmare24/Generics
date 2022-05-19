package Com.Bridgelabz.Generics;

import Workshop2.Xyz;

public class LargestThree {
    public <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String[] args) {
       LargestThree largestThree = new LargestThree();
        System.out.println(largestThree.maximum(3,7,4));
        System.out.println(largestThree.maximum(3.6,2.2,1.3));
        System.out.println(largestThree.maximum("abc","xyz","pqr"));

    }
}
