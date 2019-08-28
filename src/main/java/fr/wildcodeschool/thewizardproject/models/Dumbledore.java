package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements  WizardInterface {

    private Outfit outfit;

    public Dumbledore(Outfit myOutfit) {
        outfit = myOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Nitwit! Blubber! Oddment! Tweak!";
    }

    @Override
    public String changeDress() {
        return outfit.dress();
    }
}
