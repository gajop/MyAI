/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.utility;

import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.Unit;

import java.util.Collection;

/**
 *
 * @author gajop
 */
public abstract class VectorUtil {
    public static double distance(AIFloat3 first, AIFloat3 second) {
        double dx = first.x - second.x;
        double dy = first.y - second.y;
        double dz = first.z - second.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    public static AIFloat3 average(Collection<AIFloat3> collection) {
        AIFloat3 center = new AIFloat3(0, 0, 0);
        if (!collection.isEmpty()) {
            for (AIFloat3 point : collection) {
                center.add(point);
            }
            center.scale(1.0f / collection.size());
        }
        return center;
    }
    public static AIFloat3 averageFromUnits(Collection<Unit> collection) {
    	AIFloat3 center = new AIFloat3(0, 0, 0);
        if (!collection.isEmpty()) {
            for (Unit point : collection) {
                center.add(point.getPos());
            }
            center.scale(1.0f / collection.size());
        }
        return center;
    }
}
