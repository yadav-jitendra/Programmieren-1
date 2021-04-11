package ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class KeyValueStore {
    private KeyValuePair[] kVStore = new KeyValuePair[0];
    private int counter = 0;

    public KeyValueStore() {
    }

    public void newKVP(String key, String value) throws KeyExistsException, IOException {
        addNewKVP(new KeyValuePair(key, value));
    }

    private void addNewKVP(KeyValuePair newKV) throws KeyExistsException, IOException {
        int index = indexOf(newKV.getKey());
        if (index >= 0) {
            throw new KeyExistsException();
        }

        KeyValuePair[] storeCopy = new KeyValuePair[kVStore.length + 1];
        System.arraycopy(kVStore, 0, storeCopy, 0, kVStore.length);
        storeCopy[storeCopy.length - 1] = newKV;
        kVStore = storeCopy;

        checkpointing();
    }

    private int indexOf(String key) {
        for (int i = 0; i < kVStore.length; i++) {
            if (key.equals(kVStore[i].getKey())) {
                return i;
            }
        }
        return -1;
    }

    public String getKVP(String key) throws KeyNotExistsException {
        int index = indexOf(key);
        if (index == -1) {
            throw new KeyNotExistsException();
        }
        return kVStore[index].getValue();
    }

    public void updateKVP(String key, String newValue) throws KeyNotExistsException, IOException {
        int index = indexOf(key);
        if (index == -1) {
            throw new KeyNotExistsException();
        }

        kVStore[index].setValue(newValue);
        checkpointing();

    }

    public void deleteKVP(String key) throws KeyNotExistsException, IOException {
        int index = indexOf(key);
        if (index == -1) {
            throw new KeyNotExistsException();
        }

        KeyValuePair[] copyStore = new KeyValuePair[kVStore.length - 1];
        int j = 0;
        for (int i = 0; i < kVStore.length; i++) {
            if (i != index) {
                copyStore[j] = kVStore[i];
                j++;
            }
        }

        kVStore = copyStore;
        checkpointing();

    }

    private void checkpointing() throws IOException {
        counter++;
        if (counter == 5) {
            try {
                saveToFile();
                counter = 0;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveToFile() throws IOException {
        File file = new File("KeyValueStore.txt");
        FileOutputStream outputStream = new FileOutputStream(file,false);
        KVPOutputStream kvpOutputStream = new KVPOutputStream(outputStream);
        for (KeyValuePair kvp : kVStore){
            kvpOutputStream.writeKVP(kvp);
        }



    }

}
