public class GuessNumber {
    public static void main(String[] args) {
        GeneratorHandler generatorHandler = new GeneratorHandler();
        InputHandler inputHandler = new InputHandler();

        System.out.print("Введите число от 1 до 100:");
        int number = inputHandler.inputInteger();

        int randomNumber = generatorHandler.getRandomNumber();

        if (randomNumber == number)
            System.out.print("Вы угадали!!!");
        else
            System.out.print("Увы... Было загадано число " + randomNumber);

    }
}