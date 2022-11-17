interface one
{
    void sum();
}
interface two extends one
{
    void add();
}
class demo implements two{
    public void sum()
    {
        System.out.println("i am sum method ");
    }
    public void add()
    {
        System.out.println("i am add method");
    }
}
class extendsInterface
{
    public static void main(String []abc)
    {
        demo d=new demo();
        d.sum();
        d.add();
    }
}