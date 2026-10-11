import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

void main(String[] args) {
    mainMenu();
}

void mainMenu() {
    int command = 0;
    while (command != -1) {
        System.out.println("Привет. Это программа для вычисления площади прямоугольного треугольника.");
        System.out.println("Введите команду:\n1 - Выполнить расчет\n2 - Информация о программе\n3 - Информация о разработчике\n-1 - Выход");

        if (!scanner.hasNextInt()) {
            System.out.println("Неверная команда (не число).");
            scanner.next();
            continue;
        }
        command = scanner.nextInt();
        chooseNextAction(command);
    }
}

void chooseNextAction(int command) {
    String infoProgMsg = "Данная программа вычисляет площадь прямоугольного треугольника";
    String infoDevMsg = "Данная программа разработана в ходе практики по Современным Языкам Программирования.";

    switch (command) {
        case 1:
            performCalculations();
            break;
        case 2:
            System.out.println(infoProgMsg);
            break;
        case 3:
            System.out.println(infoDevMsg);
            break;
        case -1:
            System.out.println("Выход из программы.");
            break;
        default:
            System.out.println("Неверная команда.");
    }
}

void performCalculations() {
    double[] params = inputParams();
    if (params == null) return;

    if (!validateParams(params)) return;

    double[] results = calculate(params);

    printResults(params, results);
}

double[] inputParams() {
    System.out.println("Введите основание и высоту, разделяя их пробелом.");

    double[] params = new double[2];
    for (int i = 0; i < params.length; i++) {
        if (!scanner.hasNextDouble()) {
            System.out.println("Вы ввели не число (pos=" + (i + 1) + ").");
            if (scanner.hasNextLine()) scanner.nextLine();
            return null;
        }
        params[i] = scanner.nextDouble();
    }
    return params;
}

static boolean validateParams(double[] params) {
    if (params[0] <= 0) {
        System.out.println("Ошибка: основание должно быть > 0.");
        return false;
    }
    if (params[1] <= 0) {
        System.out.println("Ошибка: высота должна быть > 0.");
        return false;
    }
    return true;
}

static double[] calculate(double[] params) {
    double a = params[0];
    double h = params[1];
    double s = a * h / 2;
    return new double[]{a, h, s};
}

static void printResults(double[] params, double[] results) {
    System.out.printf(
            "При основании a = %.4f и высоте h = %.4f площадь прямоугольного треугольника S = %.4f%n",
            params[0], params[1], results[2]
    );
}