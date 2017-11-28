package com.company;

import java.util.Comparator;

/**
 * Created by Haharin on 28.11.2017.
 */
public class StringLengthSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1;
        }else{
            if(o1.length() < o2.length()){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
