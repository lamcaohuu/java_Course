package caohuulam408.gmail.com;

public class Round {
	private float R;
	private Point O;
	
	public Round() {
		this.R = Math.round(Math.random()*100);
		this.O = new Point();
	}
	

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}

	
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {

		float OAbp = (float) Math.sqrt((Math.pow(O.getX() - A.getX(), 2)) + (Math.pow(O.getY() - A.getY(), 2)));

		if (OAbp == R){
			return 0;
		}else if (OAbp < R){
			return -1;
		}else
			return 1;

	}
}
