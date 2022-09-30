package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PrimenumberTest {
	@Test
	public void solve() {
		Primenumber p = new Primenumber();
		int n = p.check(4);
		assertEquals(0,n);
	}
}