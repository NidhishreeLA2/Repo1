package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PalindromeTest {
	@Test
	public void pal() {
		Palindrome p1 = new Palindrome();
		int n = p1.pal(121);
		assertEquals(1,n);
	}

}
