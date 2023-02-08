package com.company;

public class Task3 {
    //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

    public void getElements() {

        int[] myArray = {1, 2, 3, 6, 9, 11};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 3 == 0) {
                System.out.println(myArray[i]);
            }
        }
    }
}
