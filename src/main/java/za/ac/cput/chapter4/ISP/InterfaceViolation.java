package za.ac.cput.chapter4.ISP;


public interface InterfaceViolation {
    //an interface containing a lot of methods are called "fat" and therefore violates ISP
    int add(int c, int d);
    int subtract(int c, int d);
    int multiple(int c, int d);
    public int devide(int c, int d);
}
