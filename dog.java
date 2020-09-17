public class dog
{
    private String name;
    private int age;

    public dog(String a, int b)
    {
        name = a;
        age = b;
    }
    public dog(String a)
    {
        name = a;
        age = 0;
    }
    public dog()
    {
        name = "Dog";
        age = 0;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return this.name+", age "+this.age;
    }
    public void rez()
    {
        System.out.println (name+"'s age is "+age+" years") ;
    }
}
