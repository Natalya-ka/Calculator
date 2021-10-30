import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Выберите оператор: +, -, *, или /");
        operator = input.next().charAt(0);

        System.out.println("ВВедите первое значение");
        number1 = input.nextDouble();

        System.out.println("ВВедите второе значение");
        number2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                if (number2==0){
                    System.out.println("Ошибка!Делить на ноль нельзя.");
                }
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Не коррентный оператор!");
                break;
        }
    }
}

