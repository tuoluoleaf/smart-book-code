package org.smart4j.chapter2.helper;

import org.junit.Test;

/**
 * @author tuoluolef
 * @date 2022/2/11 15:18
 */
public class DatabaseHelperTest {

    // getSimpleName
    @Test
    public void test() {
        DatabaseHelper databaseHelper = new DatabaseHelper();
        String simpleName = databaseHelper.getClass().getSimpleName();
        System.out.println(simpleName);
    }

}