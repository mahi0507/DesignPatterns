// Chain of Responsibility Design Pattern
abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(int amount);
}

class ConcreteHandlerA extends Handler {
    public void handleRequest(int amount) {
        if (amount < 100) {
            System.out.println("Handled by ConcreteHandlerA");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}

class ConcreteHandlerB extends Handler {
    public void handleRequest(int amount) {
        if (amount >= 100) {
            System.out.println("Handled by ConcreteHandlerB");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}
