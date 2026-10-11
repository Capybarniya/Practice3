Scanner scanner = new Scanner(System.in);

void main() {
    //Дан целочисленный массив размера N. Вывести сначала все чётные числа в порядке возрастания индексов, затем все нечётные числа в порядке убывания индексов.
    int n = scanner.nextInt();

    int[] array = new int[n];

    for (int i = 0; i < n; i++){
        array[i] = scanner.nextInt();
    }

    System.out.println("Четные числа в порядке возрастания индексов:");

    for (int i = 0; i < n; i++){
        if (array[i] % 2 == 0){
            System.out.print(array[i]+" ");
        }
    }

    System.out.println("\nНечетные числа в порядке убывания индексов:");

    for (int i = n-1; i >= 0; i--){
        if (array[i] % 2 == 1){
            System.out.print(array[i]+" ");
        }
    }


}
