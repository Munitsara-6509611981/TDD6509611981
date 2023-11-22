package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
		
	}
	
	public void testPushElmToStack() throws Exception {
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		s1.push(new Integer(1));
		int top = (Integer)s1.getTop();
		
		assertEquals(1, top);

	}
	
	public void testLastInFirstOut() throws Exception {
        Stack s1 = new Stack();
        
        
        s1.push(new Integer(1));
        s1.push(new Integer(2));
        s1.push(new Integer(3));
        
        
        int top1 = (Integer) s1.getTop();
        assertEquals(3, top1);

        
        Object poppedElement = s1.pop();
        int top2 = (Integer) s1.getTop();
        
        assertEquals(3, poppedElement);
        assertEquals(2, top2);
    }
	public void testPushElmToLimitedSizeStack() throws Exception {
        Stack s1 = new Stack();
        s1.push(new Integer(1));
        s1.push(new Integer(2));
        
        assertTrue(s1.isFull());
        
        // Try pushing one more element to a full stack
        try {
            s1.push(new Integer(3));
            fail("Expected IllegalStateException, but no exception was thrown");
        } catch (IllegalStateException e) {
            // This is expected
        }
    }
	
}
	