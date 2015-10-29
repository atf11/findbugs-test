package com.richo.test.findbugs;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Hello world!
 *
 */
public class App
{
    public static final Api api = new Api() {
        //@Nullable
        //@Nonnull
        @Override
        public String nullable() {
            if(System.currentTimeMillis() > 1)
                return null; //This should not be allowed due to annotation in package-info
            return "asd";
        }
    };
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        double testtime = 1/100/111/100/100/100/1000;
        boolean bool = api.nullable().contains("asd"); //This should not warn for NPE
        System.out.println(bool);

    }
}
