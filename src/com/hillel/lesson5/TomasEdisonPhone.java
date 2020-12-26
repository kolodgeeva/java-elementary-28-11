package com.hillel.lesson5;

public class TomasEdisonPhone extends AbstractPhone {

    public TomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщте номер абонента, сэр");
        System.out.println("Набираем абонента номер " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Входящий звонок от абонента " + inputNumber);
    }

}
