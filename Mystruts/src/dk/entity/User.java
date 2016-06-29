package dk.entity;

import java.util.List;

public class User {
	private String username;
	private String password;
	private int age;
	private List<String> booklist;
	/**
	 * @return the booklist
	 */
	public List<String> getBooklist() {
		return booklist;
	}
	/**
	 * @param booklist the booklist to set
	 */
	public void setBooklist(List<String> booklist) {
		this.booklist = booklist;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
