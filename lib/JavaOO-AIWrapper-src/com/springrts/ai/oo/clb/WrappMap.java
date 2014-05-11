/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.AICallback;
import com.springrts.ai.Util;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class WrappMap extends AbstractMap implements Map {

	private AICallback innerCallback = null;

	public WrappMap(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Map getInstance(AICallback innerCallback) {

		Map _ret = null;
		_ret = new WrappMap(innerCallback);
		return _ret;
	}


	@Override
	public int getChecksum() {

		int _ret_int;

		_ret_int = innerCallback.Map_getChecksum();
		return _ret_int;
	}

	@Override
	public AIFloat3 getStartPos() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Map_getStartPos(return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public AIFloat3 getMousePos() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Map_getMousePos(return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public boolean isPosInCamera(AIFloat3 pos, float radius) {

		boolean _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Map_isPosInCamera(pos_posF3, radius);
		return _ret_int;
	}

	/**
	 * Returns the maps center heightmap width.
	 * @see getHeightMap()
	 */
	@Override
	public int getWidth() {

		int _ret_int;

		_ret_int = innerCallback.Map_getWidth();
		return _ret_int;
	}

	/**
	 * Returns the maps center heightmap height.
	 * @see getHeightMap()
	 */
	@Override
	public int getHeight() {

		int _ret_int;

		_ret_int = innerCallback.Map_getHeight();
		return _ret_int;
	}

	/**
	 * Returns the height for the center of the squares.
	 * This differs slightly from the drawn map, since
	 * that one uses the height at the corners.
	 * Note that the actual map is 8 times larger (in each dimension) and
	 * all other maps (slope, los, resources, etc.) are relative to the
	 * size of the heightmap.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 8*8 in size
	 * - the value for the full resolution position (x, z) is at index (z * width + x)
	 * - the last value, bottom right, is at index (width * height - 1)
	 * 
	 * @see getCornersHeightMap()
	 */
	@Override
	public java.util.List<Float> getHeightMap() {

		int heights_sizeMax;
		int heights_raw_size;
		float[] heights;
		java.util.List<Float> heights_list;
		int heights_size;
		int _ret_int;

		heights_sizeMax = Integer.MAX_VALUE;
		heights = null;
		heights_size = innerCallback.Map_getHeightMap(heights, heights_sizeMax);
		heights_sizeMax = heights_size;
		heights_raw_size = heights_size;
		heights = new float[heights_raw_size];

		_ret_int = innerCallback.Map_getHeightMap(heights, heights_sizeMax);
		heights_list = new java.util.ArrayList<Float>(heights_size);
		for (int i=0; i < heights_sizeMax; i++) {
			heights_list.add(heights[i]);
		}

		return heights_list;
	}

	/**
	 * Returns the height for the corners of the squares.
	 * This is the same like the drawn map.
	 * It is one unit wider and one higher then the centers height map.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - 4 points mark the edges of an area of 8*8 in size
	 * - the value for upper left corner of the full resolution position (x, z) is at index (z * width + x)
	 * - the last value, bottom right, is at index ((width+1) * (height+1) - 1)
	 * 
	 * @see getHeightMap()
	 */
	@Override
	public java.util.List<Float> getCornersHeightMap() {

		int cornerHeights_sizeMax;
		int cornerHeights_raw_size;
		float[] cornerHeights;
		java.util.List<Float> cornerHeights_list;
		int cornerHeights_size;
		int _ret_int;

		cornerHeights_sizeMax = Integer.MAX_VALUE;
		cornerHeights = null;
		cornerHeights_size = innerCallback.Map_getCornersHeightMap(cornerHeights, cornerHeights_sizeMax);
		cornerHeights_sizeMax = cornerHeights_size;
		cornerHeights_raw_size = cornerHeights_size;
		cornerHeights = new float[cornerHeights_raw_size];

		_ret_int = innerCallback.Map_getCornersHeightMap(cornerHeights, cornerHeights_sizeMax);
		cornerHeights_list = new java.util.ArrayList<Float>(cornerHeights_size);
		for (int i=0; i < cornerHeights_sizeMax; i++) {
			cornerHeights_list.add(cornerHeights[i]);
		}

		return cornerHeights_list;
	}

	@Override
	public float getMinHeight() {

		float _ret_int;

		_ret_int = innerCallback.Map_getMinHeight();
		return _ret_int;
	}

	@Override
	public float getMaxHeight() {

		float _ret_int;

		_ret_int = innerCallback.Map_getMaxHeight();
		return _ret_int;
	}

	/**
	 * the slope map
	 * The values are 1 minus the y-component of the (average) facenormal of the square.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 2*2 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 2)
	 * - the last value, bottom right, is at index (width/2 * height/2 - 1)
	 */
	@Override
	public java.util.List<Float> getSlopeMap() {

		int slopes_sizeMax;
		int slopes_raw_size;
		float[] slopes;
		java.util.List<Float> slopes_list;
		int slopes_size;
		int _ret_int;

		slopes_sizeMax = Integer.MAX_VALUE;
		slopes = null;
		slopes_size = innerCallback.Map_getSlopeMap(slopes, slopes_sizeMax);
		slopes_sizeMax = slopes_size;
		slopes_raw_size = slopes_size;
		slopes = new float[slopes_raw_size];

		_ret_int = innerCallback.Map_getSlopeMap(slopes, slopes_sizeMax);
		slopes_list = new java.util.ArrayList<Float>(slopes_size);
		for (int i=0; i < slopes_sizeMax; i++) {
			slopes_list.add(slopes[i]);
		}

		return slopes_list;
	}

	/**
	 * the level of sight map
	 * gs->mapx >> losMipLevel
	 * A square with value zero means you do not have LOS coverage on it.
	 * Mod_getLosMipLevel
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - resolution factor (res) is min(1, 1 << Mod_getLosMipLevel())
	 *   examples:
	 *   	+ losMipLevel(0) -> res(1)
	 *   	+ losMipLevel(1) -> res(2)
	 *   	+ losMipLevel(2) -> res(4)
	 *   	+ losMipLevel(3) -> res(8)
	 * - each data position is res*res in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / res)
	 * - the last value, bottom right, is at index (width/res * height/res - 1)
	 */
	@Override
	public java.util.List<Integer> getLosMap() {

		int losValues_sizeMax;
		int losValues_raw_size;
		int[] losValues;
		java.util.List<Integer> losValues_list;
		int losValues_size;
		int _ret_int;

		losValues_sizeMax = Integer.MAX_VALUE;
		losValues = null;
		losValues_size = innerCallback.Map_getLosMap(losValues, losValues_sizeMax);
		losValues_sizeMax = losValues_size;
		losValues_raw_size = losValues_size;
		losValues = new int[losValues_raw_size];

		_ret_int = innerCallback.Map_getLosMap(losValues, losValues_sizeMax);
		losValues_list = new java.util.ArrayList<Integer>(losValues_size);
		for (int i=0; i < losValues_sizeMax; i++) {
			losValues_list.add(losValues[i]);
		}

		return losValues_list;
	}

	/**
	 * the radar map
	 * A square with value 0 means you do not have radar coverage on it.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 8*8 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 8)
	 * - the last value, bottom right, is at index (width/8 * height/8 - 1)
	 */
	@Override
	public java.util.List<Integer> getRadarMap() {

		int radarValues_sizeMax;
		int radarValues_raw_size;
		int[] radarValues;
		java.util.List<Integer> radarValues_list;
		int radarValues_size;
		int _ret_int;

		radarValues_sizeMax = Integer.MAX_VALUE;
		radarValues = null;
		radarValues_size = innerCallback.Map_getRadarMap(radarValues, radarValues_sizeMax);
		radarValues_sizeMax = radarValues_size;
		radarValues_raw_size = radarValues_size;
		radarValues = new int[radarValues_raw_size];

		_ret_int = innerCallback.Map_getRadarMap(radarValues, radarValues_sizeMax);
		radarValues_list = new java.util.ArrayList<Integer>(radarValues_size);
		for (int i=0; i < radarValues_sizeMax; i++) {
			radarValues_list.add(radarValues[i]);
		}

		return radarValues_list;
	}

	/**
	 * the radar jammer map
	 * A square with value 0 means you do not have radar jamming coverage.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 8*8 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 8)
	 * - the last value, bottom right, is at index (width/8 * height/8 - 1)
	 */
	@Override
	public java.util.List<Integer> getJammerMap() {

		int jammerValues_sizeMax;
		int jammerValues_raw_size;
		int[] jammerValues;
		java.util.List<Integer> jammerValues_list;
		int jammerValues_size;
		int _ret_int;

		jammerValues_sizeMax = Integer.MAX_VALUE;
		jammerValues = null;
		jammerValues_size = innerCallback.Map_getJammerMap(jammerValues, jammerValues_sizeMax);
		jammerValues_sizeMax = jammerValues_size;
		jammerValues_raw_size = jammerValues_size;
		jammerValues = new int[jammerValues_raw_size];

		_ret_int = innerCallback.Map_getJammerMap(jammerValues, jammerValues_sizeMax);
		jammerValues_list = new java.util.ArrayList<Integer>(jammerValues_size);
		for (int i=0; i < jammerValues_sizeMax; i++) {
			jammerValues_list.add(jammerValues[i]);
		}

		return jammerValues_list;
	}

	/**
	 * resource maps
	 * This map shows the resource density on the map.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 2*2 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 2)
	 * - the last value, bottom right, is at index (width/2 * height/2 - 1)
	 */
	@Override
	public java.util.List<Short> getResourceMapRaw(Resource resource) {

		int resources_sizeMax;
		int resources_raw_size;
		short[] resources;
		java.util.List<Short> resources_list;
		int resources_size;
		int _ret_int;

		int resourceId = resource.getResourceId();
		resources_sizeMax = Integer.MAX_VALUE;
		resources = null;
		resources_size = innerCallback.Map_getResourceMapRaw(resourceId, resources, resources_sizeMax);
		resources_sizeMax = resources_size;
		resources_raw_size = resources_size;
		resources = new short[resources_raw_size];

		_ret_int = innerCallback.Map_getResourceMapRaw(resourceId, resources, resources_sizeMax);
		resources_list = new java.util.ArrayList<Short>(resources_size);
		for (int i=0; i < resources_sizeMax; i++) {
			resources_list.add(resources[i]);
		}

		return resources_list;
	}

	/**
	 * Returns positions indicating where to place resource extractors on the map.
	 * Only the x and z values give the location of the spots, while the y values
	 * represents the actual amount of resource an extractor placed there can make.
	 * You should only compare the y values to each other, and not try to estimate
	 * effective output from spots.
	 */
	@Override
	public java.util.List<AIFloat3> getResourceMapSpotsPositions(Resource resource) {

		int spots_AposF3_sizeMax;
		int spots_AposF3_raw_size;
		float[] spots_AposF3;
		java.util.List<AIFloat3> spots_AposF3_list;
		int spots_AposF3_size;
		int _ret_int;

		int resourceId = resource.getResourceId();
		spots_AposF3_sizeMax = Integer.MAX_VALUE;
		spots_AposF3 = null;
		spots_AposF3_size = innerCallback.Map_getResourceMapSpotsPositions(resourceId, spots_AposF3, spots_AposF3_sizeMax);
		spots_AposF3_sizeMax = spots_AposF3_size;
		spots_AposF3_raw_size = spots_AposF3_size;
		if (spots_AposF3_size % 3 != 0) {
			throw new RuntimeException("returned AIFloat3 array has incorrect size (" + spots_AposF3_size+ "), should be a multiple of 3.");
		}
		spots_AposF3_size /= 3;
		spots_AposF3 = new float[spots_AposF3_raw_size];

		_ret_int = innerCallback.Map_getResourceMapSpotsPositions(resourceId, spots_AposF3, spots_AposF3_sizeMax);
		spots_AposF3_list = new java.util.ArrayList<AIFloat3>(spots_AposF3_size);
		for (int i=0; i < spots_AposF3_sizeMax; i++) {
			spots_AposF3_list.add(new AIFloat3(spots_AposF3[i], spots_AposF3[++i], spots_AposF3[++i]));
		}

		return spots_AposF3_list;
	}

	/**
	 * Returns the average resource income for an extractor on one of the evaluated positions.
	 */
	@Override
	public float getResourceMapSpotsAverageIncome(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Map_getResourceMapSpotsAverageIncome(resourceId);
		return _ret_int;
	}

	/**
	 * Returns the nearest resource extractor spot to a specified position out of the evaluated list.
	 */
	@Override
	public AIFloat3 getResourceMapSpotsNearest(Resource resource, AIFloat3 pos) {

		AIFloat3 _ret;

		float[] pos_posF3 = pos.toFloatArray();
		float[] return_posF3_out = new float[3];
		int resourceId = resource.getResourceId();

		innerCallback.Map_getResourceMapSpotsNearest(resourceId, pos_posF3, return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	/**
	 * Returns the archive hash of the map.
	 * Use this for reference to the map, eg. in a cache-file, wherever human
	 * readability does not matter.
	 * This value will never be the same for two maps not having equal content.
	 * Tip: convert to 64 Hex chars for use in file names.
	 * @see getName()
	 */
	@Override
	public int getHash() {

		int _ret_int;

		_ret_int = innerCallback.Map_getHash();
		return _ret_int;
	}

	/**
	 * Returns the name of the map.
	 * Use this for reference to the map, eg. in cache- or config-file names
	 * which are map related, wherever humans may come in contact with the reference.
	 * Be aware though, that this may contain special characters and spaces,
	 * and may not be used as a file name without checks and replaces.
	 * Tip: replace every char matching [^0-9a-zA-Z_-.] with '_'
	 * @see getHash()
	 * @see getHumanName()
	 */
	@Override
	public String getName() {

		String _ret_int;

		_ret_int = innerCallback.Map_getName();
		return _ret_int;
	}

	/**
	 * Returns the human readbale name of the map.
	 * @see getName()
	 */
	@Override
	public String getHumanName() {

		String _ret_int;

		_ret_int = innerCallback.Map_getHumanName();
		return _ret_int;
	}

	/**
	 * Gets the elevation of the map at position (x, z)
	 */
	@Override
	public float getElevationAt(float x, float z) {

		float _ret_int;

		_ret_int = innerCallback.Map_getElevationAt(x, z);
		return _ret_int;
	}

	/**
	 * Returns what value 255 in the resource map is worth
	 */
	@Override
	public float getMaxResource(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Map_getMaxResource(resourceId);
		return _ret_int;
	}

	/**
	 * Returns extraction radius for resource extractors
	 */
	@Override
	public float getExtractorRadius(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Map_getExtractorRadius(resourceId);
		return _ret_int;
	}

	@Override
	public float getMinWind() {

		float _ret_int;

		_ret_int = innerCallback.Map_getMinWind();
		return _ret_int;
	}

	@Override
	public float getMaxWind() {

		float _ret_int;

		_ret_int = innerCallback.Map_getMaxWind();
		return _ret_int;
	}

	@Override
	public float getCurWind() {

		float _ret_int;

		_ret_int = innerCallback.Map_getCurWind();
		return _ret_int;
	}

	@Override
	public float getTidalStrength() {

		float _ret_int;

		_ret_int = innerCallback.Map_getTidalStrength();
		return _ret_int;
	}

	@Override
	public float getGravity() {

		float _ret_int;

		_ret_int = innerCallback.Map_getGravity();
		return _ret_int;
	}

	/**
	 * Returns all points drawn with this AIs team color,
	 * and additionally the ones drawn with allied team colors,
	 * if <code>includeAllies</code> is true.
	 */
	@Override
	public java.util.List<Point> getPoints(boolean includeAllies) {

		java.util.List<Point> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

		_ret_int = innerCallback.Map_getPoints(includeAllies);
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<Point>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappPoint.getInstance(innerCallback, i));
		}

		return RETURN_SIZE_list;
	}

	/**
	 * Returns all lines drawn with this AIs team color,
	 * and additionally the ones drawn with allied team colors,
	 * if <code>includeAllies</code> is true.
	 */
	@Override
	public java.util.List<Line> getLines(boolean includeAllies) {

		java.util.List<Line> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

		_ret_int = innerCallback.Map_getLines(includeAllies);
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<Line>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappLine.getInstance(innerCallback, i));
		}

		return RETURN_SIZE_list;
	}

	@Override
	public boolean isPossibleToBuildAt(UnitDef unitDef, AIFloat3 pos, int facing) {

		boolean _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		int unitDefId = unitDef.getUnitDefId();

		_ret_int = innerCallback.Map_isPossibleToBuildAt(unitDefId, pos_posF3, facing);
		return _ret_int;
	}

	/**
	 * Returns the closest position from a given position that a building can be
	 * built at.
	 * @param minDist the distance in 1/(SQUARE_SIZE * 2) = 1/16 of full map
	 *                resolution, that the building must keep to other
	 *                buildings; this makes it easier to keep free paths through
	 *                a base
	 * @return actual map position with x, y and z all beeing positive,
	 *         or float[3]{-1, 0, 0} if no suitable position is found.
	 */
	@Override
	public AIFloat3 findClosestBuildSite(UnitDef unitDef, AIFloat3 pos, float searchRadius, int minDist, int facing) {

		AIFloat3 _ret;

		float[] pos_posF3 = pos.toFloatArray();
		float[] return_posF3_out = new float[3];
		int unitDefId = unitDef.getUnitDefId();

		innerCallback.Map_findClosestBuildSite(unitDefId, pos_posF3, searchRadius, minDist, facing, return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public Drawer getDrawer() {

		Drawer _ret_int_out;

		_ret_int_out = WrappDrawer.getInstance(innerCallback);

		return _ret_int_out;
	}
}

