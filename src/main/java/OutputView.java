import java.util.ArrayList;
import java.util.List;

public class OutputView {

    private static final String RESULT_MESSAGE = "실행결과";
    private static final String CAR_NAME_FORMAT = " : ";
    private static final String MOVEMENT = "-";
    private static final String COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String START_INPUT_CARNAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String END_MESSAGE = "가 최종 우승했습니다.";

    public void printStatus(String carName, int position) {
        System.out.print(carName + CAR_NAME_FORMAT);
        for(int index = 0; index < position; index++) {
            System.out.print(MOVEMENT);
        }
        System.out.println();
    }

    public void resultMessage() {
        System.out.println(RESULT_MESSAGE);
    }
    public void printStartMessage() {
        System.out.println(START_INPUT_CAR_NAME_MESSAGE);
    }
}
