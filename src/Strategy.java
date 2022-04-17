import java.util.Scanner;

public class Strategy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StrategyValidator[] validators = {
            new NumberValidator(),
            new FloatValidator()
        };

        for (StrategyValidator validator: validators){
            System.out.println(validator.getClass().getSimpleName());
            boolean isCorrect = false;

            while (!isCorrect){
                System.out.printf("Input data : ");
                String inputValue = scanner.next();
                isCorrect = validator.validate(inputValue);
                
                if (isCorrect){
                    System.out.println(validator.onSuccessed(inputValue));
                }
                else {
                    System.out.println(String.format("%s. Example: %s", validator.onFailed(inputValue), validator.sampleFormat()));
                    System.out.println("Please re-input.");
                }
            }
        }

        scanner.close();
    }
}
