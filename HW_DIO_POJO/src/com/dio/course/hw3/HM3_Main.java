package com.dio.course.hw3;

public class HM3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PojoAudio a1 = new PojoAudio(3.3, "N.Baskov - I'm sexy and I know it",Quality.LOW,"2000");
		PojoAudio a2 = new PojoAudio(6.21,"Black Sabbath - Black Sabbath",Quality.HIGHT, "1968" );
		
		
		System.out.println("equals: " + a1.equals(a2));
        //local code review (vtegza): compare instances @ 27.07.14
        System.out.println("compare instance: " + (a1==a2));

		a1.testMerg();
		String s = "1234567890";
		
		System.out.println(s.length());
        //local code review (vtegza): what is the usage?  @ 27.07.14
        char[] ch = new char[s.length()];
		ch = s.toCharArray();
		

		
	}

}
