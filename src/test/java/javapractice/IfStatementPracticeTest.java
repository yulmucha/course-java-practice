package javapractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static javapractice.IfStatementPractice.*;
import static org.junit.jupiter.api.Assertions.assertAll;

class IfStatementPracticeTest {

    @Test
    @DisplayName("짝수와 홀수를 올바르게 판별해야 한다")
    void testEvenOrOdd() {
        assertThat(evenOrOdd(4)).isEqualTo("짝수");
        assertThat(evenOrOdd(7)).isEqualTo("홀수");
        assertThat(evenOrOdd(0)).isEqualTo("짝수");
        assertThat(evenOrOdd(-5)).isEqualTo("홀수");
    }

    @Test
    @DisplayName("시험 점수에 따라 합격 여부를 올바르게 판단해야 한다")
    void testPassOrFail() {
        assertThat(passOrFail(75)).isEqualTo("합격");
        assertThat(passOrFail(60)).isEqualTo("합격");
        assertThat(passOrFail(59)).isEqualTo("불합격");
        assertThat(passOrFail(0)).isEqualTo("불합격");
    }

    @Test
    @DisplayName("알파벳 문자의 대소문자를 올바르게 변환해야 한다")
    void testSwapCase() {
        assertThat(swapCase("a")).isEqualTo("A");
        assertThat(swapCase("Z")).isEqualTo("z");
        assertThat(swapCase("5")).isEqualTo("5");
        assertThat(swapCase("!")).isEqualTo("!");
    }

