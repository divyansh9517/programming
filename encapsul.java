class publi
{
    private int a=10,b=20;
    public void add()
    {
        System.out.println("add:- "+(a+b));
    }
}
class encapsul
{
    public static void main(String[]abc)
    {
        publi p=new publi();
        p.add();
    }
}