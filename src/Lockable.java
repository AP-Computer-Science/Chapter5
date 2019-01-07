public interface Lockable {
    void lock(int key);
    void unlock(int key);
    void setKey(int key);
    boolean isLocked();
}