package users;

import static org.junit.Assert.*;
import users.User;
import org.junit.Before;
import org.junit.Test;


public class UserTest {

	private User user1;
	
	@Before
	public void setUp() throws Exception {
	   System.out.println("Run @Before");
	   Object pw = "Password".toCharArray();
	   user1 = new User("admin", "Frank", "Borland", pw, "frank.borland@microfocus.com");
	}	

	@Test
	public void testUser() {
		user1.addUser(user1);
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
		try{
		user1.setUsername("newUsername");
		assertEquals("Check getting username", "admin", user1.getUsername());
		}catch (Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}

	@Test
	public void testGetEmail() {
		String email = user1.getEmail();
		assertEquals("Check getting user email", "frank.borland@microfocus.com", email);
	}

	@Test
	public void testSetEmail() {
		String email = "newEmail@microfocus.com";
		user1.setEmail(email);
		assertEquals("Checking new email", email, user1.getEmail());
	}

	@Test
	public void testSetPassword() {
		Object newPw = "SetThisPassword";
		user1.setPassword(newPw);
	}

	@Test
	public void testAddUser() {
		user1.addUser(user1);
		assertEquals("User added successful", "admin", user1.getUsernames());
	}

	@Test
	public void testGetUserbyUsername() {
		user1.addUser(user1);
		String username = "admin";
		assertEquals("admin", user1.getUserbyUsername(username).getUsername());
	}

	@Test
	public void testGetUserbyEmail() {
		user1.addUser(user1);
		String email = "frank.borland@microfocus.com";
		assertEquals(email, user1.getUserbyEmail(email).getEmail());
	}

	@Test
	public void testRemoveUser() {
		try{
			user1.addUser(user1);
			assertEquals("User add successful", "admin", user1.getUsernames());
			assertTrue("User remove successful", user1.removeUser(user1.getUsername()));
		}catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	@Test
	public void testChangePassword() {
		fail("Not yet implemented");
	}

}
