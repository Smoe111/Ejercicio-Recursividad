public class SumaDivideVenceras {

    public static void main(String[] args) {

        int [] array= {1,2,3,4,5,6,7,8,9};
        System.out.println(SumaRecursiva(array, 0, array.length - 1));
    }

    public static int SumaRecursiva(int[] array, int inicio, int fin) {
        if(inicio == fin) {
            return array[inicio];
        }else {
            int mitad= (inicio+fin)/2;
            int a= SumaRecursiva(array,inicio, mitad);
            int b= SumaRecursiva(array,mitad+1, fin);

            return a+b;
        }
    }
}
