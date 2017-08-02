package prob03;

public class CurrencyConverter {

	   private static double rate;

	   public static double toDollar(double won) {
	      double dollar = 0;
	      dollar = won/rate;
	      return dollar;
	      // 한국 원화를 달러로 변환
	   }

	   public static double toKRW(double dollar) {
	      double won=0;
	      won=dollar*rate;
	      return won;
	      // 달러를 한국 원화로 변환
	   }

	   public static void setRate(double r) {
	      // 환율 설정(KRW/$1)
	      rate=r;
	   }




}
