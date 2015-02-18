package test;

public class TemplateTest extends junit.framework.TestCase {

    private java.util.List emptyList;

    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    public void setUp() {
        emptyList = new java.util.ArrayList();
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    public void tearDown() {
        emptyList = null;
    }

    public void testNothing() {
    }

    public void testPassArgumentToJUnitTestcase() {
        String arg = System.getProperty("tt_javaSystemPropertyKey_YYY", "default_value");
        assertTrue(arg.equals("value_in_commandline"));
    }

    public void testFail() {
        fail("An error message");
    }

    public void testError() {
        assert false : "error messages: failed in template test";
    }

    public void testException() {
        Object o = emptyList.get(0);
    }

}
