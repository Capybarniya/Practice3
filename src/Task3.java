Scanner scanner = new Scanner(System.in);

void main() {
    //Даны массивы A и B одинакового размера N. Поменять местами их содержимое и вывести преобразованные A, затем B. Реализовать отдельным статическим методом.
    int n = scanner.nextInt();

    int[] arrayA = readArray(n);
    int[] arrayB = readArray(n);

    printArray(arrayA);
    printArray(arrayB);

    swapArrays(arrayA, arrayB);

    printArray(arrayA);
    printArray(arrayB);
}

static void swapArrays(int[] A, int[] B){
    int[] Tmp = new int[A.length];
    System.arraycopy(A,0, Tmp,0, A.length);
    System.arraycopy(B,0, A,0, A.length);
    System.arraycopy(Tmp,0, B,0, A.length);
}

static int[] readArray(int n){
    Scanner scanner = new Scanner(System.in);

    int[] array = new int[n];

    for (int i = 0; i < n; i++){
        array[i] = scanner.nextInt();
    }

    return array;
}

static void printArray(int[] array){
    for (int j : array) {
        System.out.print(j + " ");
    }
    System.out.print("\n");
}