package priority_queue;

/**
 * @author yeobi Created 2020-02-22
 */
public class Data {

    private int value;

    private Data(int value) {
        this.value = value;
    }

    public static Data createData(int value) {
        return new Data(value);
    }

    public int getValue() {
        return value;
    }

}
