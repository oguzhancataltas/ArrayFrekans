public class Main {

    static boolean isTrue(int[] arr, int value) {
        for (int j : arr) {
            if (j == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[array.length];
        int index = 0;


        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < array.length; i++) {
            int increase = 1;

            if (isTrue(duplicate, array[i])) {

                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] == array[j]) {
                        increase++;
                    }
                }
                System.out.println(array[i] + " sayısı " + increase + " kere tekrar edildi.");
            }
            duplicate[index++] = array[i];
        }
    }
}
