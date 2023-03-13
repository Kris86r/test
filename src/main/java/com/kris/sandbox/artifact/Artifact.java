package com.kris.sandbox.artifact;

public class Artifact {
    int ordinalNumber;
    String generetedCulture;
    int century;

    public Artifact(int ordinalNumber, String generetedCulture, int century) {
        this.ordinalNumber = ordinalNumber;
        this.generetedCulture = generetedCulture;
        this.century = century;
    }

    public Artifact(int ordinalNumber, String generetedCulture) {
        this.ordinalNumber = ordinalNumber;
        this.generetedCulture = generetedCulture;
    }

    public Artifact(int ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(212121);
        Artifact artifact2 = new Artifact(212121, "Ацтеки");
        Artifact artifact3 = new Artifact(212121, "Ацтеки", 12);
    }
}
