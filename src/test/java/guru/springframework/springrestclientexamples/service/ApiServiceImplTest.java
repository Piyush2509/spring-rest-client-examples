package guru.springframework.springrestclientexamples.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.api.domain.User;

/**
 * 
 * Created by piyush.b.kumar on Jun 9, 2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

	@Autowired
	ApiService apiService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetUsers() throws Exception {
		List<User> users = apiService.getUsers(3);

		assertEquals(4, users.size());
	}

}
