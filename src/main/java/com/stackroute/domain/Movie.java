package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    //    public void setActor(Actor actor) {
//        this.actor = actor;
//    }

    @Override
    public String  toString() {
        return "Actor name : " +actor.getName() +
                " Actor age : " + actor.getAge() +
                " Actor gender :- " + actor.getGender();
    }
}
