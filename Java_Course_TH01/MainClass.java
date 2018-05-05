package caohuulam408.gmail.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws IOException {

		System.out.println("Nhập vào xâu kí tự: ");
		String s = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();

		System.out.println(DaoXau.thuchien(s));

		System.out.println(DaoTu.thuchien(s));


		String input = br.readLine();

		String[] input_element = input.split(" ");
		float mang[] = new float[input_element.length];
		for (int i = 0; i < mang.length; i++)
			mang[i] = Float.parseFloat(input_element[i]);
		System.out.println("Tổng mảng là: " + TinhTong.thuchien(mang));


		float a, b, c;
		String input2 = br.readLine();
		String[] input_element2 = input2.split(" ");
		a = Float.parseFloat(input_element2[0]);
		b = Float.parseFloat(input_element2[1]);
		c = Float.parseFloat(input_element2[2]);
		GiaiPhuongTrinh.thuchien(a, b, c);
	}

}
