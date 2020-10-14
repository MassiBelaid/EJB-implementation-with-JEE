package ejb;

import javax.ejb.Stateful;


@Stateful
public class CounterEJBImpl implements CounterEJBInterface{

    
    int value =0;
    
   
    public void incr() {
        value ++;
    }

    
    public void decr() {
        value --;
    }

    
    public void raz() {
        value = 0;
    }

    
    public int getValue() {
        return value;
    }
    
}
