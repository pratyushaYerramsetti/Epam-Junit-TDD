package RemoveFirst;

import static org.junit.Assert.*;

import org.junit.Test;

public class removeFirstTest {
	RemoveFirst rf = new RemoveFirst();
	@Test
	public void test() {
		assertEquals("ABB",rf.removeFst("AAABB"));
		assertEquals(rf.removeFst(""),"",rf.removeFst(""));
		assertEquals(rf.removeFst("A"),"",rf.removeFst("A"));
		
		assertEquals("BCD",rf.removeFst("ABCD"));
		assertEquals("BCD",rf.removeFst("BACD"));
		assertEquals("BBAA" ,rf.removeFst("BBAA"));
		assertEquals("BAA",rf.removeFst("AABAA"));
		
	}

}
