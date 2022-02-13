package racingcar.utils;

import racingcar.ui.RacingCarInput;
import racingcar.validator.RoundNumberValidator;

public class RoundNumberGenerator {
    public static int roundInput() {
        String roundNumberString = RacingCarInput.userRoundInput();
        try {
            return toIntWithValidate(roundNumberString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return roundInput();
        }
    }

    private static int toIntWithValidate(String roundNumberString) {
        RoundNumberValidator.validate(roundNumberString);
        return Integer.parseInt(roundNumberString);
    }
}
