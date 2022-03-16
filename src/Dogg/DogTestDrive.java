package Dogg;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setSize(10);//= -1;//vấn đề , không hợp lệ
        dog.breed = "China";

        System.out.println("Size của chó: " + dog.getSize());
    }
}
