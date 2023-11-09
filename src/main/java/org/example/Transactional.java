package org.example;

import java.io.IOException;

public interface Transactional {
    /**
     * sssssssssssss
     * @param amount test
     * @return
     */
    double withdraw(double amount) throws IOException;
    double deposit(double amount);
}
