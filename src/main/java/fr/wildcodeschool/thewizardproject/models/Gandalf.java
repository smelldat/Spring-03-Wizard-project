package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface {

    private Outfit outfit;

    @Autowired
    public Gandalf (Outfit myOutfit) {
        outfit = myOutfit;
    }

    @Override
    public String giveAdvice() {
        return "A wizard is never late, nor is he early, he arrives precisely when he means to.";
    }

    @Override
    public String changeDress() {
        return outfit.dress();
    }
}
