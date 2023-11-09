package org.example;

public class Owner {

    private Privilege privilege;

    public Owner() {
    }

    public Owner(Privilege privilege) {
        this.privilege = privilege;
    }

    public Privilege getPrivilege() {
        return privilege;
    }
}
