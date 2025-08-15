package exercicios.HackerRank.java.advanced;

public class SingletonPattern {
    public String str;

    private SingletonPattern() {}

    public static SingletonPattern getSingleInstance() {
        return new SingletonPattern();
    }
}
