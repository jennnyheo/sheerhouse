package sheerhouse;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.main.sheerhouse.commons.AwsS3;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TestAwsS3 {
	public AwsS3 awsS3 = AwsS3.getInstance();
	
	@Test
	public void test() {
		TestAwsS3 s3 = new TestAwsS3();
		
		File file = new File("C:\\mainProject\\upload.jpg");
		String key = "img/upload.jpg";
		String copyKey = "img/copy-upload.jpg";
		
		//s3.upload(file,key);
		//s3.copy(key, copyKey);
		//s3.delete("test.jpg");
	}
	
	public void upload(File file, String key) {
		awsS3.upload(file, key);
	}
	public void copy(String orgKey, String copyKey) {
		awsS3.copy(orgKey, copyKey);
	}
	public void delete(String key) {
		awsS3.delete(key);

	}
	
}
