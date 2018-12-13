package com.revature;

import java.util.Arrays;

import com.revature.entity.OnlineOrder;
import com.revature.entity.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Order order = new OnlineOrder(1, args);
    }
}
