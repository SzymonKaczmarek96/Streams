package org.example;

import java.util.List;

public class Statistics {
    static double countMoneyForTransfers(Transfer... transfers) {
        double sum = 0.0;
        for (Transfer transfer : transfers) {
            sum += transfer.getAmount();
        }
        return sum;
    }
}
