package chap_02;

public class _02_Quiz {
    /*
    * 키가 120cm 이상인 경우에만 탑승 가능
    * 삼향 연산자 이용
    * */
    public static void main(String[] args) {
        int height = 119;
        String message = height > 120 ? "가능합니다" : "불가능합니다";
        System.out.println("키가" + height + "cm 이므로 탑승 " + message);
    }
}
