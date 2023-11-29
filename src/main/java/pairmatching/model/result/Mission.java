package pairmatching.model.result;

import java.util.Arrays;

public enum Mission {
    RACING_CAR(Level.LEVEL1, "자동차경주"),
    LOTTO(Level.LEVEL1, "로또"),
    BASEBALL_GAME(Level.LEVEL1, "숫자야구게임"),
    SHOPPING_BASKET(Level.LEVEL2, "장바구니"),
    PAYMENT(Level.LEVEL2, "결제"),
    SUBWAY_RAIL(Level.LEVEL2, "지하철노선도"),
    UPGRADE(Level.LEVEL4, "성능개선"),
    DISTRIBUTE(Level.LEVEL4, "배포");

    private Level level;
    private String name;

    Mission(Level level, String name) {
        this.level = level;
        this.name = name;
    }

    public static Mission findByName(String name) {
        for (Mission mission: Mission.values()) {
            if (mission.name.equals(name)) {
                return mission;
            }
        }
        throw new IllegalArgumentException("[ERROR] 없는 미션 입니다.");
    }
}
