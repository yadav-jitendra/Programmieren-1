package ex01;

public class KeyValuePair {
    private final String key;
    private String value;

    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {      // no setter for key, because it is final
        this.value = value;
    }
}
