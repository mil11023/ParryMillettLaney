/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findingBrotherJones.model;

import java.util.Objects;

/**
 *
 * @author cameronmillett
 */
public class Object implements serializable {
    
    private String pickUp;
    private String give;
    private String viewItem;

    public Object() {
    }
    
    

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getGive() {
        return give;
    }

    public void setGive(String give) {
        this.give = give;
    }

    public String getViewItem() {
        return viewItem;
    }

    public void setViewItem(String viewItem) {
        this.viewItem = viewItem;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.pickUp);
        hash = 17 * hash + Objects.hashCode(this.give);
        hash = 17 * hash + Objects.hashCode(this.viewItem);
        return hash;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Object other = (Object) obj;
        if (!Objects.equals(this.pickUp, other.pickUp)) {
            return false;
        }
        if (!Objects.equals(this.give, other.give)) {
            return false;
        }
        if (!Objects.equals(this.viewItem, other.viewItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Object{" + "pickUp=" + pickUp + ", give=" + give + ", viewItem=" + viewItem + '}';
    }
    
    
      
}
