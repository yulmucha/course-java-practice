package javapractice;

public class IfStatementPractice {

    /**
     * 짝수/홀수 판별
     * <p>
     * 주어진 정수가 짝수인지 홀수인지 판별하는 메서드를 구현하세요.
     *
     * @param number 판별할 정수
     * @return "짝수" 또는 "홀수"
     */
    public static String evenOrOdd(int number) {
        // TODO: 짝수/홀수 판별 로직을 구현하세요.
        return "";
    }

    /**
     * 합격/불합격 판단
     * <p>
     * 시험 점수가 주어졌을 때, 합격 여부를 판단하는 메서드를 구현하세요.
     * 60점 이상이면 "합격", 미만이면 "불합격"을 반환합니다.
     *
     * @param score 시험 점수
     * @return "합격" 또는 "불합격"
     */
    public static String passOrFail(int score) {
        // TODO: 합격/불합격 판단 로직을 구현하세요.
        return "";
    }

    /**
     * 대소문자 변환
     * <p>
     * 주어진 알파벳 문자가 대문자면 소문자로, 소문자면 대문자로 변환하는 메서드를 구현하세요.
     * 알파벳이 아닌 문자가 입력되면 그대로 반환합니다.
     * 힌트: .toLowerCase(), toUpperCase()를 사용하세요.
     *
     * @param str 변환할 문자
     * @return 변환된 문자
     */
    public static String swapCase(String str) {
        // TODO: 대소문자 변환 로직을 구현하세요.
        return "";
    }

    /**
     * 계절 판별
     * <p>
     * 월(month)을 입력받아 해당 월의 계절을 반환하는 메서드를 구현하세요.
     * - 3, 4, 5월은 "봄"
     * - 6, 7, 8월은 "여름"
     * - 9, 10, 11월은 "가을"
     * - 12, 1, 2월은 "겨울"
     * 잘못된 월이 입력되면 "잘못된 월"을 반환합니다.
     *
     * @param month 판별할 월 (1-12)
     * @return 계절 (봄, 여름, 가을, 겨울) 또는 "잘못된 월"
     */
    public static String getSeason(int month) {
        // TODO: 계절 판별 로직을 구현하세요.
        return "";
    }

    /**
     * 최대값 찾기
     * <p>
     * 세 개의 정수를 입력받아 그 중 가장 큰 값을 반환하는 메서드를 구현하세요.
     *
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @param c 세 번째 정수
     * @return 세 정수 중 가장 큰 값
     */
    public static int findMaximum(int a, int b, int c) {
        // TODO: 최대값 찾기 로직을 구현하세요.
        return 0;
    }

    /**
     * 윤년 판별
     * <p>
     * 주어진 연도가 윤년인지 아닌지 판별하는 메서드를 구현하세요.
     * 윤년은 다음 조건을 만족하는 해입니다:
     * 1. 4로 나누어 떨어지는 해는 윤년입니다.
     * 2. 그 중에서 100으로 나누어 떨어지는 해는 윤년이 아닙니다.
     * 3. 하지만 400으로 나누어 떨어지는 해는 윤년입니다.
     *
     * @param year 판별할 연도
     * @return 윤년이면 true, 아니면 false
     */
    public static boolean isLeapYear(int year) {
        // TODO: 윤년 판별 로직을 구현하세요.
        return false;
    }

    /**
     * 간단한 계산기
     * <p>
     * 두 개의 정수와 연산자(+, -, *, /)를 입력받아 계산 결과를 반환하는 메서드를 구현하세요.
     * 나눗셈의 경우 정수 나눗셈으로 처리하고, 0으로 나누는 경우 "Error"를 반환합니다.
     *
     * @param num1     첫 번째 정수
     * @param num2     두 번째 정수
     * @param operator 연산자 ('+', '-', '*', '/' 중 하나)
     * @return 계산 결과 또는 "Error"
     */
    public static String simpleCalculator(int num1, int num2, char operator) {
        // TODO: 간단한 계산기 로직을 구현하세요.
        return "";
    }

    /**
     * 가위바위보 게임
     * <p>
     * 사용자와 컴퓨터의 가위바위보 선택을 입력받아 승패를 판단하는 메서드를 구현하세요.
     * 가위: 1, 바위: 2, 보: 3으로 입력됩니다.
     *
     * @param userChoice     사용자의 선택 (1, 2, 또는 3)
     * @param computerChoice 컴퓨터의 선택 (1, 2, 또는 3)
     * @return "승리", "패배", "무승부" 중 하나
     */
    public static String rockPaperScissors(int userChoice, int computerChoice) {
        // TODO: 가위바위보 게임 로직을 구현하세요.
        return "";
    }

