public class Worker {
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }


    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String error);
    }

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
            if (i == 32) {
                errorCallback.onError("Error");
                i++;
            }


        }

    }
}


