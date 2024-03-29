
package com.example.android.architecture.blueprints.todoapp.tasks;

/**
 * Defines the navigation actions that can be called from a list item in the task list.
 */
public interface TaskItemNavigator {

    void openTaskDetails(String taskId);
}
