package it.prova.provaset.model;

public class ProvaSet {

	private int x;
	private int y;

	public ProvaSet(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Object point) {
		if (point instanceof ProvaSet) {
			ProvaSet p = (ProvaSet) point;
			return (x == p.x && y == p.y) ? true : false;
		} else
			return false;
	}

	public int hashCode() {
		return 1;
	}
}
