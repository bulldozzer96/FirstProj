package com.ua.RD.lesson31;

public class DepositService {
    @UserCheck
    public Double getDeposit(String userId, String depositId) {


        if (isCorrectUser(userId)) {
            return 0D;
        }else {
            return null;
        }
    }

    private boolean isCorrectUser(String userId) {
        return true;
    }


}
