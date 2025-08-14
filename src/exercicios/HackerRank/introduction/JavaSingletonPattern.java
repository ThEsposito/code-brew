package exercicios.HackerRank.introduction;

public class JavaSingletonPattern {
    public String str;

    private JavaSingletonPattern() {}

    public static JavaSingletonPattern getSingleInstance() {
        return new JavaSingletonPattern();
    }
}