    @Test
    @DisplayName("월에 따른 계절을 올바르게 반환해야 한다")
    void testGetSeason() {
        assertAll(
                () -> assertThat(getSeason(3)).isEqualTo("봄"),
                () -> assertThat(getSeason(7)).isEqualTo("여름"),
                () -> assertThat(getSeason(11)).isEqualTo("가을"),
                () -> assertThat(getSeason(1)).isEqualTo("겨울"),
                () -> assertThat(getSeason(13)).isEqualTo("잘못된 월")
        );
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 3",
            "5, 5, 5, 5",
            "10, 7, 8, 10",
            "-1, -5, -3, -1",
            "0, 0, 0, 0"
    })
    @DisplayName("최대값 찾기 - 양수, 음수, 동일 숫자 케이스 테스트")
    void testFindMaximum(int a, int b, int c, int expected) {
        assertThat(findMaximum(a, b, c))
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("윤년을 올바르게 판별해야 한다")
    void testIsLeapYear() {
        assertThat(isLeapYear(1996)).isTrue();
        assertThat(isLeapYear(2000)).isTrue();
        assertThat(isLeapYear(2004)).isTrue();
        assertThat(isLeapYear(2096)).isTrue();
        assertThat(isLeapYear(2100)).isFalse();
        assertThat(isLeapYear(2200)).isFalse();
        assertThat(isLeapYear(2400)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
            "5, 3, +, 8",
            "10, 2, *, 20",
            "15, 3, /, 5",
            "7, 2, -, 5",
            "10, 0, /, Error"
    })
    @DisplayName("간단한 계산기 - 다양한 연산 및 에러 케이스 테스트")
    void testSimpleCalculator(int num1, int num2, char operator, String expected) {
        assertThat(simpleCalculator(num1, num2, operator))
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 패배",
            "2, 1, 승리",
            "3, 3, 무승부",
            "1, 3, 승리",
            "2, 3, 패배"
    })
    @DisplayName("가위바위보 게임 - 모든 가능한 게임 결과 테스트")
    void testRockPaperScissors(int userChoice, int computerChoice, String expected) {
        assertThat(rockPaperScissors(userChoice, computerChoice))
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "98, A+",
            "92, A",
            "87, B+",
            "83, B",
            "78, C",
            "65, D",
            "55, F",
            "100, A+",
            "0, F"
    })
    @DisplayName("학점 평가 - 각 등급의 경계값 및 극단값 테스트")
    void testGradeEvaluation(int score, String expected) {
        assertThat(gradeEvaluation(score))
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("구매 금액과 회원 등급에 따라 할인을 올바르게 계산해야 한다")
    void testCalculateDiscount() {
        Object[][] testCases = {
                {90_000.0, "일반", 90_000.0},
                {100_000.0, "일반", 95_000.0},
                {500_000.0, "일반", 450_000.0},
                {100_000.0, "VIP", 90_000.0},
                {500_000.0, "VIP", 425_000.0}
        };
        for (Object[] testCase : testCases) {
            double purchaseAmount = (double) testCase[0];
            String membershipLevel = (String) testCase[1];
            double expectedAmount = (double) testCase[2];
            assertThat(calculateDiscount(purchaseAmount, membershipLevel)).isEqualTo(expectedAmount, within(0.01));
        }
    }

    @ParameterizedTest
    @CsvSource({
            "40, 10.0, 400.0",  // 정규 근무 시간 (40시간 이하)
            "50, 10.0, 550.0",  // 초과 근무 시간 (40시간 초과, 60시간 이하)
            "70, 10.0, 900.0",  // 2배 초과 근무 시간 (60시간 초과)
            "40, 15.0, 600.0",  // 정확히 40시간 근무
            "60, 20.0, 1400.0", // 정확히 60시간 근무
            "0, 25.0, 0.0"      // 0시간 근무
    })
    @DisplayName("근무 시간에 따라 급여를 올바르게 계산해야 한다")
    void testCalculateSalary(int hoursWorked, double hourlyRate, double expectedSalary) {
        assertThat(calculateSalary(hoursWorked, hourlyRate))
                .isEqualTo(expectedSalary);
    }

    @Test
    @DisplayName("나이와 시간에 따라 영화 티켓 가격을 올바르게 계산해야 한다")
    void testCalculateTicketPrice() {
        assertThat(calculateTicketPrice(10, 14)).isEqualTo(5000);
        assertThat(calculateTicketPrice(30, 20)).isEqualTo(10000);
        assertThat(calculateTicketPrice(25, 9)).isEqualTo(7000);
        assertThat(calculateTicketPrice(40, 23)).isEqualTo(8000);
    }

    @ParameterizedTest
    @CsvSource({
            "400000, 일반, 400",
            "400000, 골드, 800",
            "400000, 플래티넘, 1200",
            "600000, 일반, 10600",
            "600000, 골드, 11200",
            "600000, 플래티넘, 11800"
    })
    @DisplayName("사용 금액과 카드 등급에 따라 신용카드 포인트를 올바르게 계산해야 한다")
    void testCalculateCreditCardPoints(int spentAmount, String cardGrade, int expectedPoints) {
        assertThat(calculateCreditCardPoints(spentAmount, cardGrade)).isEqualTo(expectedPoints);
    }

    @Test
    void testCalculateHourlyRentalCost() {
        assertThat(calculateHourlyRentalCost(1)).isEqualTo(5000);
        assertThat(calculateHourlyRentalCost(3)).isEqualTo(15000);
        assertThat(calculateHourlyRentalCost(0)).isEqualTo(0);
    }

    @Test
    void testCalculateRentalWithMileageCost() {
        assertThat(calculateRentalWithMileageCost(2, 30)).isEqualTo(17800);
        assertThat(calculateRentalWithMileageCost(5, 100)).isEqualTo(51000);
        assertThat(calculateRentalWithMileageCost(0, 0)).isEqualTo(0);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 30, false, 17800",
            "2, 30, true, 21800",
            "5, 100, false, 51000",
            "5, 100, true, 61000"
    })
    void testCalculateWeekdayWeekendRentalCost(int hours, int distance, boolean isWeekend, int expectedCost) {
        assertThat(calculateWeekdayWeekendRentalCost(hours, distance, isWeekend))
                .isEqualTo(expectedCost);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 20, false, 15200",  // (5000 * 2) + (20 * 260) = 10000 + 5200 = 15200
            "2, 50, false, 22800",  // (5000 * 2) + (30 * 260 + 20 * 250) = 10000 + 7800 + 5000 = 22800
            "2, 120, false, 39900", // (5000 * 2) + (30 * 260 + 70 * 250 + 20 * 230) = 10000 + 7800 + 17500 + 4600 = 39900
            "2, 20, true, 19200",   // (7000 * 2) + (20 * 260) = 14000 + 5200 = 19200
            "2, 50, true, 26800",   // (7000 * 2) + (30 * 260 + 20 * 250) = 14000 + 7800 + 5000 = 26800
            "2, 120, true, 43900"   // (7000 * 2) + (30 * 260 + 70 * 250 + 20 * 230) = 14000 + 7800 + 17500 + 4600 = 43900
    })
    void testCalculateTieredMileageRentalCost(int hours, int distance, boolean isWeekend, int expectedCost) {
        assertThat(calculateTieredMileageRentalCost(hours, distance, isWeekend))
                .isEqualTo(expectedCost);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 20, false, false, 15200",
            "2, 20, false, true, 10200",
            "2, 50, true, false, 26800",
            "2, 50, true, true, 19800",
            "5, 120, false, false, 54900",
            "5, 120, false, true, 42400"
    })
    void testCalculateComprehensiveRentalCost(int hours, int distance, boolean isWeekend, boolean isPassMember, int expectedCost) {
        assertThat(calculateComprehensiveRentalCost(hours, distance, isWeekend, isPassMember))
                .isEqualTo(expectedCost);
    }
}