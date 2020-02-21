package tree;

/**
 * @author yeobi Created 2020-02-21
 */
public class Data {
    public static final int ADDITION = -1;
    public static final int SUBTRACT = -2;
    public static final int MULTIPLY = -3;
    public static final int DIVISION = -4;

    private int value;

    public Data(char operator) {
        this.value = operatorFilter(operator);
    }

    public Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return printerFilter(value);
    }

    private int operatorFilter(char operator) {
        switch (operator) {
            case '+':
                return ADDITION;
            case '-':
                return SUBTRACT;
            case '*':
                return MULTIPLY;
            case '/':
                return DIVISION;
        }

        return 0;
    }

    private String printerFilter(int value) {
        switch (value) {
            case ADDITION:
                return "+";
            case SUBTRACT:
                return "-";
            case MULTIPLY:
                return "*";
            case DIVISION:
                return "/";
        }

        return Integer.toString(value);
    }

}
