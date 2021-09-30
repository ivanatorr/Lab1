import java.util.Random;

public class DiagonalMatrix {

    public static void main(String[] args) {
        int[][] a = new int[5][5];              //иниайилизиация массива
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {         //цикл для заполнения массива случайными числами
                a[i][j] = rnd.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {      //цикл для вывода матрицы на экран
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

        for (int j = 0; j < a.length; j++) {        //цикл для прохода по строкам матрицы

            int sum = 0;
            if (a[a.length - 1][j] == a[j][j]) {      //условие: если конечный элемент столбца равен элементу стоящиму на главной диагонали и в этом столбце, то выполняем действия ниже


                for (int i = 0; i < a.length; i++) {        //цикл для прохода по столбцам матрицы

                    sum = sum + a[i][j];                    //вычесление суммы столбца, на котором был конечный элемент, которы равен элементу на главной диагонали
                    System.out.print(a[i][j] + "  ");       //вывод столбца на котором находился элемент удволетворяющий условию
                }
                System.out.println("Сумма элементов нужного столбца равна: " + sum);        //вывод суммы


            }else{
                System.out.println((j+1) + " столбец не подходит по условию задачи");
            }


        }
    }
}
