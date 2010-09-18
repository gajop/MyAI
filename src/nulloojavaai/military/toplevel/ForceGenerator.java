/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military.toplevel;

import nulloojavaai.military.Military;

/**
 *
 * @author gajop
 */
public abstract class ForceGenerator {
    Military military;
    ForceFactory forceFactory;

    public void setForceFactory(ForceFactory forceFactory) {
        this.forceFactory = forceFactory;
    }

    public void setMilitary(Military military) {
        this.military = military;
    }

    public ForceFactory getForceFactory() {
        return forceFactory;
    }

    public Military getMilitary() {
        return military;
    }

    public ForceGenerator(Military military, ForceFactory forceFactory) {
        this.military = military;
        this.forceFactory = forceFactory;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ForceGenerator other = (ForceGenerator) obj;
        if (this.military != other.military && (this.military == null || !this.military.equals(other.military))) {
            return false;
        }
        if (this.forceFactory != other.forceFactory && (this.forceFactory == null || !this.forceFactory.equals(other.forceFactory))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.military != null ? this.military.hashCode() : 0);
        hash = 79 * hash + (this.forceFactory != null ? this.forceFactory.hashCode() : 0);
        return hash;
    }
    
}
