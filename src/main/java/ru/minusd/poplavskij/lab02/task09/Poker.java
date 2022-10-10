package ru.minusd.poplavskij.lab02.task09;
import java.util.*;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"���", "�����", "����", "����"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "�����", "����", "������", "���"};
        int countPlayers = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ���������� �������: ");
            if (scanner.hasNextInt()) {
                countPlayers = scanner.nextInt();
                if (5 * countPlayers <= 52) {
                    break;
                } else {
                    if (countPlayers == 0) {
                        System.out.println("���� ����������.");
                        break;
                    } else if (countPlayers < 0) {
                        System.out.println("����� ������� �� ����� ���� ������ 0");
                    } else {
                        System.out.println("������� ����� �������!");
                    }
                }
            } else {
                System.out.println("�� ����� �� �����, ��� ���� ����� ������� �������!");
            }
        }
        String[] deck = new String[52];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        Random rnd = new Random();
        for (int i = 0; i < 52; i++) { //������������ ������
            int index = rnd.nextInt(i + 1);
            String temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
        for (int i = 0; i < countPlayers * 5; i++) {
            System.out.println(deck[i]);
            if (i % 5 == 4)
                System.out.println();
        }
    }
}