    /**
     * 중첩 if문을 사용한 등급 판정
     * <p>
     * 학생의 점수를 입력받아 다음 기준에 따라 등급을 판정하는 메서드를 구현하세요.
     * 90점 이상: A
     * - 95점 이상: A+
     * - 90-94점: A
     * 80-89점: B
     * - 85점 이상: B+
     * - 80-84점: B
     * 70-79점: C
     * 60-69점: D
     * 60점 미만: F
     *
     * @param score 학생의 점수 (0-100)
     * @return 등급 (A+, A, B+, B, C, D, F 중 하나)
     */
    public static String gradeEvaluation(int score) {
        // TODO: 중첩 if문을 사용한 등급 판정 로직을 구현하세요.
        return "";
    }

    /**
     * 온라인 쇼핑몰 할인 계산
     * <p>
     * 다음 할인 정책에 따라 최종 결제 금액을 계산하는 메서드를 구현하세요.
     * 1. 구매 금액이 100,000원 이상이면 5% 할인
     * 2. 구매 금액이 500,000원 이상이면 10% 할인
     * 3. VIP 회원은 위의 할인이 적용된 후, 추가로 구매 금액의 5%를 할인 (중복 적용)
     * <p>
     * 할인 계산 과정:
     * 1. 먼저 구매 금액에 따른 기본 할인율을 적용합니다.
     * 2. 그 다음, VIP 회원의 경우 원래 구매 금액(할인 전)의 5%를 추가로 할인합니다.
     *
     * @param purchaseAmount  구매 금액
     * @param membershipLevel 회원 등급 ("일반" 또는 "VIP")
     * @return 할인이 적용된 최종 결제 금액
     */
    public static double calculateDiscount(double purchaseAmount, String membershipLevel) {
        // TODO: 온라인 쇼핑몰 할인 계산 로직을 구현하세요.
        return 0.0;
    }

    /**
     * 근무 시간에 따른 급여 계산
     * <p>
     * 다음 정책에 따라 직원의 주급을 계산하는 메서드를 구현하세요.
     * 1. 주 40시간까지는 기본 시급이 적용됩니다.
     * 2. 40시간 초과 60시간 이하의 근무 시간에 대해서는 기본 시급의 1.5배가 적용됩니다.
     * 3. 60시간 초과 근무 시간에 대해서는 기본 시급의 2배가 적용됩니다.
     *
     * @param hoursWorked 일주일 동안 일한 시간
     * @param hourlyRate  기본 시급
     * @return 계산된 주급
     */
    public static double calculateSalary(int hoursWorked, double hourlyRate) {
        // TODO: 근무 시간에 따른 급여 계산 로직을 구현하세요.
        return 0.0;
    }

    /**
     * 영화 티켓 가격 계산
     * <p>
     * 다음 규칙에 따라 영화 티켓의 가격을 계산하는 메서드를 구현하세요.
     * 1. 기본 티켓 가격은 10,000원입니다.
     * 2. 나이가 14세 미만이거나 65세 이상이면 50% 할인됩니다.
     * 3. 조조 영화 (오전 10시 이전 시작)는 기본 가격의 30% 할인됩니다.
     * 4. 심야 영화 (오후 10시 이후 시작)는 기본 가격의 20% 할인됩니다.
     * 5. 중복 할인은 적용되지 않으며, 가장 높은 할인율 하나만 적용됩니다.
     * 6. 요일에 관계없이 동일한 규칙이 적용됩니다.
     *
     * @param age       관람객의 나이
     * @param startTime 영화 시작 시간 (24시간 형식, 0-23)
     * @return 계산된 티켓 가격
     */
    public static int calculateTicketPrice(int age, int startTime) {
        // TODO: 영화 티켓 가격 계산 로직을 구현하세요.
        return 0;
    }

    /**
     * 신용카드 포인트 적립
     * <p>
     * 다음 규칙에 따라 신용카드 사용에 따른 포인트 적립액을 계산하는 메서드를 구현하세요.
     * 1. 일반 카드: 1,000원 당 1포인트 적립
     * 2. 골드 카드: 1,000원 당 2포인트 적립
     * 3. 플래티넘 카드: 1,000원 당 3포인트 적립
     * 4. 사용 금액이 500,000원 이상인 경우, 추가로 10,000 포인트를 적립합니다.
     *
     * @param spentAmount 신용카드 사용 금액
     * @param cardGrade   카드 등급 ("일반", "골드", 또는 "플래티넘")
     * @return 적립된 포인트
     */
    public static int calculateCreditCardPoints(int spentAmount, String cardGrade) {
        // TODO: 신용카드 포인트 적립 로직을 구현하세요.
        return 0;
    }

