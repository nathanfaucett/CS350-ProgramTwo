/**
 * Page.java
 *
 * simple representation of a Page
 *
 * @author Nathan Faucett
 * @version Oct 25, 2016
 */
 public class Page {
    private int id;
    private long timestamp;

    public Page(int id) {
        this.id = id;
        this.timestamp = System.nanoTime();
    }

    public int getId() {
        return this.id;
    }
    public long getTimestamp() {
        return this.timestamp;
    }
    public void setTimestamp() {
        this.timestamp = System.nanoTime();
    }

    public String toString() {
        return "Page { id: " + this.id + ", timestamp: " + this.timestamp + "}";
    }
}
