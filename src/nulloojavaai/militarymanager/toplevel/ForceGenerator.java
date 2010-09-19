/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel;

import nulloojavaai.militarymanager.MilitaryManager;

/**
 *
 * @author gajop
 */
public abstract class ForceGenerator {
    MilitaryManager militaryManager;
    ForceFactory forceFactory;

    public void setForceFactory(ForceFactory forceFactory) {
        this.forceFactory = forceFactory;
    }

    public void setMlitaryManager(MilitaryManager mIlitaryManager) {
        this.militaryManager = mIlitaryManager;
    }

    public ForceFactory getForceFactory() {
        return forceFactory;
    }

    public MilitaryManager getMilitaryManager() {
        return militaryManager;
    }

    public ForceGenerator(MilitaryManager military, ForceFactory forceFactory) {
        this.militaryManager = military;
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
        if (this.militaryManager != other.militaryManager && (this.militaryManager == null || !this.militaryManager.equals(other.militaryManager))) {
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
        hash = 79 * hash + (this.militaryManager != null ? this.militaryManager.hashCode() : 0);
        hash = 79 * hash + (this.forceFactory != null ? this.forceFactory.hashCode() : 0);
        return hash;
    }
    
}
