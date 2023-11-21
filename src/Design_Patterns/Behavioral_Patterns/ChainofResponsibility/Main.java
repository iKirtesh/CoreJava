package Design_Patterns.Behavioral_Patterns.ChainofResponsibility;


// Add 2 sec sleep to each log processor to see the order of execution in the code below while printing the output to a chain of responsibility.
abstract class LogProcessor {
    private LogProcessor next;

    public LogProcessor(LogProcessor next) {
        this.next = next;
    }

    public void process(String log) {
        doProcess(log);
        if (next != null) {
            next.process(log);
        }
    }

    abstract protected void doProcess(String log);
}

class EmailLogProcessor extends LogProcessor {
    public EmailLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    protected void doProcess(String log) {
        System.out.println("Email log: " + log);
    }
}

class FileLogProcessor extends LogProcessor {
    public FileLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    protected void doProcess(String log) {
        System.out.println("File log: " + log);
    }
}

class ConsoleLogProcessor extends LogProcessor {
    public ConsoleLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    protected void doProcess(String log) {
        System.out.println("Console log: " + log);
    }
}


public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new EmailLogProcessor(new FileLogProcessor(new ConsoleLogProcessor(null)));

/**
        LogProcessor logProcessor = new EmailLogProcessor(null);
        logProcessor = new FileLogProcessor(logProcessor);
        logProcessor = new ConsoleLogProcessor(logProcessor);
*/

        logProcessor.process("Hello World!");
    }
}