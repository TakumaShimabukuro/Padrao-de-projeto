public class OrderedState implements PackageState {
 
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }
 
    @Override
    public void prev(Package pkg) {
        System.out.println("Pacote está no estado inicial.");
    }
 
    @Override
    public void printStatus() {
        System.out.println("Pacote solicitado. Ainda não entregue aos correios.");
    }
}