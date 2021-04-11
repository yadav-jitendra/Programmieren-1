package ex01;

import java.io.IOException;
import java.io.InputStream;

public class KVPInputStream extends InputStream {

	@Override
	public int read() throws IOException {
		// Kann ignoriert werden
		return 0;
	}

}
