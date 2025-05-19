public class Main {
    public static void main(String[] args) {
        ForwardButtonClass forwardButton = new ForwardButtonClass();
        forwardButton.SetCaption("Forward");
        forwardButton.setForwardTo("x@y.com");
        forwardButton.setMessage("Hello World");
        forwardButton.buttonPress();

        SendButtonClass sendbutton = new SendButtonClass();
        sendbutton.SetCaption("Sending");
        sendbutton.setSendingTo("x@y.com");
        sendbutton.setMessage("Hello World");
        sendbutton.buttonPress();
    }
}
