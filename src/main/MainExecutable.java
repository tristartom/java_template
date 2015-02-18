package main;
import libfiles.XXX;
import libfiles.WWW;

public class MainExecutable {
    public static void main(String[] args) {
        System.out.println("run XXX in main(): ");
        XXX xxx = new XXX();
        xxx.print();
        System.out.println("run WWW in main(): ");
        WWW.print();
    }
}
