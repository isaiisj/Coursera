class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    String sendingTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Sending " + this.message
                + " to " + this.sendingTo);
    }

    @Override
    public void onButtonHover() {
        System.out.println("Hovering over Sending button");
    }

    public void setSendingTo(String sendingTo) {
        this.sendingTo = sendingTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
