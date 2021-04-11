package ex01;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class KVPOutputStream extends OutputStream {
	private OutputStream outputStream;

	public KVPOutputStream(OutputStream outputStream) {
		this.outputStream = outputStream;
	}

	public void writeKVP(KeyValuePair keyValuePair) throws IOException{
		byte[] key = keyValuePair.getKey().getBytes();
		byte[] value = keyValuePair.getValue().getBytes();
		byte keyLength = Integer.valueOf(key.length).byteValue();
		byte valueLength = Integer.valueOf(value.length).byteValue();

		outputStream.write(keyLength);
		outputStream.write(valueLength);
		outputStream.write(key);
		outputStream.write(value);

	}

	@Override
	public void write(int arg0) throws IOException {
		outputStream.write(arg0);
	}

}
