public class OutputResponse {
    private InputRequest inputRequest;

    public InputRequest getInputRequest() {
        return inputRequest;
    }

    public void setInputRequest(InputRequest inputRequest) {
        this.inputRequest = inputRequest;
    }

    public OutputResponse(InputRequest inputRequest) {
        this.inputRequest = inputRequest;
    }

    @Override
    public String toString() {
        return "OutputResponse{" +
                "inputRequest=" + inputRequest +
                '}';
    }
}
