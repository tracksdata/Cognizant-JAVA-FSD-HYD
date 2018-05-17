/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msat;

/**
 *
 * @author OH87005
 */
import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;

public class PersistentTime implements Serializable {

    private Date time;

    public PersistentTime() {
        time = Calendar.getInstance().getTime();
    }

    public Date getTime() {
        return time;
    }
}

