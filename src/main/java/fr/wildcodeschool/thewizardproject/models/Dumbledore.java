package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements  WizardInterface {

    private Outfit outfit;

    @Autowired
    public Dumbledore (Outfit myOutfit) {
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
