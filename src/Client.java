public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }
    public void prinFileSize(String path) {
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
