package simple_linked_list;

/**
 * @author yeobi Created 2020-02-21
 * @description 데이터를 가지고 있는 객체
 */
public class Data {
    public static final int NEW_DATA_EQUALS_EXIST_DATA = 0;
    public static final int NEW_DATA_BIGGER_THAN_EXIST_DATA = 1;
    public static final int NEW_DATA_SMALLER_THAN_EXIST_DATA = 2;

    private int value;

    public Data() {
    }

    public Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareValue(Data data) {
        if (this.value > data.getValue()) {
            return NEW_DATA_BIGGER_THAN_EXIST_DATA;
        } else if (this.value == data.getValue()) {
            return NEW_DATA_EQUALS_EXIST_DATA;
        }
        return NEW_DATA_SMALLER_THAN_EXIST_DATA;
    }

}
