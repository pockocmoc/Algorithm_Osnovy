// Нахождение второго по максимальности элемента массива.

public class Algorithm {
    public static void main(String[] args) {

        int[] intArray = {1, 8, 3, 2, 6, 4, 10};
        int maxNum = 0;
        int maxSecondNum = 0;


        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > maxNum) {
                maxSecondNum = maxNum;
                maxNum = intArray[i];

            } else if (intArray[i] > maxSecondNum && intArray[i] != maxNum) {
                maxSecondNum = intArray[i];

            }
        }
        if (maxSecondNum != Integer.MAX_VALUE) {
            System.out.println("Второй по максимальности элемент массива: " + maxSecondNum);
        } else {
            System.out.println("Второй по максимальности элемент массива отсутствует. ");

        }
    }
}
