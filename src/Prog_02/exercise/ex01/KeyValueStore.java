package Prog_02.exercise.ex01;

public class KeyValueStore {
    private KeyValuePair[] kVStore = new KeyValuePair[0];

    public KeyValueStore() {
    }

    public void newKVP(String key, String value){
        addNewKVP(new KeyValuePair(key,value));
    }

    private void addNewKVP(KeyValuePair newKV) {
        int index = this.indexOf(newKV.getKey());
    }

    private int indexOf(String key){
        for (int i = 0; i < kVStore.length; i++) {
            if (key.equals(kVStore[i].getKey())) {
            return i;
            }
        }
        return -1;
    }
}
