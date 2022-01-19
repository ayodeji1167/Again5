package com.deestech;

import java.util.Scanner;

public class AutoPolicyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AutoPolicy policy1 = new AutoPolicy(1111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(2222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);


    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto Policy:");
        System.out.printf("Account#: %d; car: %s; state: %s %s a no-fault state%n%n", policy.getAccountNumber(),
                policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));


    }
}
