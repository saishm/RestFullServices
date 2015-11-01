package ie.template.services.support;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ie.template.services.annotations.SingleThreadUnitTest;

@Category(SingleThreadUnitTest.class)
public class HomeServicesSingleThreadTest {
	@Test
	public void testGetTestModelDetails() {
		assertTrue(true);
	}
}
