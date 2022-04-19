package com.example.khyati_n01421204_android1_calcui;

public class MyCalculator {
    private static float opd1;
    private static float opd2;
    private static String opd2String = "";
    private static String opr;
    private static float mem_num=0.0F;

    public  void update(String s, boolean operator) {
        if (operator) {
            opd2String += s;
            opd2 = Float.parseFloat(opd2String);
        }else{
            opr = s;
            opd1 = opd2;
            opd2 = 0.00F;
            opd2String = "";
        }
    }

    public  float calculate() {
        switch(opr){
            case "+":
                return opd1 + opd2;

            case "-":
                return opd1 - opd2;

            case "*":
                return opd1 * opd2;

            case "/":
                return opd1 / opd2;

            case "pi":
                return (float) (opd1 * Math.PI);

            case "exp":
                return (float) (opd1 * Math.E);

            default:
                return 0.00F;
        }
    }

    public  void reset() {
        opr = "";
        opd1 = 0.00F;
        opd2 = 0.00F;
        opd2String = "";
    }

    public void memoryAdd(String s) {
        mem_num += Float.parseFloat(s);
        reset();
    }

    public void memorySub(String s) {
        mem_num -= Float.parseFloat(s);
        reset();
    }

    public float memoryRecall() {
        return mem_num;
    }

    public void memoryClear() {
        mem_num = 0.0F;
    }
}
