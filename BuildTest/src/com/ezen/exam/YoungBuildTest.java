package com.ezen.exam;

public class YoungBuildTest {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public YoungBuildTest() { }
	public YoungBuildTest(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getSum() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		return (int)(getSum()/3.0*100)/100.0;
	}
	
	public void getInfo() {
		System.out.println("성명	국어	영어	수학	총점	평균");
		System.out.println(
			new StringBuilder(name).append("\t").append(kor)
			.append("\t").append(eng).append("\t").append(math).append("\t")
			.append(getSum()).append("\t").append(getAvg()).append("\t")
		);
	}
}
