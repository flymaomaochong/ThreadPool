import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class MyProgress {
//private static LinkedHashMap<String,Person>list=new LinkedHashMap<String,Person>();
	
	   public static void main(String[] args) throws Exception{
		  
//		   list.put("1",new Person("张三",16));
//		   list.put("2",new Person("李四",19));
//		   list.put("3",new Person("王五",5));
//		   Iterator<Person> iterator=list.
//		   for(Person p:list) {
//			   System.out.println(p);
//		   }
		  URL url=new URL("https://www.baidu.com/link?url=Ww8Iz9GUBwTnmhf7zB7Ww1-fvn397QkyY102BMJzGZxrgUa-MybqMBdmAk2l4u8kAmA91CIgZaZgzrJ_VAjbbSilWDh3bMf1zAz1RyBtgJ-pcErtBclhW1_kTVIvekOmfEktF1XAGWWd3y2OSwBoCBbjHBiwUQgvDSqkMrms2rSsjRxixaQcxfalT9jRhVlvpz-gnWXSEcl1PooCKAfZcFpSGKqkWoLjynWcjWcpYyK44CjFgcnM3Lptrjfb6pg8lmIrY--vf6_wM1K0jivgOZRAqv7iLdB_GkHfT0lpj_wY_zsufWI8HL99BDbWLTygqrYKv-S49cD87eGniH1s-uPhKBg8xsNTAylP-k53cwrTBIYnnOuMOwBEfT5tbdLrPUoZX7vZIvKqgMP8KlrGKjrrrw9FuRr_hkmjtWuZUZsg8UPLMqGug0CI_e2Rhkow2aszeO70VB3PKuTldtyv7LcbpSnK-bMUoYnuO8IpNhAe0tluwtuBGBMygB4fY8BaivBTDBaeVTWSVPvXjmrVk_3VBl6A1bmu0Aoa43-2FcZsOv9ap52p3eIjJ32Dp1tCFoPJiJP-PNeVUMova2f3UUijLsnRydPYbU-vLQVI_PZ6z-ze5mxcAbyFzPCCpKBO&timg=https%3A%2F%2Fss0.bdstatic.com%2F94oJfD_bAAcT8t7mm9GUKT-xh_%2Ftimg%3Fimage%26quality%3D100%26size%3Db4000_4000%26sec%3D1555320657%26di%3D47aeecfccdfd0c4983a9324e57fc90a7%26src%3Dhttp%3A%2F%2Fres.cngoldres.com%2Fupload%2F2018%2F0110%2F799787c9cbbc798b2be58aa4854d2960.png%3F_%3D1515572979371&click_t=1555320659304&s_info=1263_566&wd=&eqid=b310c2cf00101891000000035cb44f51");
		 URLConnection connection=new URLConnection(url) {
			
			@Override
			public void connect() throws IOException {
			
				
			}
		};
		connection.connect();
//	InputStream insInputStream=	connection.getInputStream();
	OutputStream insInputStream=	connection.getOutputStream();
	
File file=new File("G://image.png");
if(!file.exists()) {
	file.createNewFile();
}
FileOutputStream outputStream=new FileOutputStream(file);
byte[]bytes=new byte[30];
int len=insInputStream.write(bytes);
while (len!=-1) {
	outputStream.write(bytes);
	insInputStream.write(bytes);
	
}
	     
	    }
	 
	

}