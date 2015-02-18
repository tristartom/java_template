package libfiles;

import libfiles.WWW;

public class XXX {
    public static void print() {
        WWW.print();
        System.out.println("printing XXX");
    }

    public void assertFailed(){
        assert false : "error messages: inside XXX class";
    }
}
