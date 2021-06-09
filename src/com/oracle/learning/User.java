package com.oracle.learning;

import java.util.Date;

public final class User {

  final   private  String username;
    final private int userage;

    final  private Date db;

    public String getUsername() {
        return username;
    }

    public int getUserage() {
        return userage;
    }

    public Date getDb() {
        return db;
    }

    public User(String username, int userage, Date db) {
        this.username = username;
        this.userage = userage;
        this.db = new Date(db.getTime());
    }




}
