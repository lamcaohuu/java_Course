package caohuulam408.gmail.com;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		int numP = 5;
		int numR = 3;
		ArrayList<Point> points = new ArrayList<Point>();
		ArrayList<Round> rounds = new ArrayList<Round>();
	
		for(int i=0; i<numP; i++)
			points.add(new Point());
		\
		for(int i=0; i<numR; i++)
			rounds.add(new Round());
		
		for (int i = 0; i < numR; i++) {
			for (int j = 0; j < numP; j++) {
				int KQ;
				KQ = rounds.get(i).ViTriTuongDoiDiemVoiDuongTron(points.get(j));
				if (KQ == 0) {
					System.out.println("Điểm " + (j + 1) + " nằm trên đường tròn " + (i + 1));
				}else if (KQ == -1) {
					System.out.println("Điểm " + (j + 1) + " nằm trong đường tròn " + (i + 1));
				}else if(KQ == 1){
					System.out.println("Điểm " + (j + 1) + " nằm ngoài đường tròn " + (i + 1));
				}
			}
		}
	}

}