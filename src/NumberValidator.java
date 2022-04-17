
public class NumberValidator implements StrategyValidator {
    @Override
    public boolean validate(String inputString) {
        // TODO Auto-generated method stub
        try {
            Integer.parseInt(inputString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String sampleFormat() {
        // TODO Auto-generated method stub
        return "0-9";
    }

    @Override
    public String onFailed(String inpString) {
        // TODO Auto-generated method stub
        return String.format("%s is not number", inpString);
    }

    @Override
    public String onSuccessed(String inpString) {
        // TODO Auto-generated method stub
        return String.format("%s is number", inpString);
    }
}
