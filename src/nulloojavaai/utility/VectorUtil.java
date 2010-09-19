/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.utility;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

import java.util.Collection;
import javax.vecmath.Vector3f;

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
        Vector3f center = new Vector3f(0, 0, 0);
        if (!collection.isEmpty()) {
            for (AIFloat3 point : collection) {
                center.add(point.toVector3f());
            }
            center.scale(1.0f / collection.size());
        }
        return new AIFloat3(center);
    }
    public static AIFloat3 averageFromUnits(Collection<Unit> collection) {
        Vector3f center = new Vector3f(0, 0, 0);
        if (!collection.isEmpty()) {
            for (Unit point : collection) {
                center.add(point.getPos().toVector3f());
            }
            center.scale(1.0f / collection.size());
        }
        return new AIFloat3(center);
    }
}
