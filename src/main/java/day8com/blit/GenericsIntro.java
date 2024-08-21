package day8com.blit;

public class GenericsIntro<T, V>{ // T or V can be any letters.
    // Attributes
    private T data1;
    private V data2;

    // Constructors
    public GenericsIntro(T data1, V data2) {
        //
        this.data1 = data1;
        this.data2 = data2;
    }
    public GenericsIntro(){

    }

    // Method display
    public<T, V> void display(){
        //
        System.out.println(this.data1 + " - " + this.data2);
    }
    // Method shout
    public<T,V> void shout(T param1, V param2){
        //
        System.out.println(param1 + "!!!");
        System.out.println(param2 + "!!!");
    }
    // Setter & Getters
    public V getData2() {
        return data2;
    }

    public void setData2(V data2) {
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

}
