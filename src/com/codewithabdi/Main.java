package com.codewithabdi;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
//        TextBox textBox1 =  new TextBox();
//        textBox1.setText("Box 1");
//        TextBox textBox2 = new TextBox();
//        textBox2.setText("BOX 2");
//
//        System.out.println(textBox1.text.toUpperCase());
//        System.out.println(textBox2.text.toUpperCase());

        // calculate employee wage

        //fields
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
     

    }

    }

