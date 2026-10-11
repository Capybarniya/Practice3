Scanner scanner = new Scanner(System.in);

void main() {
    //Найти количество участков, на которых элементы массива монотонно возрастают.
    int n = scanner.nextInt();

    int[] array = new int[n];

    for (int i = 0; i < n; i++){
        array[i] = scanner.nextInt();
    }

    boolean isAscending = false;
    int ascendingZonesCounter = 0;

    for (int i = 0; i < n-1; i++){
        if (array[i] < array[i+1]){
            if (!isAscending){
                isAscending = true;
                ascendingZonesCounter += 1;
            }

        }
        else{
            isAscending = false;
        }
    }

    System.out.println("Количество участков, на которых элементы массива монотонно возрастают: " + ascendingZonesCounter);

}