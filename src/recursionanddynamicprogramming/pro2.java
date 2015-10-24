package recursionanddynamicprogramming;

import java.util.ArrayList;

class point {
	int x;
	int y;

	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class pro2 {
	public static boolean getPath(int x, int y, ArrayList<point> path) {
		point p = new point(x, y);
		path.add(p);
		if (x == 0 && y == 0)
			return true;
		boolean success = false;
		if (x >= 1 && isFree(x - 1, y)) {
			success = getPath(x - 1, y, path);
		}
		if (!success && y >= 1 && isFree(x, y - 1)) {
			success = getPath(x, y - 1, path);
		}
		if (success)
			path.add(p);
		return success;
	}

	public static boolean isFree(int x, int y) {
		boolean free = true;
		point[] p = new point[3];
		p[0] = new point(3, 5);
		p[1] = new point(6, 7);
		p[2] = new point(2, 9);
		for (int i = 0; i <= p.length; i++) {
			if ((p[i].x == x) && (p[i].y == y)) {
				free = false;
			}
		}
		return free;
	}
}
