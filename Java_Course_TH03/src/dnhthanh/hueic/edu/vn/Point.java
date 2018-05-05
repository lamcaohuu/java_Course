package caohuulam408.gmail.com;

public class Point {
	private float x;
	private float y;
	
	public Point() {
		this.x = Math.round(Math.random()*50);
		this.y = Math.round(Math.random()*50);
	}
	

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}