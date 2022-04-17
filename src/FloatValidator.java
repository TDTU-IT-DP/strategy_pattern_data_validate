// example

public class FloatValidator implements StrategyValidator {
    @Override
    public boolean validate(String inputString) {
        // TODO Auto-generated method stub
        try {
            Float.parseFloat(inputString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String sampleFormat() {
        // TODO Auto-generated method stub
        return "1.1 or 99.999";
    }

    @Override
    public String onFailed(String inpString) {
        // TODO Auto-generated method stub
        return String.format("%s is not float number", inpString);
    }

    @Override
    public String onSuccessed(String inpString) {
        // TODO Auto-generated method stub
        return String.format("%s is float number", inpString);
    }
}
