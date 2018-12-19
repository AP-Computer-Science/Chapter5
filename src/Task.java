
import java.util.Scanner;

public class Task implements PriorityInterface, Complexity, Comparable{

    private int _priority = 0;
    private int _complexity = 0;
    private String _taskName;
    private Scanner _scan;
    public Task() {
        _scan = new Scanner(System.in);
        _taskName = _scan.nextLine();
    }
    public int getPriority() {
        return _priority;
    }

    public void setPriority(int pri) {
        _priority = pri;
    }
    public String toString() {
        return _priority + ":" + _complexity + ": " + _taskName;
    }

    public void setComplexity(int complexity) {
        _complexity = complexity;
    }

    public int getComplexity() {
        return _complexity;
    }

    public int compareTo(Object t) {
        /*
        If this._priority is higher, add 1, else add -1;
        If this._complexity is higher, add 1, else add 0;
        Key:
        2: Both more complex and higher priority.
        1: Priority is higher, but complexity is lower.
        0: Priority is not higher, but complexity is higher.
        -1: Priority is not higher, and complexity is not higher.
        */
        Task newObject = (Task)t;
        int priorityDifference = this.getPriority() - newObject.getPriority();
        int complexityDifference = this.getComplexity() - newObject.getComplexity();
        int result = 0;
        if(priorityDifference > 0) {
            result += 1;
        }
        else {
            result += -1;
        }
        if(complexityDifference > 0) {
            result += 1;
        }
        else {
            result += 0;
        }
        //System.out.println(result);
        return result;
    }
}