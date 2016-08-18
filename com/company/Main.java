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

        boolean bFind = false;
        for(Object x : X){
            bFind = false;
            for(int y = 0; y < Y.size(); y++){
                if(Y.get(y).equals(x)){
                    Y.remove(y);
                    bFind = true;
                }
            }

            if (!bFind)
                return false;
        }

        return true;
    }
}
