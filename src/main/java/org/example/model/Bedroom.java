package org.example.model;

public class Bedroom extends Room {
    private String name;

    private Bed bed;

    private Wardrobe wardrobe;


    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Ceiling ceiling, Wardrobe wardrobe) {
        super(wall1, wall2, wall3, wall4, lamp, ceiling, wardrobe);
        this.bed=bed;
        this.name=name;
        this.wardrobe=wardrobe;
    }

    public void createBedroom(){
       getWall1().create();
       getCeiling().create();
       getWardrobe().add();

    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    @Override
    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
