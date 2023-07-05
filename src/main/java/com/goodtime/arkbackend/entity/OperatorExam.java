package com.goodtime.arkbackend.entity;

public class OperatorExam {

    private String id;
    private String physicalStrength;
    private String battlefieldMobility;
    private String physiology;
    private String tacticalPlanning;
    private String combatSkills;
    private String originiumArtsAdaptability;

    public OperatorExam(String id, String physicalStrength, String battlefieldMobility, String physiology, String tacticalPlanning, String combatSkills, String originiumArtsAdaptability) {
        this.id = id;
        this.physicalStrength = physicalStrength;
        this.battlefieldMobility = battlefieldMobility;
        this.physiology = physiology;
        this.tacticalPlanning = tacticalPlanning;
        this.combatSkills = combatSkills;
        this.originiumArtsAdaptability = originiumArtsAdaptability;
    }

    public OperatorExam(String physicalStrength, String battlefieldMobility, String physiology, String tacticalPlanning, String combatSkills, String originiumArtsAdaptability) {
        this.physicalStrength = physicalStrength;
        this.battlefieldMobility = battlefieldMobility;
        this.physiology = physiology;
        this.tacticalPlanning = tacticalPlanning;
        this.combatSkills = combatSkills;
        this.originiumArtsAdaptability = originiumArtsAdaptability;
    }

    public OperatorExam(String id) {
        this.id = id;
    }

    public OperatorExam() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhysicalStrength() {
        return physicalStrength;
    }

    public void setPhysicalStrength(String physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    public String getBattlefieldMobility() {
        return battlefieldMobility;
    }

    public void setBattlefieldMobility(String battlefieldMobility) {
        this.battlefieldMobility = battlefieldMobility;
    }

    public String getPhysiology() {
        return physiology;
    }

    public void setPhysiology(String physiology) {
        this.physiology = physiology;
    }

    public String getTacticalPlanning() {
        return tacticalPlanning;
    }

    public void setTacticalPlanning(String tacticalPlanning) {
        this.tacticalPlanning = tacticalPlanning;
    }

    public String getCombatSkills() {
        return combatSkills;
    }

    public void setCombatSkills(String combatSkills) {
        this.combatSkills = combatSkills;
    }

    public String getOriginiumArtsAdaptability() {
        return originiumArtsAdaptability;
    }

    public void setOriginiumArtsAdaptability(String originiumArtsAdaptability) {
        this.originiumArtsAdaptability = originiumArtsAdaptability;
    }
}
