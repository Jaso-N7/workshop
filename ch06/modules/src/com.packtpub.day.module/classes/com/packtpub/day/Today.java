package com.packtpub.day;

import java.time.LocalDate;

/**
 *
 * @author Jason Robinson
 */
public class Today {
    public String getToday() {
        return LocalDate.now().getDayOfWeek().toString();
    }
}
