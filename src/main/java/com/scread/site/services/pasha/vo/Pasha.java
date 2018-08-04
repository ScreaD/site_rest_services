package com.scread.site.services.pasha.vo;

public class Pasha {

    private final long id;
    private final String pashaIsTheBest = "Pasha is the best in the world!";

    public Pasha(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return pashaIsTheBest;
    }

}
