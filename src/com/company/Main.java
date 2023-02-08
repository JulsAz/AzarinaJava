package com.company;

public class Main {

    public static void main(String[] args) {
        Task1.tapNumber();
        Task2.getName();

        Task3 task3 = new Task3();
        task3.getElements();

        //Task4
        // Дана скобочная последовательность: [((())()(())]]
        //- Можно ли считать эту последовательность правильной? ОТВЕТ: НЕТ
        //- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?
        //ОТВЕТ: [[(())()(())]] или [((())()(()))]
    }
}
