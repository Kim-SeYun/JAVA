package section02.exam10;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE;
	static {
		EARTH_SURFACE = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}
