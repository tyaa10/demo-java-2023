package org.tyaa.demo.java2023.models;

public class Knight {

    public String name;
    public IWeapon weapon;

    public Knight(String name, IWeapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void doAction() {
        System.out.printf("Наносит удар оружием %s\n", weapon.getName());
    }
}
