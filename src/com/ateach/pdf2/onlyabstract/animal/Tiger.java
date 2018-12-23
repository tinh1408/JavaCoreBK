package com.ateach.pdf2.onlyabstract.animal;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
    public String howToEat() {
        return "could be fried";
    } // tiger khong can co phuong thuc nay, nhung vi abstrac nen phai khai bao
}
