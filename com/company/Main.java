package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public static boolean IsLike(List<Object> X, List<Object> Y){
        if (X.size() > Y.size()){
            return false;
        }

        boolean bFind = true;
        for(Object x : X){
            for(Object y : Y){
                if(!x.equals(y))
                    Y.remove(y);
                if(X.size() > Y.size()){
                    bFind = false;
                    break;
                }
            }
            if(!bFind)
                break;
        }

        return bFind;
    }
}
