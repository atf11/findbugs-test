package com.richo.test.findbugs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Api api;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        api.nullable().contains("asd");
    }
}
