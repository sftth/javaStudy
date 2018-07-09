package javaStudy.test2017.e03.q4.resource;

public class TargetSourceB {
	public void test () {
		PublicService publicService = new PublicService();
		int temp = 0;
		int ratio = 0;
		ratio = publicService.call();
		publicService.close();
		temp = ratio;
	}
}
