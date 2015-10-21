package com.lf;

import org.springframework.stereotype.Component;

/**
 * @author Think
 * @create 2015-10-20 21:32.
 */
@Component
public class Juggler implements Performer {
    private int beanBags=3;
    public Juggler(){
    }
    public Juggler(int beanBags){
        this.beanBags=beanBags;
    }

    public void perform() throws Exception {
        System.out.println("JUGGLING "+beanBags+" Beanbags");
    }
}