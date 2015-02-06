package com.richo.test.findbugs;

import javax.annotation.Nullable;

/**
 * Created by richard.tjerngren on 2015-02-06.
 */
public interface Api {
    @Nullable
    String nullable();
}
