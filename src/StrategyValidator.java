/**
 * StrategyValidator
 */
public interface StrategyValidator {

    boolean validate(String inputString);
    String sampleFormat();
    String onFailed(String inpString);
    String onSuccessed(String inpString);
}