package lab4.factory;

public abstract class Pizza {

    protected String name;

    public void bake(){
        System.out.println(String.format("***baking pizza %s ***", this.name));
    }

    public void prepare(){
        System.out.println(String.format("***preparing pizza %s ***", this.name));
    }

    public void cut(){
        System.out.println(String.format("***cutting pizza %s ***", this.name));
    }

    public void box(){
        System.out.println(String.format("***placing pizza %s in the box ***", this.name));
    }

    public String toString(){
        return String.format("This is a %s pizza", this.name);
    }
}
