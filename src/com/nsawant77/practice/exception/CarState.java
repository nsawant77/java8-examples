package com.nsawant77.practice.exception;

public enum CarState {

    DRIVING (1, "Car is driving"),
    WAITING(2, "Car is waiting"),
    PARKING (3, "Car is parking");

    private Integer state;
    private String statement;

    CarState(Integer state, String statement){
        this.state = state;
        this.statement = statement;
    }

    public static String invokeState(Integer state) throws Exception {

        switch (state){
            case 1:
                return DRIVING.statement;
            case 2:
                return WAITING.statement;
            case 3:
                return PARKING.statement;
            default:
                throw new Exception("Unknown state: "+state);
        }
    }
}
