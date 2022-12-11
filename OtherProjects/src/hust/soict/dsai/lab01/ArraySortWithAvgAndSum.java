package hust.soict.dsai.lab01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySortWithAvgAndSum {
    private List<Integer> arr;

    public ArraySortWithAvgAndSum (List<Integer> initArray) {
        this.arr = initArray;
    }
    public ArraySortWithAvgAndSum(){
        this.arr = new ArrayList<Integer>();
    }

    public void add(int addNum){
        arr.add(addNum);
    }

    public int size(){
        return arr.size();
    }

    public void remove(int index){
        arr.remove(index);
    }

    public void clear(){
        arr.clear();
    }

    public void sort(){
        Collections.sort(this.arr);
    }

    @Override
    public String toString() {
        String result = "[";
        for (int element: arr) {
            result += (element + ", ");
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArraySortWithAvgAndSum myArr = new ArraySortWithAvgAndSum();
        myArr.add(3);
        myArr.add(4);
        myArr.add(1);
        myArr.add(-1);
        myArr.add(6);
        myArr.sort();
        myArr.toString();
    }
}
