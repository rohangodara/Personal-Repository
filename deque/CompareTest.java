package deque;

import edu.princeton.cs.algs4.In;

import java.util.Comparator;

public .class CompareTest implements Comparator<Integer> {
    public static int compare(int a, int b){
        if(a>b){return 1;}
        else if (a==b){return 0;}
        else {return -1;}
    }
}
