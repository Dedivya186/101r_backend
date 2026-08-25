package com.day15;

abstract class Character {

    private String name;
    private int health;
    private int power;

    Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public void reduceHealth(int damage) {

        health = health - damage;

        if (health < 0) {
            health = 0;
        }
    }

    abstract void attack();

    abstract void defend();
}

class Warrior extends Character {

    Warrior(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    void attack() {
        System.out.println(getName() + " attacks with Sword");
    }

    @Override
    void defend() {
        System.out.println(getName() + " defends with Shield");
    }
}

class Mage extends Character {

    Mage(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    void attack() {
        System.out.println(getName() + " attacks with Magic");
    }

    @Override
    void defend() {
        System.out.println(getName() + " defends with Magic Barrier");
    }
}

class Archer extends Character {

    Archer(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    void attack() {
        System.out.println(getName() + " attacks with Bow");
    }

    @Override
    void defend() {
        System.out.println(getName() + " defends by Dodging");
    }
}

public class Game {

    public static void main(String[] args) {

        Character warrior =
            new Warrior("Warrior", 100, 30);

        Character mage =
            new Mage("Mage", 100, 40);

        Character archer =
            new Archer("Archer", 100, 25);

        Character[] characters = {
            warrior,
            mage,
            archer
        };

        for (Character c : characters) {

            c.attack();
            c.defend();

            System.out.println("Health: " + c.getHealth());
            System.out.println("-------------------");
        }

        System.out.println("Warrior is attacked!");

        warrior.reduceHealth(120);

        System.out.println(
            "Warrior Health: " + warrior.getHealth()
        );
    }
}