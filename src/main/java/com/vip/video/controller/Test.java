package com.vip.video.controller;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static int count = 0;

    public static void main(String[] args) {
        int sum = 0;
        getSum(sum);

    }

    public static void getSum(int sum) {
        if (count == 2) {
            System.out.println(sum);
            return;
        }
        count++;
        sum += count;
        getSum(sum);

    }
}
