import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyNewTest {
	
	public static void main(String[] args) throws IOException {
		long start=System.currentTimeMillis();
		FileInputStream fileInputStream = new FileInputStream(new File("G:\\test\\001.avi"));
		FileOutputStream fOutputStream = new FileOutputStream(new File("G:\\test\\temp.avi"));
		byte[] bytes = new byte[1024];
		int len = fileInputStream.read(bytes);
		while (len != -1) {
			fOutputStream.write(bytes, 0, len);
			len=fileInputStream.read(bytes);
		}
		fOutputStream.close();
		fileInputStream.close();
		System.out.println("½áÊø£º"+(System.currentTimeMillis()-start));
	}

}