    /**
     * 카 쉐어링 대여 요금 계산
     * <p>
     * 다음 규칙에 따라 카 쉐어링 서비스의 이용 요금을 계산하는 메서드를 구현하세요.
     * 대여 요금: 시간당 5,000원
     *
     * @param hours 대여 시간 (시간 단위)
     * @return 계산된 요금 (원, 정수)
     */
    public static int calculateHourlyRentalCost(int hours) {
        // 여기에 코드를 작성하세요
        return 0;
    }

    /**
     * 카 쉐어링 대여 및 주행 요금 계산
     * <p>
     * 다음 규칙에 따라 카 쉐어링 서비스의 이용 요금을 계산하는 메서드를 구현하세요.
     * 1. 대여 요금: 시간당 5,000원
     * 2. 주행 요금: 1km당 260원
     *
     * @param hours    대여 시간 (시간 단위)
     * @param distance 주행 거리 (km, 정수)
     * @return 계산된 총 요금 (원, 정수)
     */
    public static int calculateRentalWithMileageCost(int hours, int distance) {
        // 여기에 코드를 작성하세요
        return 0;
    }

    /**
     * 카 쉐어링 요금 계산 - 주중/주말 다른 요금
     * <p>
     * 다음 규칙에 따라 카 쉐어링 서비스의 이용 요금을 계산하는 메서드를 구현하세요.
     * 1. 대여 요금:
     * - 주중: 시간당 5,000원
     * - 주말: 시간당 7,000원
     * 2. 주행 요금: 1km당 260원
     *
     * @param hours     대여 시간 (시간 단위)
     * @param distance  주행 거리 (km, 정수)
     * @param isWeekend 주말 여부 (true: 주말, false: 평일)
     * @return 계산된 총 요금 (원, 정수)
     */
    public static int calculateWeekdayWeekendRentalCost(int hours, int distance, boolean isWeekend) {
        // 여기에 코드를 작성하세요
        return 0;
    }

    /**
     * 카 쉐어링 요금 계산 - 주행 거리별로 다른 요금
     * <p>
     * 다음 규칙에 따라 카 쉐어링 서비스의 이용 요금을 계산하는 메서드를 구현하세요.
     * 1. 대여 요금:
     * - 주중: 시간당 5,000원
     * - 주말: 시간당 7,000원
     * 2. 주행 요금:
     * - 주행 거리 30km 이하          : 260원/km
     * - 주행 거리 30km 초과 100km 이하: 250원/km
     * - 주행 거리 100km 초과         : 230원/km
     * 참고: 계산 결과의 소수점 처리는 반올림으로 합니다.
     *
     * @param hours     대여 시간 (시간 단위)
     * @param distance  주행 거리 (km, 정수)
     * @param isWeekend 주말 여부 (true: 주말, false: 평일)
     * @return 계산된 총 요금 (원, 정수)
     */
    public static int calculateTieredMileageRentalCost(int hours, int distance, boolean isWeekend) {
        // 여기에 코드를 작성하세요
        return 0;
    }

    /**
     * 카 쉐어링 요금 계산 - 패스 가입 회원 할인
     * <p>
     * 다음 규칙에 따라 카 쉐어링 서비스의 이용 요금을 계산하는 메서드를 구현하세요.
     * <p>
     * 1. 대여 요금:
     * - 주중: 시간당 5,000원
     * - 주말: 시간당 7,000원
     * <p>
     * 2. 패스 가입 회원 할인: 대여 요금에 50% 할인 적용 (주행 요금에는 적용되지 않음)
     * <p>
     * 3. 주행 요금:
     * - 주행 거리 30km 이하          : 260원/km
     * - 주행 거리 30km 초과 100km 이하: 250원/km
     * - 주행 거리 100km 초과         : 230원/km
     * <p>
     *
     * @param hours        대여 시간 (시간 단위)
     * @param distance     주행 거리 (km, 정수)
     * @param isWeekend    주말 여부 (true: 주말, false: 평일)
     * @param isPassMember 패스 가입 여부 (true: 회원, false: 비회원)
     * @return 계산된 총 요금 (원, 정수)
     */
    public static int calculateComprehensiveRentalCost(int hours, int distance, boolean isWeekend, boolean isPassMember) {
        // 여기에 코드를 작성하세요

        // 1. 대여 요금 계산

        // 2. 패스 할인 적용 (해당되는 경우)

        // 3. 주행 요금 계산

        // 4. 총 요금 계산 및 반환

        return 0; // 이 부분을 완성된 계산 결과로 대체하세요
    }
}
