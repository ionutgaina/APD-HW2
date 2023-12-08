/* Implement this class. */

import java.util.List;

public class MyDispatcher extends Dispatcher {

    public MyDispatcher(SchedulingAlgorithm algorithm, List<Host> hosts) {
        super(algorithm, hosts);
    }

    @Override
    public void addTask(Task task) {
        switch (algorithm) {
            case ROUND_ROBIN -> {

            }
            case SHORTEST_QUEUE -> {

            }
            case SIZE_INTERVAL_TASK_ASSIGNMENT -> {

            }
            case LEAST_WORK_LEFT -> {

            }
        }
    }
}
