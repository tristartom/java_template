package test;
import libfiles.XXX;

public class LibXXXTest extends junit.framework.TestCase {

    private java.util.List emptyList;
    public void testXXX() {
        XXX xxx = new XXX();
        XXX.print();
    }

    public void testErrorInClass(){
        XXX xxx = new XXX();
        xxx.assertFailed();
    }
}
