package users;

import static org.junit.Assert.*;
import users.User;
import org.junit.Before;
import org.junit.Test;
public class UserTest {

	private User user1;
	
	@Before
	public void setUp() throws Exception {
	   System.out.println("Run @Before"); // for illustration
	   Object pw = "Password".toCharArray();
	   user1 = new User("admin", "Frank", "Borland", pw, "frank.borland@microfocus.com");
	   user1.addUser(user1);
	}	

	@Test
	public void testUser() {
		String username = user1.getUsername();
		assertEquals("Check users username", "admin", username);
	}

	@Test
	public void testGetFirstName() {
		String firstName = user1.getFirstName();
		assertEquals("Check users firstname", "Frank", firstName);
	}

	@Test
	public void testSetFirstName() {
		user1.setFirstName("newName");
		assertEquals("Check setting firstname", "newName", user1.getFirstName());
	}

	@Test
	public void testGetLastName() {
		String lastName = user1.getLastName();
		assertEquals("Get user lastname", "Borland", lastName);
	}

	@Test
	public void testSetLastName() {
		user1.setLastName("newLastName");
		assertEquals("Check setting lastname", "newLastName", user1.getLastName());
	}

	@Test
	public void testGetUsername() {
		String username = user1.getUsername();
		assertEquals("Check getting username", "admin", username);
	}

	@Test
	public void testSetUsername() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserbyUsername() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserbyEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangePassword() {
		fail("Not yet implemented");
	}

}
