package testmybatis;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.User;
import com.service.UserServiceI;

//ʹ��spring���Է���spring-test.jar
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class AppTest {
	
	
	private UserServiceI userService;
	
	
	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@Test
	public void test1(){
    	User u = userService.getUserById("1");
    	System.out.println(u);
    }
	
}



//δʹ��sping���Է���spring-test.jar������ʹ��junit�Դ��ķ���
/*public class AppTest {

	private ApplicationContext ac;	
	private UserServiceI userService;
	
	@Before 
	public void Before(){
		ac =  new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		userService =(UserServiceI)ac.getBean("userService");
		
	}
    @Test
    public void test1(){
    	User u = userService.getUserById("1");
    	System.out.println(u);
    }
	
}*/