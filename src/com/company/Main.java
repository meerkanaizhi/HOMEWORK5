package com.company;

public class Main {

    public static void main(String[] args) {
		Hero Strong = new Hero();
		Strong.damage = 500;
		Strong.health = 1000;
		Strong.name = "Iron man";
		Strong.superAbility= 1000;
		System.out.println(Strong.name + "  " + Strong.damage + " " + Strong.health + "  " + Strong.superAbility + "  ");
	    BOSS Leader = new BOSS();
	    Leader.damage = 200;
	    Leader.health = 1500;
	    Leader.name = "Big";
	    Leader.defence=700;
		System.out.println(Leader.name + "  " + Leader.damage + "   " +  Leader.health + "   " + Leader.defence + "   ");
    }
}

