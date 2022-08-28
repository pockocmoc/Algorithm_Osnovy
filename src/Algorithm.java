public class Algorithm {
    public static void main(String[] args) {

        int[] mas = {1, 8, 3, 2, 6};
        int maxNumber = 0;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            if(maxNumber <= mas[i]){
                maxNumber = mas[i];
                maxIndex = i;
            }
        }

        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}



