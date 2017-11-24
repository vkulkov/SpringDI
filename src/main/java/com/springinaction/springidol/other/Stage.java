package com.springinaction.springidol.other;

public class Stage {
    private static class StageSingletonHolder {
        private static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
