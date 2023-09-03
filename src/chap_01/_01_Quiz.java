package chap_01;

public class _01_Quiz {
    /* 문제
    * 1. 버스 번호는 "1234" , "상암08" 과 같은 형태
    * 2. 남은 시간은 분 단위 (3분 , 5분)
    * 남은 거리는 Km 단위 (1.5km , 0.8km)
    * */

    /*
    * ㅁㅁㅁㅁ번 버스
    * 약 ㅁ분 후 도착
    * 남은 거리 ㅁㅁkm
    * */
    public static void main(String[] args) {
        String busNo = "1234";
        int time = 180;
        double distance = 1.5;

        System.out.printf("%s번 버스 \n",busNo);
        System.out.printf("약 %d분 후 도착 \n",time/60);
        System.out.printf("남은 거리 %3.1fkm \n",distance);
    }
}
