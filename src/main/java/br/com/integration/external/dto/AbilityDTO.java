package br.com.integration.external.dto;

public class AbilityDTO {

    private boolean is_hidden;
    private int slot;
    private AbilityDescriptionDTO ability;

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public AbilityDescriptionDTO getAbility() {
        return ability;
    }

    public void setAbility(AbilityDescriptionDTO ability) {
        this.ability = ability;
    }
}
