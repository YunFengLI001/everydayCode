package com.everydayCode.targetcode;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class findMaxNumberTOArray {
    public static void main(String[] args) {
        int[][] arrays = {{}};
        boolean b = dofindManNumberTOArray2(arrays, 9);
        System.out.printf(b+"");
    }
    //sb
    public static boolean dofindManNumberTOArray(int[][] arrays,int number){
        for(int i =arrays.length-1;i>=0;i--){
            for(int j =arrays[i].length-1;j>=0;j-- ){
                if(number == arrays[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    //
    public static boolean dofindManNumberTOArray2(int[][] arrays,int number){
        int col = arrays.length-1;
        int row = arrays[0].length-1;
        int i = 0;
        int j = col;
        while(j>=0 && i<=col && col>0){
            if(number>arrays[i][j]){
                i++;
            }else if(number <arrays[i][j]){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
}
