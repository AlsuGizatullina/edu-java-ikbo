package ru.minusd.poplavskij.lab02.task04;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        int count_comps;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ���������� �����������: ");
        count_comps = scanner.nextInt();

        System.out.println("������� ����� �����������: ");
        for (int i = 0; i < count_comps; i++) {
            name = scanner.next();
            shop.add(name);
        }

        System.out.println("������� ����� �����������, ������� ������ �������:");
        name = scanner.next();
        shop.remove(name);

        System.out.println("������� ����� �����������, ������� ������ �����:");
        name = scanner.next();
        int i = shop.find(name);
        if (i==-1){
            System.out.println("��������� � ����� ������ �� ����������");
        }
        else{
            System.out.println("��������� � ����� ������ ����� � ������� ������ " + i);
        }
    }
}
