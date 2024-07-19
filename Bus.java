package Project;

public class Bus {

    private int busno;
    private boolean ac;
    private int capacity;

    Bus(int b, boolean Ac, int c){
        this.busno = b;
        this.ac = Ac;
        this.capacity = c;
    }

    public int getcapacity() {
        return capacity;
    }

    public void setcapacity(int cap) {
        this.capacity = cap;
    }

    public boolean getac(){
        return ac;
    }

    public void setac(boolean val){
        ac = val;
    }

    public int getbusno(){
        return busno;
    }

    public void displayBusInfo(){
        System.out.println("Busno: " + busno + " Ac or NonAc: " + ac + " Capacity: " + capacity);
    }
}
