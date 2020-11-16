public class ReceivedState implements PackageState {
 
    @Override
    public void next(Package pkg) {
        System.out.println("Pacote já recebido pelo cliente.");
    }
 
    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pacote recebido.");
    }
}