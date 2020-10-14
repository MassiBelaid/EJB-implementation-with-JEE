package ejb;


import javax.ejb.Remote;

@Remote
public interface CounterEJBInterface {
    public void incr();
    public void decr();
    public void raz();
    public int getValue();
}
