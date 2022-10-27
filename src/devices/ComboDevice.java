package devices;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println(doc);
    }

    @Override
    public String scan() {
        return "";
    }

    @Override
    public void print(String doc) {

    }
}
