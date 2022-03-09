package com.spartaglobal.gm.BubbleSortUsingInheritence;

public abstract class Parent {

    int[] array;

    public Parent(int[] array) {
        this.array = array;
    }

    public int[] getSortedArray(int[] array){
        int sortFlag = 1;
        while(sortFlag != 0){
            sortFlag = 0;
            for(int i = 0; i < array.length-1; i++){
                if(array[i]>array[i+1]){
                    sortFlag++;
                    int m = array[i];
                    array[i] = array[i+1];
                    array[i+1] = m;
                }

            }
        }
        return array;
    }

}
