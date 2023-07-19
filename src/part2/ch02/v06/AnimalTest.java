package part2.ch02.v06;

import java.util.ArrayList;

class Animal{
    //상위클래스에서 선언된 메소드는
    //하위 클래스에서 모두 사용 가능
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
    public void eating(){

    }
}

class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다. ");
    }
}

class Eagle extends  Animal{
    public void move(){
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }
    public void fly(){
        System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal h = new Human();
        Animal t = new Tiger();
        Animal e = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(h);
        test.moveAnimal(t);
        test.moveAnimal(e);
        //어떤 인스턴스형이 들어갔는지에 따라 결과가 다르게 나옴 (다형성)
        //상속을 했고, 상속에서 overriding을 했고, 형변환 진행

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(h);
        animalList.add(t);
        animalList.add(e);

        for (Animal animal : animalList){
            animal.move();
        }
    }

    public void moveAnimal(Animal animal){
        animal.move();
        //read, hunting, fly등은 호출할 수 없음 => 다운캐스팅을 해야함

    }
}
