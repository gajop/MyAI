/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubMap extends AbstractMap implements Map {

	public void setChecksum(int checksum) {
		this.checksum = checksum;
	}
	private int checksum = 0;
	@Override
	public int getChecksum() {
		return checksum;
	}

	public void setStartPos(AIFloat3 startPos) {
		this.startPos = startPos;
	}
	private AIFloat3 startPos = null;
	@Override
	public AIFloat3 getStartPos() {
		return startPos;
	}

	public void setMousePos(AIFloat3 mousePos) {
		this.mousePos = mousePos;
	}
	private AIFloat3 mousePos = null;
	@Override
	public AIFloat3 getMousePos() {
		return mousePos;
	}

	@Override
	public boolean isPosInCamera(AIFloat3 pos, float radius) {
		return false;
	}

	/**
	 * Returns the maps center heightmap width.
	 * @see getHeightMap()
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	private int width = 0;
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * Returns the maps center heightmap height.
	 * @see getHeightMap()
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	private int height = 0;
	@Override
	public int getHeight() {
		return height;
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
	public void setHeightMap(java.util.List<Float> heightMap) {
		this.heightMap = heightMap;
	}
	private java.util.List<Float> heightMap = null;
	@Override
	public java.util.List<Float> getHeightMap() {
		return heightMap;
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
	public void setCornersHeightMap(java.util.List<Float> cornersHeightMap) {
		this.cornersHeightMap = cornersHeightMap;
	}
	private java.util.List<Float> cornersHeightMap = null;
	@Override
	public java.util.List<Float> getCornersHeightMap() {
		return cornersHeightMap;
	}

	public void setMinHeight(float minHeight) {
		this.minHeight = minHeight;
	}
	private float minHeight = 0;
	@Override
	public float getMinHeight() {
		return minHeight;
	}

	public void setMaxHeight(float maxHeight) {
		this.maxHeight = maxHeight;
	}
	private float maxHeight = 0;
	@Override
	public float getMaxHeight() {
		return maxHeight;
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
	public void setSlopeMap(java.util.List<Float> slopeMap) {
		this.slopeMap = slopeMap;
	}
	private java.util.List<Float> slopeMap = null;
	@Override
	public java.util.List<Float> getSlopeMap() {
		return slopeMap;
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
	public void setLosMap(java.util.List<Integer> losMap) {
		this.losMap = losMap;
	}
	private java.util.List<Integer> losMap = null;
	@Override
	public java.util.List<Integer> getLosMap() {
		return losMap;
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
	public void setRadarMap(java.util.List<Integer> radarMap) {
		this.radarMap = radarMap;
	}
	private java.util.List<Integer> radarMap = null;
	@Override
	public java.util.List<Integer> getRadarMap() {
		return radarMap;
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
	public void setJammerMap(java.util.List<Integer> jammerMap) {
		this.jammerMap = jammerMap;
	}
	private java.util.List<Integer> jammerMap = null;
	@Override
	public java.util.List<Integer> getJammerMap() {
		return jammerMap;
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
		return null;
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
		return null;
	}

	/**
	 * Returns the average resource income for an extractor on one of the evaluated positions.
	 */
	@Override
	public float getResourceMapSpotsAverageIncome(Resource resource) {
		return 0;
	}

	/**
	 * Returns the nearest resource extractor spot to a specified position out of the evaluated list.
	 */
	@Override
	public AIFloat3 getResourceMapSpotsNearest(Resource resource, AIFloat3 pos) {
		return null;
	}

	/**
	 * Returns the archive hash of the map.
	 * Use this for reference to the map, eg. in a cache-file, wherever human
	 * readability does not matter.
	 * This value will never be the same for two maps not having equal content.
	 * Tip: convert to 64 Hex chars for use in file names.
	 * @see getName()
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}
	private int hash = 0;
	@Override
	public int getHash() {
		return hash;
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
	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Returns the human readbale name of the map.
	 * @see getName()
	 */
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	private String humanName = "";
	@Override
	public String getHumanName() {
		return humanName;
	}

	/**
	 * Gets the elevation of the map at position (x, z)
	 */
	@Override
	public float getElevationAt(float x, float z) {
		return 0;
	}

	/**
	 * Returns what value 255 in the resource map is worth
	 */
	@Override
	public float getMaxResource(Resource resource) {
		return 0;
	}

	/**
	 * Returns extraction radius for resource extractors
	 */
	@Override
	public float getExtractorRadius(Resource resource) {
		return 0;
	}

	public void setMinWind(float minWind) {
		this.minWind = minWind;
	}
	private float minWind = 0;
	@Override
	public float getMinWind() {
		return minWind;
	}

	public void setMaxWind(float maxWind) {
		this.maxWind = maxWind;
	}
	private float maxWind = 0;
	@Override
	public float getMaxWind() {
		return maxWind;
	}

	public void setCurWind(float curWind) {
		this.curWind = curWind;
	}
	private float curWind = 0;
	@Override
	public float getCurWind() {
		return curWind;
	}

	public void setTidalStrength(float tidalStrength) {
		this.tidalStrength = tidalStrength;
	}
	private float tidalStrength = 0;
	@Override
	public float getTidalStrength() {
		return tidalStrength;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}
	private float gravity = 0;
	@Override
	public float getGravity() {
		return gravity;
	}

	/**
	 * Returns all points drawn with this AIs team color,
	 * and additionally the ones drawn with allied team colors,
	 * if <code>includeAllies</code> is true.
	 */
	@Override
	public java.util.List<Point> getPoints(boolean includeAllies) {
		return null;
	}

	/**
	 * Returns all lines drawn with this AIs team color,
	 * and additionally the ones drawn with allied team colors,
	 * if <code>includeAllies</code> is true.
	 */
	@Override
	public java.util.List<Line> getLines(boolean includeAllies) {
		return null;
	}

	@Override
	public boolean isPossibleToBuildAt(UnitDef unitDef, AIFloat3 pos, int facing) {
		return false;
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
		return null;
	}

	public void setDrawer(Drawer drawer) {
		this.drawer = drawer;
	}
	private Drawer drawer = null;
	@Override
	public Drawer getDrawer() {
		return drawer;
	}

}

