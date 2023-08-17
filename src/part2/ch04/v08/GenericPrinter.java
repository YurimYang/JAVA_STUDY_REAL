package part2.ch04.v08;

public class GenericPrinter<T extends Material> { //<T> 자리에 실제적으로 쓸 자료형을 써주면 됨 !
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }

}
