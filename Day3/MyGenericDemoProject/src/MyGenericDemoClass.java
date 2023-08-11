
class IntegerInput{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class StringInput{

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class BooleanInput{
    private boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}

class PersonInput{
    private Person value;

    public Person getValue() {
        return value;
    }

    public void setValue(Person value) {
        this.value = value;
    }
}

class GenericInput<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class MyGenericDemoClass {
    public static void main(String args[]){
        GenericInput<Integer> genericInput1=new GenericInput<>();
        genericInput1.setValue(20);

        GenericInput<Person> genericInput2=new GenericInput<>();
        genericInput2.setValue(new Peson(1,"AAAA"));
    }
}
