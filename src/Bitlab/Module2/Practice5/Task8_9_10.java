package Bitlab.Module2.Practice5;

public class Task8_9_10 {
}

abstract class Engine {
    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();

    double getMaxSpeed(){
        return ((throttleEnergy() - breakEnergy()) * efficiency());
    }

    public Engine() {
    }

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }
}

class FerrariEngine extends Engine {
    double efficiency() {
        return 0.25;
    }

    double throttleEnergy() {
        return (engineVolume * cylinderAmount * 100);
    }

    double breakEnergy() {
        return (engineWeight * 2);
    }

    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }
}

class RenaultEnigine extends Engine {
    double extraTurboEnergy;

    double efficiency() {
        return 0.27;
    }

    double throttleEnergy() {
        return (engineVolume * cylinderAmount * 110 + extraTurboEnergy);
    }

    double breakEnergy() {
        return (engineWeight * 2.1);
    }

    public RenaultEnigine() {
    }

    public RenaultEnigine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }
}