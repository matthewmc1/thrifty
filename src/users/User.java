package users;

import java.util.ArrayList;
import sun.security.util.Password;

class User {
	
	/*
	 * Variables used for creating user accounts.
	 */
	private ArrayList<User> users = new ArrayList<User>();
	private String username;
	private String firstName;
	private String lastName;
	private Password password;
	private String email;
	
	//User Class.
	public User(String username, String firstName, String lastName, Password password, String email)
	{
		this.setUsername(username);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPassword(password);
		this.setEmail(email);
	}
	
	/*
	* Getters and Setters
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(Password password) {
		this.password = password;
	}
	
	/*
	 * Add user to ArrayList.
	 */
	public User addUser(User us)
	{
		users.add(us);
		return us;
	}
	
	/*
	 * Search user arraylist by username.
	 */
	public User getUserbyUsername(String username)
	{
		for(User user: users)
		{
			if(user.username.equals(username))
			{
				System.out.println("Username: " + user.getUsername());
				return user;
			}
			else{
				System.out.println("User does not exist in ArrayList");
				System.out.println("Try Again!!");
			}
		}
		return null;
	}
	
	/*
	 * Search user arraylist by email.
	 */
	public User getUserbyEmail(String email)
	{
		for(User user: users)
		{
			if(user.email == email)
			{
				return user;
			}
			else{
				System.out.println("User does not exist in ArrayList");
				System.out.println("Try Again!!");
			}
		}
		return null;
	}
	
	/*
	 * Remove userbyusername
	 */
	public boolean removeUser(String username)
	{
		for(User user: users)
		{
			if(!users.isEmpty())
			{
				if(user.username.equals(username))
				{
					users.remove(users.indexOf(username));
				}else{
					System.out.println("Username does not exist");
				}
			}else{
				System.out.println("Userlist is Empty! Add some users.");
			}
		}
		return false;
	}
	
	/*
	 * Method will return true if user successfully changes their password.
	 */
	public boolean changePassword(String username, Password oldPassword, Password newPassword)
	{
		for(User user: users)
		{
			if(user.username.equals(username))
			{	
				if(user.password.equals(oldPassword))
				{
					user.setPassword(newPassword);
				}else{
					System.out.println("Password's do not match");
					System.out.println("Try Again!!");
				}
			}else{
				System.out.println("Username does not exist");
				System.out.println("Try Again!!");
			}
		}
		return false;
	}

}
